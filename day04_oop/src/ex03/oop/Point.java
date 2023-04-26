package ex03.oop;

public class Point {  //extends Object {
	
	protected int x, y;
	
	public Point(int y) {
		this.y = y;
		System.out.println("Point - 1");
	}

	public Point() {
		x = y = 8;
		System.out.println("Point - 0");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point - 2");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
		//System.out.println(getX() + ", " + getY());
	}
	
	public String toString() {
		return x + ", " + y;
	}
	
}






