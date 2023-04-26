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
		System.out.println("»ï°¢Çü ³ÐÀÌ : " + result + " ÀÎ »ï°¢ÇüÀ» ±×·È½À´Ï´Ù.");

	}

	@Override
	public void show(String name) {
		System.out.println(name + "ÀÇ ³ÐÀÌ : " + result + " ÀÎ " + name + "À» ±×·È½À´Ï´Ù.");
	}


}
