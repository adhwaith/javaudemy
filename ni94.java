package one;

public class ni94 {
	 static int reverse(int n)
	    {
	        int rev=0,r;
	        
	        while(n>0)
	        {
	        	r=n%10;
	            rev=rev*10+r;
	            n=n/10;
	        }
	        return rev;
	    }

	public static void main(String[] args) {
		
		int num=786;
		System.out.println(reverse(num));
		

	}

}
