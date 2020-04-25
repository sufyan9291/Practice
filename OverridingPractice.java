package barclays;

class OmerParent{
	int sum = 0;
	private int total = 2;
	void print(){
		System.out.println(sum);
	}
	void show(){
		System.out.println(total);
	}
} 

class OmerChild extends OmerParent{
	int sum = 1;
	private int total = 3;
	void print(){
		System.out.println(sum);
	}
}

class OverridingPractice {
	 public static void main(String[] args) {
		 OmerParent op = new OmerChild();
		 op.print();
		 System.out.println(op.sum);
		 new OmerChild().show();
	}

}
 
 
