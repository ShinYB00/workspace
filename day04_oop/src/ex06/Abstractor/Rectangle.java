package ex06.Abstractor;

public class Rectangle extends Shape { // sub class

	int w =3, h = 5;
	
	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("�簢�� ���� : " + result + " �� �簢���� �׷Ƚ��ϴ�.");

	}

	@Override
	public void show(String name) {
		System.out.println(name + "�� ���� : " + result + " �� " + name + "�� �׷Ƚ��ϴ�.");
		
	}

}
