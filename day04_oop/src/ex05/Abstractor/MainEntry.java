package ex05.Abstractor;

class Point {  // 일반 클래스 
	int x , y;
	
	public void show() {  }
}

abstract class Shape {  // 추상 클래스
	
	public abstract void view();  // 추상메소드
	
	public void name() {  // 일반 메소드
		System.out.println("name is doyeon");
	}
}

class Trangle extends Shape {

	@Override
	public void view() {
		System.out.println("Trangle ");
	}
	
}

class Rect extends Shape {

	@Override
	public void view() {
		System.out.println("Rect ");
	}
	
}



public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
//		Shape sh = new Shape(); // 미완성 클래스 <--- 자체적으로 객체 생성할 수 없다.
		Shape  t = new Trangle();  // 단, 상속 받은 자손 클래스로는 객체 생성 할 수 있다
	}
}
