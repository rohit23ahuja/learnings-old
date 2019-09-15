package java.learning.equals.hashcode;

public class Employee {
	String name;
	
	@Override
	public boolean equals(Object o) {
		System.out.println("Calling equals");
		if(this==o) return true;
		if (o==null) return false;
		if(o.getClass() != this.getClass())  return false;
		Employee e = (Employee) o;
		return this.name.equals(e.name);
	}
	
	@Override
	public int hashCode() {
		int hash = 31*7;
		hash = hash + (name==null? 0: name.hashCode());
		return hash;
	}
	
}
