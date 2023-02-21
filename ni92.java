package one;

public class ni92 {
	public int max(int a,int b)
    {
        return a>b?a:b;
    }
    
    public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }


	public static void main(String[] args) {
		ni92 t=new ni92();
		System.out.println(t.max(10,5));
		System.out.println(t.max(10,15,5));
        
        
		

	}

}
