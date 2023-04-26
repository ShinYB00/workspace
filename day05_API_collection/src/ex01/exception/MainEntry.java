package ex01.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("su1, su2 = ");
		int su1 = new Scanner(System.in).nextInt();
		int su2 = new Scanner(System.in).nextInt();
		System.out.println("op(+,-,*,/) = ");
		char op = new Scanner(System.in).next().charAt(0);
		
		int result = 0;
		try {
			if(op == '+') {result = su1 + su2;} 
			else if(op == '-') {result = su1 - su2;} 
			else if(op == '*') {result = su1 * su2;}
			else if(op == '/') {result = su1 / su2;}
		} catch (Exception e) {
			System.out.println("*error: " + e.getMessage());
			e.printStackTrace();
		}
		
	
		
//		if(op == '+') {result = su1 + su2;} 
//		else if(op == '-') {result = su1 - su2;} 
//		else if(op == '*') {result = su1 * su2;}
//		else if(op == '/') {
//			if (su2==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				System.exit(0);
//			} else {
//			result = su1 / su2;
//			}
//		}
		
		System.out.println("\n\n" + su1 + op + su2 + " = " + result);
	}
}
