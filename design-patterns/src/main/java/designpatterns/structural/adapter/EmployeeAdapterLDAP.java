package designpatterns.structural.adapter;

public class EmployeeAdapterLDAP implements Employee {
	private EmmployeeLDAP instance;

	public EmployeeAdapterLDAP(EmmployeeLDAP instance) {
		super();
		this.instance = instance;
	}

	public String getId() {
		return instance.getCn();
	}

	public String getFirstName() {
		return instance.getGivenName();
	}

	public String getLastName() {
		return instance.getSurName();
	}

	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String toString() {
		return "EmployeeAdapterLDAP [instance=" + instance + "]";
	}
}
