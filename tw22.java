package one;

public class tw22 {

	public static void main(String[] args) {
		 int b=100110010;
	        
	        String str=String.valueOf(b);
	        
	        System.out.println(str.matches("[01]+"));//binary or not 
	        
	        String str1="456AB";
	        
	        System.out.println(str.matches("[0-9A-F]+"));//HEXADECIMAL or not 
	        
	        String str2="11/10/1999";
	        
	        System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));//DATE FORMAT

	}

}
