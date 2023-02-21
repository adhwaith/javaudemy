package one;

abstract class y{//interface y also same result
	abstract public void show();
	
}

class ou{
	public void display()
	{
		y m=new y() { public void show(){System.out.println("hello");}};//new y() { public void show(){System.out.println("hello");}}.show;
		//instead of two lines
		m.show();
	}
}


public class h130 {

	public static void main(String[] args) {
		ou o=new ou();
		o.display();
		
		

	}

}
