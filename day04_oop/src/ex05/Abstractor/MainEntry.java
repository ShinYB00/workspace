package ex05.Abstractor;

class Point {  // �Ϲ� Ŭ���� 
	int x , y;
	
	public void show() {  }
}

abstract class Shape {  // �߻� Ŭ����
	
	public abstract void view();  // �߻�޼ҵ�
	
	public void name() {  // �Ϲ� �޼ҵ�
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
//		Shape sh = new Shape(); // �̿ϼ� Ŭ���� <--- ��ü������ ��ü ������ �� ����.
		Shape  t = new Trangle();  // ��, ��� ���� �ڼ� Ŭ�����δ� ��ü ���� �� �� �ִ�
	}
}
