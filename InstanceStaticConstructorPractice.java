package barclays;

public class InstanceStaticConstructorPractice {
	public InstanceStaticConstructorPractice(){
		System.out.println("in constructor");
	}
	static{
		System.out.println("in static");
	}
	{
		System.out.println("in instance...2");
	}
	{
		System.out.println("in instance");
	}
	
	public static void main(String[] args) {
		new InstanceStaticConstructorPractice();

	}

}
