package one;
class Te
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()
    {
        System.out.println(x);
    }
}

public class h132 {

	public static void main(String[] args) {
		Te t1=new Te();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Te t2=new Te();
        t2.show();

	}

}
