package ex06.Abstractor;

public class Triangle extends Shape { // sub class

	int w =10, h = 20;
	
	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("�ﰢ�� ���� : " + result + " �� �ﰢ���� �׷Ƚ��ϴ�.");

	}

	@Override
	public void show(String name) {
		System.out.println(name + "�� ���� : " + result + " �� " + name + "�� �׷Ƚ��ϴ�.");
	}


}
