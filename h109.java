package one;
class  Cylinde
{
    private int radius;
    private int height;
    
    public Cylinde()
    {
        radius=height=1;
    }
    public Cylinde(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    
    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }
    
    
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

public class h109 {

	public static void main(String[] args) {
		    Cylinde c=new Cylinde();
	        c.setHeight(10);
	        c.setRadius(7);
	        c.setDimensions(10, 7);
	        
	        System.out.println("LidArea "+c.lidArea());
	        System.out.println("Circumference "+c.perimeter());
	        System.out.println("totalSurfaceArea "+c.drumArea());
	        System.out.println("Volume "+c.volume());
	        System.out.println("Height"+c.getHeight());
	        System.out.println("Radius"+c.getRadius());
		

	}

}
