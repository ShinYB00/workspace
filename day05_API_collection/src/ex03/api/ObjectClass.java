package ex03.api;

class Point {   }

public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt. hashCode());   // 366712642
		System.out.println("Object String : " + pt.toString());
		System.out.println("Object String : " + pt );
		System.out.printf("10���� %d\n", 0x15db9742);  // ����,  0����,  0x����
		System.out.println("==============================");
		
		Point pt2 = new Point();
		System.out.println("Point pt2 information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2. hashCode());   // 1163157884
		System.out.println("Object String : " + pt2.toString());
		System.out.println("Object String : " + pt2 );
		System.out.println("==============================");
		
		System.out.println("pt2.toString() :  toString()�� �ǹ�");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));
		System.out.println("---------------------------------------------------------------------------");
		
		Point pt3 = new Point();
		
		if( pt.hashCode() == pt3.hashCode() ) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		Point pt4;
		pt4 = pt;   // ?? 
		
		if( pt.hashCode() == pt4.hashCode() ) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}
}






