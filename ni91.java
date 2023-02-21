package one;

public class ni91 {
    int gcd(int m,int n)
   {
       while(m!=n)
       {
           if(m>n) {
        	   m=m-n;
           }
           else {
        	   n=n-m;
           }
       }
       return m;
   }

	public static void main(String[] args) {
		 	ni91 x=new ni91();
	        System.out.println(x.gcd(35,56));
		

	}

}
