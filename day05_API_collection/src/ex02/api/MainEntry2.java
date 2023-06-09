package ex02.api;

public class MainEntry2 {
	public static void main(String[] args) {
		
		String s1 = new String("Korea");
		String s2 = new String("Korea");
		
		int x = 3, y = 3;
		
		String s3 = "Korea";	// Heap영역에 만들어진 "Korea"의 주소를 Stack영역에서 s3과 s4가 공유
		String s4 = "Korea";
		
		if (s1==s2) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1!=s2");
		}
		
		System.out.println("======================================");
		
		if (x==y) {
			System.out.println("x==y");
		} else {
			System.out.println("x!=y");
		}
		
		System.out.println("======================================");
		
		if (s3==s4) {
			System.out.println("s3==s4");
		} else {
			System.out.println("s3!=s4");
		}
		
		System.out.println("======================================");
		
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		} else {
			System.out.println("s1!=s2");
		}
		
		System.out.println("======================================");
		
		s3 = "Seoul";
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		
		if (s3==s4) {
			System.out.println("s3==s4");
		} else {
			System.out.println("s3!=s4");
		}
		
		System.out.println("======================================");
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1.length() = " + sb1.length() + ", sb1.capacity() = "+ sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb2.length() = " + sb2.length() + ", sb2.capacity() = "+ sb2.capacity());
		
		System.out.println("======================================");
		
		sb2.append("append1");
		System.out.println("sb2.hashCode() = " + sb2.hashCode());
		
		sb2.append("append2");
		System.out.println("sb2.hashCode() = " + sb2.hashCode());
		
	}
}
