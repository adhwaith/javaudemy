package one;

public class ni96 {
	static void show(int...A) {
		for(int x:A) {
			
			System.out.println(x);
			
		}
		
	}

	public static void main(String[] args) {
		
		show();
		show(1,2);
		show(1,2,3);
		show(new int[] {4,5,6,7,8,9});

	}

}
