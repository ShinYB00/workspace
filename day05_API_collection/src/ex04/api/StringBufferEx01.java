package ex04.api;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer  sb = new StringBuffer();   // 초기 용량 16
		
		System.out.println(sb.hashCode());  // 366712642
		
		System.out.println("length        /           capacity");
		int len = sb.length();		int size = sb.capacity();
		System.out.println(len + "              /               " + size);
		System.out.println("----------------------------------------------");
		
		sb.append("kosta");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "              /               " + size);
		System.out.println("----------------------------------------------");
		
		sb.append("happyvirus");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "              /               " + size);    //  15         16
		System.out.println("----------------------------------------------");
		
		sb.append("1234567890");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "              /               " + size);
		System.out.println("----------------------------------------------");
		
		sb.append("1234567890 ejriwjeirj fdsk");
		System.out.println(sb.hashCode());  // 366712642
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "              /               " + size);
		System.out.println("----------------------------------------------");
		
		sb.trimToSize();  // 메모리 공간 사이즈에 맞게 재조정
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "              /               " + size);
	}
}
