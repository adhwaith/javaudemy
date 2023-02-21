package one;

class O
{
    int x=10;
    static int y=20;
    
    static class M
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}
public class h131 {

	public static void main(String[] args) {
		 O.M m=new O.M();
	     m.show();
		

	}

}
