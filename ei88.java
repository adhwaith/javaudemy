package one;

public class ei88 {
	 static void inc(int x)
	    {
	        x++;//formal parameter
	        System.out.println(x);//actual parameter are copied to formal parameter on method call 
	    }

	public static void main(String[] args) {
		 	int a=10;
	        inc(a);//actual parameter
	        System.out.println(a);
		

	}

}
