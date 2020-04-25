package barclays;

class Test {
	public void show(int x){
		x = 9;
		System.out.println(x);
	}
	public static void main(String[] args) {
		int s = 2;
		new Test().show(s);
		System.out.println(s);
		/*String s1 = "hello";
		String s2 = "HELLO";
		System.out.println(s1.equals(s2));*/
	}
	
}
