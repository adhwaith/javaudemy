package one;
class  Cylinder
{
    public int radius;
    public int height;
    
 
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}

public class h106 {

	public static void main(String[] args) {
		Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
       
		

	}

}
