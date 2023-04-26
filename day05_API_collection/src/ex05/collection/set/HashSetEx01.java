package ex05.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수: " + hs.size());
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String s: hs) {
			System.out.println("s = " + s);
		}
	}
}
