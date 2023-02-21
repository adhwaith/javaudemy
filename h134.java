package one;

class T
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class h134 {

	public static void main(String[] args) {
		//T t=new T();
        System.out.println("Main");
        T t=new T();
		

	}

}
