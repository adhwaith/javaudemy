package one;

import java.util.Scanner;

public class fi51 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	       System.out.println("Enter a Number");
	       int n=scan.nextInt();
	       int m=n;
	       int r;
	       int rev=0;
	       while(n>0)
	       {
	        r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	        
	       }
	       if(rev==m) {
	    	   System.out.println(m +" is palindrome");

	    	   
	       }
	       else {
	    	   System.out.println(m +" is not palindrome");
	    	   
	       }
	       
	       
	}

}
