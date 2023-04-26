package ex01.argument;

public class MainEntry {
	
	public static void main(String[] args) {
		int result = plus(1,2);
		System.out.println(result);
		
		System.out.println(plus(10, 20));
		
		System.out.println(plus(1,2,3, 4, 5,6));
		System.out.println(plus(1,2,3));
		System.out.println(plus(1,2,3, 4));
		System.out.println(plus(1,2,3, 7, 8, 9, 10));
		
		MainEntry me = new MainEntry();  // 객체생성, 메모리에할당, 생성자함수자동호출
		me.name();  // instance method
	
		int re = me.plus(55,77,88);  // static method
		System.out.println(re);
	}
	
	public void name() {  // instance
		System.out.println("happy doyeon");
	}
	public static int plus(int ... num) {  // static 
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return  sum;
	}
	
//	private static char[] plus(int i, int j, int k, int l, int m, int n) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static char[] plus(int i, int j, int k) {
//		return i+j+k;
//	}
//
//	public static int plus(int x, int y) {
//		int hap = x + y;
//		return hap;
//	}
}
