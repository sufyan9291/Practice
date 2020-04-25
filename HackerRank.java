package barclays;

interface HackerRankIntf{
	public void show();
}
class HackerRankParent{
	public void show() {
		System.out.println("hello");
	}
}

abstract class gh implements HackerRankIntf{
	
}

abstract class qw extends HackerRankParent{
	
}
 class HackerRank extends HackerRankParent implements HackerRankIntf{
	
	public static void main(String[] args) {
		new HackerRank().show();
	}
}
