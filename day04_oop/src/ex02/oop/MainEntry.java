package ex02.oop;

class Point {
	private int x, y;  // 멤버변수 , int : 0, floatting : 0.0, String : null
	
	// constructor
	public Point(int x) {
		this(x, 999);
//		this.x = x;
//		y = 999;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {  // default constructor 
//		x = y = 100;
		this(100, 100);
	}
	
	// getter / setter method
	public int getX() {		return x;	}
	public int getY() {		return y;	}
	public void setX(int x) {  this.x = x;  }
	public void setY(int y) {  this.y = y;  }
	// output method - user method
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
		//System.out.println(getX() + ", " + getY());
	}
	
} // end Point


public class MainEntry {
	public static void main(String[] args) {
		
		Point pt3 = new Point(1, 2);
		pt3.display();
		
		Point pt4 = new Point(8888);
		pt4.display();
		
		
//		int su; 
//		System.out.println(su);  // local variable su may not have been initialized
		
		Point pt = new Point();  // 객체생성, 메모리에할당, 생성자함수자동호출
		pt.display();
//		System.out.println(pt.getX());
//		System.out.println(pt.getY());
		pt.setX(100);		pt.setY(30);
		pt.display();
		//System.out.println(pt.getX() + ", " + pt.getY());
//		System.out.println(pt.x);
//		System.out.println(pt.y);
		
		Point pt2 = new Point();  // 객체생성, 메모리에할당, 생성자함수자동호출
		pt2.display();
		System.out.println(pt);
		System.out.println(pt2);
		
	}
}







