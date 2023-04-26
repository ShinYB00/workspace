package ex06.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

//  List : ���� �ְ�, �ߺ�����Ѵ�
public class VectorEx01 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length      /    capacity");
		System.out.println(v.size() + "    /     " + v.capacity());
		
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4);   // �ʱ�뷮, �����뷮
		System.out.println("length      /    capacity");
		System.out.println(v2.size() + "    /     " + v2.capacity());
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(22);
		v2.add(11);
		v2.add(89);
		v2.add(89);
		v2.add(89);
		v2.add(77);		
		System.out.println(v2.size() + "    /     " + v2.capacity());
		
		System.out.println("--------------- iterator() method --------------------");
		Iterator it = v2.iterator();
		while( it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------- get() method --------------------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		System.out.println("--------------- sort result --------------------");
		Collections.sort(v2);  // ��� ������� ����
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("--------------- elementsAt() method --------------------");
		for (int i = 0; i < v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num.toString());
		}
		
		System.out.println("--------------- trimToSize() method --------------------");
		System.out.println(v2.size() + "    /     " + v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size() + "    /     " + v2.capacity());
		
		Vector<String> hs = new Vector<String>();
		hs.add("Ű����");		
		hs.add("��");		
		hs.add("���콺");
		hs.add("����");			
		hs.add("Ű����");
		System.out.println("��� ���� : " + hs.size());  //
		System.out.println(hs);
	}
}








