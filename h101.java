package one;

public class h101 {
	 static double sum(double ...P)
	    {
	        double sum=0;
	        
	        for(int i=0;i<P.length;i++) {
	        	sum+=P[i];
	        	
	        	
	        }
	            
	        
	        if(sum<500) {
	        	return sum*0.10;
	        }
	        else if(sum>=500 && sum<1000) {
	        	return sum*0.15;
	        }
	        else {
	        	return sum*0.20;
	        }
	        
	    }

	public static void main(String[] args) {
		System.out.println(		sum(500.0,400.0));
		

	}

}
