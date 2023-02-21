package one;
class Rec
{
    private double length;
    private double breadth;
    
    public double getLength()
    {
        return length;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
    
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else 
            breadth=0;
    }
    
    public double area()
    {
        return length*breadth;
        //return getLength()*getBreadth();
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

public class h108 {

	public static void main(String[] args) {
		
		Rec r=new Rec();
        r.setLength(10.5);//check with negative values.
        r.setBreadth(5.5);
        
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());
        
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
		

	}

}
