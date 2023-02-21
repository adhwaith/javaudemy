package one;
abstract class Sup
{
    public Sup() { System.out.println("Super Constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();
}

class S extends Sup
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}

public class h121 {

	public static void main(String[] args) {
		Sup s=new S();
        s.meth1();
        s.meth2();
		
		

	}

}
