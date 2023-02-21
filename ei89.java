package one;

public class ei89 {

    static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    
    static void change2(int x,int value)
    {
        x=value;
    }

	public static void main(String[] args) {
		int A[]={2,4,6,8,10};//both array refernece to same object a change made reflects in both as object is passed
        
        change(A,2,20);
        
        for(int x:A)
        {
            System.out.println(x);
        }
        
        int x=10;
        
        change2(x,20);//here value is passed or copied so no change 
        
        System.out.println("Value of primitive"+x);
		

	}

}
