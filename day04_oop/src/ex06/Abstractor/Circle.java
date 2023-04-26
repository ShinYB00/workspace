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
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다.");

	}

	@Override
	public void show(String name) {
		System.out.println(name + "의 넓이 : " + result + " 인 " + name + "을 그렸습니다.");
	}

}
