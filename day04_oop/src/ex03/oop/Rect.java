package ex03.oop;

public class Rect extends Point {
	private int x2, y2;
	
	//생성자함수 2개정도
	public Rect() {
		x2 = y2 = 10;
	}

	public Rect(int y, int x2, int y2) {
		super(y);
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rect(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rect(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
	}

	// setter / getter
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	// output
	public void display() {
		System.out.println("x = " + x + ", y = " + y + ", x2 = " + x2 + ", y2 = " + y2);
	}
	
	
}










