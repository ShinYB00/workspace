package ex07.Interface;

interface A {  // interface - abstract method, final field 만 갖는다
	int x = 90;  // final static int x  = 90;
	final int y = 77;
	char ch = 'A';
	
	// abstract method 만 갖는다. - abstract 생략가능함
	public void show();  // public abstract void show();
	public abstract void disp();
} // A end

interface B {
	void bView();
} // B end

interface C {
	String name = "happy";
	public void draw();
} // C end

interface D extends B {  // interface 간에 상속에서도 extends 키워드 사용한다
	void dView();
} // D end

class Rect implements D {

	@Override
	public void bView() {  //
		
	}

	@Override
	public void dView() {  //
		
	}
	
	public void rView() {
		System.out.println("rect view");
	}
}

class Shape {
	
}

class Multi extends Shape implements B, C, A {  //

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		// 1. 자신으로 객체 생성
		Rect  r1 = new Rect();
		
		//2. 부모로 객체 생성
		D  r2 = new Rect();
		B r3 = new Rect();

	}
}














