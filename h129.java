package one;
class out{
	public void display()
	{
		class inn{
			public void show() {
				System.out.println("hello");
			}
		}
		inn i=new inn();//new inn.show() use this for the 2 lines
		i.show();
	}
}

public class h129 {

	public static void main(String[] args) {
		out o=new out();
		o.display();
		

	}

}
