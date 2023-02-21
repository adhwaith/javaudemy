package one;

public class se75 {

	public static void main(String[] args) {
		int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1;
        
        max1=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }
        System.out.println(max1);
                

	}

}
