package ex05.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ű����");
		hs.add("��");
		hs.add("���콺");
		hs.add("����");
		hs.add("Ű����");
		
		System.out.println("��� ����: " + hs.size());
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
