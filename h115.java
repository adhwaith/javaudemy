package one;
class Paren
{
    Paren()
    {
        System.out.println("Non-Param of parent");
    }
    Paren(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Chil extends Paren
{
    Chil()
    {
        System.out.println("Non-Param of child");
    }
    Chil(int y)
    {
    	//super(y);
        System.out.println("Param of child " +y);
    }
    Chil(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class h115 {

	public static void main(String[] args) {
		Chil c=new Chil();
		Chil c1=new Chil(20);
		Chil c2=new Chil(10,20);
		

	}

}
