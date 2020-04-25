package barclays;

import java.util.ArrayList;
import java.util.List;

class GenericParent{}

class GenericChild extends GenericParent{}

public class GenericsPractice {
	public static void main(String[] args) {
		List<? extends GenericParent> list = new ArrayList<GenericChild>();
		list.add(new GenericChild());
	}
}
