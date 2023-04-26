package ex02.api;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.hashCode());  // 78786452
		System.out.println(s2.replace("EO", "korea"));  // SkoreaUL
		System.out.println(s2.hashCode()); //??? 78786452
		System.out.println("-------------------------------------");
		s2 = s2.replace("EO", "korea");
		System.out.println(s2.hashCode());  // -1910762226
		System.out.println("=============================");
		
		//s1 = s2.concat(s1);    // 문자열 결합
		s1 = s1 + s2 ;  
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println("=============================");
		
		String s3 = new String("       ab          cd          ");
		System.out.println("length = " + s3.length() );  // 문자열 길이
		
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n=============================");
		s3 = s3.trim();   // 공백제거
		System.out.println("length = " + s3.length() );
		System.out.println("\n=============================");
		
		String s4 = new String("ab/cdefghk/93837/gkeiwy/2392873");
		//String s4 = new String("abc defgh k93837g keiwy2 392873");
		String[] s5 = s4.split("/");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		} // for end
		System.out.println("\n=============================");
		
		String s6 = "123-4567-8952";
		String[] s7 = s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		} // for end
		System.out.println("\n=============================");
		
		String s8 = "1234567890abcdef     345566    77888    string";
		char ch = s8.charAt(10);   //
		System.out.println(ch);
		
		s8 = s8.substring(3);
		System.out.println(s8);  // 3번 인덱스부터 끝까지 출력
		
		s8 = s8.substring(5, 7); // 시작값 포함, 끝값 미포함 
		System.out.println(s8); //
		System.out.println("\n=============================");
		
		 s8 = "1234567890abcdef     345566    77d888    string";
		 System.out.println(s8.indexOf('d'));  // 13
		 System.out.println(s8.lastIndexOf('d'));  // 33
		 System.out.println("\n=============================");
		 
		 System.out.println("소문자 출력 toLowerCase() : " + s2.toLowerCase());
		 System.out.println("대문자 출력 toUpperCase() : " + s1.toUpperCase());
		 System.out.println(s2);  // ??
		 System.out.println("\n=============================");
		 
		 System.out.println(s1.length()); // 문자열 길이
		 char[] ch2 = s1.toCharArray();  
		 
		 for(int i=0; i < s1.length(); i++ ) {
			 System.out.print(ch2[i] + "\t");
		 }
		 System.out.println();
	}
}




