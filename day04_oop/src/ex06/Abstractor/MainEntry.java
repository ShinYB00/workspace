package ex06.Abstractor;

public class MainEntry {
	public static void main(String[] args) {
		// 3. �迭 �̿��� ����
		Shape[] ss = new Shape[3];
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rect", "�ﰢ��" };
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		
		// 2. Shape �θ� �߻� Ŭ���� �̿��ؼ� ��ü ����
		Shape s = new Circle();
		s.show("Circle");
		s = new Rectangle();
		s.show("�簢��");
		s = new Triangle();
		s.show("Triangle");
		
		// 1. �� Ŭ������ ��ü ���� ���
//		Triangle t = new Triangle();
//		t.draw();
		
		// 2. �θ� Ŭ������ ��ü ���� ���
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
