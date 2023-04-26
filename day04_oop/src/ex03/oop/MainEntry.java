package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		Rect r1 = new Rect(22, 33);
		//r1.display();
		System.out.println(r1);
		System.out.println("************************");
		Rect r2 = new Rect();
		r2.display();
		
		System.out.println("--------------------");
		Circle c1 = new Circle();
		c1.display();
		System.out.println("==================");
		Circle c2 = new Circle(1,2,3);
		c2.display();
		System.out.println("==================");
		Circle c3 = new Circle(10,20);
		c3.display();
		
		System.out.println("==================");
		Point pt = new Point(20);
		pt.display();
		System.out.println(pt.toString());
		System.out.println(pt);
//		
//		Point pt2 = new Point();
//		pt2.display();
	}
}
