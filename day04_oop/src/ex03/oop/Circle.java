package ex03.oop;

public class Circle extends Point {
	private int  r;
//	private Point pt;  // == super
	
	public Circle() {
		r = 5;
		System.out.println("Circle - 0");
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;		this.y = y;		this.r = r;
		System.out.println("Circle - 3");
	}

	public Circle(int x,  int r) {
		this.x = x;		this.r = r;
		System.out.println("Circle - 2");
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
		//System.out.println("x = " +  super.getX() + ", y = " + super.getY() + ", r = " + r);
		//System.out.println(getX() + ", " + getY());
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	
	
}










