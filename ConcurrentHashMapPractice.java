package mypack;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("A", "A");
		chm.get("A");
	}

}
