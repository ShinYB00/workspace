package ex06.Abstractor;

public abstract class Shape {  // super class
	double result = 0;
	
	public abstract double calc();
	public abstract void draw();
	
	public abstract void show(String name);
}
