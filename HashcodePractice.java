package barclays;

import java.util.HashSet;
import java.util.Set;

class HashcodePractice {

	public static void main(String[] args) {
		NewTest t1 = new NewTest();
		NewTest t2 = t1;
		String s1 = new String("abc");
		String s2 = new String("abc");
		Set<String> s = new HashSet<String>();
		System.out.println(s.add(s1));
		System.out.println(s.add(s2));
	}

}

class NewTest{
	
}