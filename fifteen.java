package one;

public class fifteen {

	public static void main(String[] args) {
		
        String str5="Java Program";
        System.out.println(str5);
        
        String str6=new String("JAVA");
        System.out.println(str6);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c,1,3);
        System.out.println(str3);
        String str7=new String(c);
        System.out.println(str7);
        
        
        byte b[]={65,66,67,68};
       
        String str4=new String(b,1,2);//startig index(1st parameter) and number of index(2nd parameter)
        System.out.println(str4);
        String str8=new String(b);
        System.out.println(str8);
        
        
        String str1="Java";
        String str10="Java";
        String str2=new String("Java");
        System.out.println(str1==str2);
        System.out.println(str1==str10);

	}

}
