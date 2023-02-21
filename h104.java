package one;
class Circle 
{
    public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;//to get pi value aas 3.14 inbuild math function used
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()//circumference and perimeter are equal so we return perimeter
    {
        return perimeter();
    }
            
    
}

public class h104 {
	

	public static void main(String[] args) {
		 Circle c1=new Circle();
	     c1.radius=7;
	     System.out.println("Area:"+c1.area());
	     System.out.println("Perimeter:"+c1.perimeter());
	     System.out.println("Circumference:"+c1.circumference());
		

	}

}
