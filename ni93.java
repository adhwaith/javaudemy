package one;

public class ni93 {
	 	static double area(double radius)
	    {
	        return Math.PI*radius*radius;
	    }
	    
	    static double area(double length,double breadth)
	    {
	        return length*breadth;
	    }

	public static void main(String[] args) {
		
		double l,b,r;
		l=2.0;
		b=4.0;
		r=10.0;
		System.out.println(area(r));
		System.out.println(area(l,b));
		
		

	}

}
