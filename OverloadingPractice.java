package barclays;

public class OverloadingPractice {
	/*void print(int a){
		System.out.println("in int");
	}*/
	void print(double a){
		System.out.println("in double");
	}
	void print(long a){
		System.out.println("in long");
	}
	public static void main(String[] args) {
		new OverloadingPractice().print(new Integer(3));
	}
}
