package barclays;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
		
		String str1 = new String("babloo");
		String str2 = new String("babloo");
		System.out.println(str1==str2);
		System.out.println(s1.equals(s2));
		
		/*System.out.println(new StringTest());
		System.out.println(new StringTest());*/
	}
}
