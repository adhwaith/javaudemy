package one;

import java.util.Scanner;

public class th33 {

	public static void main(String[] args) {
		 	Scanner scan=new Scanner(System.in);
	        
	        System.out.println("Enter Domain name");
	        String domain=scan.nextLine();
	        
	        String ext=domain.substring(domain.lastIndexOf(".")+1);
	        
	        switch(ext)
	        {
	            case "com": System.out.println("Commercial");
	                        break;
	            case "org": System.out.println("Organisation");
	                        break;
	                        
	            case "gov": System.out.println("Government");
	                        break;
	            case "net": System.out.println("Network");
	                        break;
	        }
	     

	}

}
