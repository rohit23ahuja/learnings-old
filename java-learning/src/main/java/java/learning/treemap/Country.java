package java.learning.treemap;

public class Country implements Comparable<Country>{
	private String name;

	public Country(String name){
		this.name=name;
	}
	@Override
	public int compareTo(Country o) {
		if (this==null && o==null) {
			return 0;
		} else if(this!=null&&o==null){
			return -1;
		} else if(this==null&&o!=null) {
			return 1;
		}
		return this.getName().compareTo(o.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
