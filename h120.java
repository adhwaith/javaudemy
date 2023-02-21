package one;
class Supe
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Su extends Supe
{
    
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }
    
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class h120 {

	public static void main(String[] args) {
		Supe su=new Su();
	       
        su.meth1();
        su.meth2();
		

	}

}
