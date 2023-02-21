package one;
class Rectang
{
    int length;
    int breadth;
    int x=10;
    
    Rectang(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   
}

class Cuboid extends Rectang
{
    int height;
    int x=20;
    
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    void display()
    {
        System.out.println(super.x);//refer to x of super class
        System.out.println(x);//refer to x of child class
    }
}

public class h116 {

	public static void main(String[] args) {
		Cuboid c=new Cuboid(10,5,15);
        c.display();
		

	}

}
