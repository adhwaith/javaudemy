package one;

import java.util.Scanner;

public class fi50 {

	public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
	       System.out.println("Enter a Number");
	       int n=scan.nextInt();
	       int r;
	       int rev=0;
	       while(n>0)
	       {
	        r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	        
	       }
	       System.out.println("reversed number is "+rev);

	}

}
