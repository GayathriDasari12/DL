package Day18.di_constructor;

public class Employee {
	private String name;
	private String address;
	private int id;
	
	
	//rc source generate const using fields select all

	public Employee(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +"\t" + this.address + "\t" + this.id;
	}
	
}


