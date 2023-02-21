package one;

public class se78 {

	public static void main(String[] args) {
		int A[]={8,6,10,9,2};
        
        System.out.println("Length of A="+A.length);
        
        int B[]=new int[10];
        
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]);//empty spaces taken as garbage which is zero here
        }
        
        //A=B;
        
        System.out.println("Length of A="+A.length);

	}

}
