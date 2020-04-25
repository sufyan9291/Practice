package barclays;

class Employee implements Cloneable{
	private String name;
	private Address add;
	public Employee(String name, Address add) {
		this.name = name;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee clonedEmp = (Employee)super.clone();
		clonedEmp.setAdd(new Address(this.getAdd().getStreet()));
		return clonedEmp;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", add=" + add.getStreet() + "]";
	}
	/*public Employee getClone() throws CloneNotSupportedException{
		return (Employee)this.clone();
	}*/
}

class Address {
	private String street;
	public Address(String street) {
		this.street = street;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}

class CloningPractice {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("faizan", new Address("Green Park"));
		Employee e2 = (Employee)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		//e1.setName("sufyan");
		e1.getAdd().setStreet("Manik Bagh");
		System.out.println(e1);
		System.out.println(e2);
	}

}
