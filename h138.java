package one;

class Test5 {//if we make the class final it cannot be extended
    public final void show()
    {
        System.out.println();
    }
}

class Test1 extends Test5
{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class h138 {

	public static void main(String[] args) {
		

	}

}
