package one;
class Outer
{
    static int x=10;
    //Inner i=new Inner();we can create the method here also
    
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        Inner i =new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class h127 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerDisplay();
		

	}

}