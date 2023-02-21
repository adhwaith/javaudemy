package one;
class Oute
{
    static int x=10;
    Inner i=new Inner();
    
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
        
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class h128 {

	public static void main(String[] args) {
		 Oute.Inner oi=new Oute().new Inner();//directly access inner class
	     oi.innerDisplay();

	}

}
