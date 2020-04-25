package mypack;

class A {
	static void method() { 
		System.out.println("A");
	}
}

class B extends A {
	static void method(){
		System.out.println("B");
	}
}

class C extends B {
	static void method(){ 
		System.out.println("C"); 
	}
}
public class StaticOverriding {

	public static void main(String[] args) {
		//A a = new B(); a.method();
		//B a = new B(); a.method();
		//C a = new B(); a.method();

		//B a = new A(); a.method();
		//B a = new B(); a.method();
		//B a = new C(); a.method();

		//C a = new A(); a.method();
		C a = new B(); a.method();
		//C a = new C(); a.method();
	}

}
