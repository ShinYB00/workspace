package ex04.api;

public class StringChange {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		String result="";
		
		for(int i=0; i < str.length() ; i++ ) {
			
			char ch = str.charAt(i);  //
			
			if( ch >= 'A'  && ch <= 'Z'  ) {
				result += String.valueOf(ch).toLowerCase(); 
			} else if( ch >= 'a'  && ch <= 'z'  ) {
				result += String.valueOf(ch).toUpperCase(); 
			} else {
				result += ch ;
			} // if end
		} // for end
		
		System.out.println( result );
	}
}



