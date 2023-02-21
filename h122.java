package one;
abstract class Shape
{
   abstract public double perimeter();
   abstract public double area();
}

class Ci extends Shape
{
    double radius;
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
            
}
        
class Rect extends Shape
{
    double length;
    double breadth;
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
            
}

public class h122 {

	public static void main(String[] args) {
		 Rect r=new Rect();
	        r.length=10;
	        r.breadth=5;
	        
	        Shape s=r;
	        
	        System.out.println(s.area());

	}

}
