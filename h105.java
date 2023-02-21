package one;
class Rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}
public class h105 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=10;
        
        System.out.println("Area "+r.area());
        System.out.println("perimeter "+r.perimeter());
        
        System.out.println("Is it a Square "+r.isSquare());
		

	}

}
