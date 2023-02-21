package one;

public class ni99 {
	static int max(int ...A)
    {
        if(A.length==0) {//zero argument also allowed so this included
        	return Integer.MIN_VALUE;
        }
        int max=A[0];
        for(int i=1;i<A.length;i++) {
        	  if(A[i]>max) {
        		  max=A[i];
        	  }
              
             
        	
        }
        return max;
          
        
    }

	public static void main(String[] args) {
		System.out.println(max(3,4,5,23,56,78));
		System.out.println(max());
		

	}

}
