package ex02.api;

public class StringMain {
	public static void main(String[] args) {
		int x = 3,  y = 5;
		System.out.println("x = " + x + ", y = " + y);
		x = y;
		System.out.println("x = " + x + ", y = " + y);
		
		String str1 = "korea";
		String str2 = "happy";
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashCode = " + str1.hashCode() + "\t , " + str2.hashCode());
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		str1 = str2;
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashCode = " + str1.hashCode() + "\t , " + str2.hashCode());
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		str1 = "virus";
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
		System.out.println("hashCode = " + str1.hashCode() + "\t , " + str2.hashCode());
		System.out.println("++++++++++++++++++++++++++++++++++");
		
	}
}






