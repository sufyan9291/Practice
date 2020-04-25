package mypack;

import java.util.HashMap;

public class ImmutableKeyPractice {
	
	//Student s = new Student(1, "sss");

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(1, "Sufyan");
		HashMap<Student, Integer> myMap = new HashMap<Student, Integer>();
		myMap.put(s1, 111);
		//s1.setName("Shazi");
		Student s2 = s1.clone();
		System.out.println(myMap.get(s2));

	}

}

class Student implements Cloneable{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public Student clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Student)super.clone();
	}
	
	
}