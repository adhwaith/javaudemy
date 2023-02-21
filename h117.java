package one;
class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class h117 {

	public static void main(String[] args) {
		Super s1=new Super();
		s1.display();
		Sub s2=new Sub();
		s2.display();
		Super s=new Sub();
        s.display();
		

	}

}
