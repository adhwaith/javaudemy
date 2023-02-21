package one;

public class tw23 {

	public static void main(String[] args) {
		String str="a!B@c#1$2%3";
        
        str=str.replaceAll("[^a-zA-Z0-9]", "");//remove special characters
                
        System.out.println(str);
        
        String str1="      abc     def     gh   ijk    ";
        
        str1=str1.replaceAll("\\s+", " ").trim();//trime removes tailing and leading zeroes
        System.out.println(str1);
        String words[]=str1.split("\\s");
        
        System.out.println(words.length);
        

	}

}
