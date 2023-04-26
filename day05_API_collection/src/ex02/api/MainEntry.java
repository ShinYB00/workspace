package ex02.api;

import  java.lang.*;  //

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println(ch);  // 
		System.out.println(str.charAt(2));  // 
		
		char[] data = { 'k', 'b', 's' };
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");
		
		String msg = "defghijklmn";
		System.out.println("korea " + msg);  // korea defghijklmn
		System.out.println(msg);
		
		String str2 = "abcdef".substring(2);  // cdef
		System.out.println(str2);
		
		str2 = "abcdefghijklmn".substring(2, 5);  // 시작값 포함, 끝값 미포함 
		System.out.println(str2);  //cde
		
		System.out.println(msg + " : " + str2); 
		
		System.out.println("===============================");
		Point  p1 = new Point();
		Point  p2 = new Point();
		
		System.out.println("p1.hashCode() : " + p1.hashCode());
		System.out.println("p2.hashCode() : " + p2.hashCode());
		System.out.println("************************************************");
		
		String s1 = new String("kosta");
		String s2 = new String("kosta");
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
	}
}

class Point  extends Object {
	
}
	





