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
		System.out.println("사각형 넓이 : " + result + " 인 사각형을 그렸습니다.");

	}

	@Override
	public void show(String name) {
		System.out.println(name + "의 넓이 : " + result + " 인 " + name + "을 그렸습니다.");
		
	}

}
