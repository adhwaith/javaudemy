package one;

import java.util.Scanner;

public class fo47 {

	public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
	       System.out.println("Enter a Number");
	       int n=scan.nextInt();
	       int r;
	       while(n>0)
	       {
	        r=n%10;
	        n=n/10;
	        System.out.println(r);
	       }
	       

	}

}
