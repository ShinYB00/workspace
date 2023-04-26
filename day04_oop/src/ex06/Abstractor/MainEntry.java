package ex06.Abstractor;

public class MainEntry {
	public static void main(String[] args) {
		// 3. 배열 이용한 형태
		Shape[] ss = new Shape[3];
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rect", "삼각형" };
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		
		// 2. Shape 부모 추상 클래스 이용해서 객체 생성
		Shape s = new Circle();
		s.show("Circle");
		s = new Rectangle();
		s.show("사각형");
		s = new Triangle();
		s.show("Triangle");
		
		// 1. 각 클래스로 객체 생성 방법
//		Triangle t = new Triangle();
//		t.draw();
		
		// 2. 부모 클래스로 객체 생성 방법
//		Shape c = new Circle();
//		c.draw();
//		
//		System.out.println("==============");
//		Shape sh = new Rectangle();
//		sh.draw();
//		
//		sh = new Circle();
//		sh.draw();
//		sh = new Triangle();
//		sh.draw();
	}
}
