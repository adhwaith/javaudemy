package one;

public class ni95 {
	 	static boolean validate(String name)
	    {
	        return name.matches("[a-zA-Z\\s]+");
	    }
	    
	    
	    static boolean validate(int age)
	    {
	        return age>=3 && age<=15;
	    }

	public static void main(String[] args) {
		
		String n="Adhwaith K";
		int a=14;
		System.out.println(validate(n));
		System.out.println("student:"+validate(a));

	}

}
