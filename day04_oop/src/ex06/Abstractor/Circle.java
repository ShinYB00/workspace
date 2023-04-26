package ex06.Abstractor;

public class Circle extends Shape {  // sub class
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("���� ���� : " + result + " �� ���� �׷Ƚ��ϴ�.");

	}

	@Override
	public void show(String name) {
		System.out.println(name + "�� ���� : " + result + " �� " + name + "�� �׷Ƚ��ϴ�.");
	}

}
