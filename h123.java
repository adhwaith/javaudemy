package one;
interface test
{
	void meth1();
	void meth2();
}
class mr implements test{
	public void meth1() {
		System.out.println("hello");
	}
	public void meth2() {
		System.out.println("hi");
		
	}
	public void meth3() {
		System.out.println("goodmorning");
	}
}
public class h123 {

	public static void main(String[] args) {
		test t=new mr();
		t.meth1();
		t.meth2();
		//t.meth3();wont work instead of test if mr given will work

	}

}
