package one;

public class ni98 {
	static void show(int start,String...A) {
		for(int i=0;i<A.length;i++) {
			System.out.println(start +"."+A[i]);
			start++;
		}
		
	}

	public static void main(String[] args) {
		int s=5;
		show(s,"adh","aws","cdew","yhuoi","weew","wwqq");
		

	}

}
