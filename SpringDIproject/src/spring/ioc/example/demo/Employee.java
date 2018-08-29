package spring.ioc.example.demo;

public class Employee {

	private int empId; // instance variable
	// a variable is declared inside class and outside the a method.
	private String empName;

	private Address address;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	public Employee() {
		System.out.println("default cons is called !!");
	}

	public Employee(int empId, String name, Address address) {
		this.empId = empId;
		this.empName = name;
		this.address = address;
		System.out.println("parameter constructor");
	}

	public static void main(String[] args) {

		Address addr = new Address("usa", 23322);
		Employee emp = new Employee(101, "mohan", addr);

	}
}

