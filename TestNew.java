package barclays;

import java.util.HashSet;
import java.util.Set;

public class TestNew {

	public static void main(String[] args) {
		int i=2;
		int j=2;
		//System.out.println(i==j);
		Set<Integer> s = new HashSet<Integer>();
		System.out.println(s.add(new Integer(2)));
		System.out.println(s.add(new Integer(2)));
		//System.out.println(new Integer(2)==new Integer(2));
		
	}

}
