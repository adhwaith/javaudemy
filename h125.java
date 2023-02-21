package one;
interface Member
{
    public void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;
       
    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }
    
}

class Custome implements Member
{
    String name;
    
    Custome(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
        
        
    }
    
}

public class h125 {

	public static void main(String[] args) {
		 Store s=new Store();
	        Custome c1=new Custome("John");
	        Custome c2=new Custome("Smith");
	        
	        s.register(c1);
	        s.register(c2);
	        
	        s.inviteSale();

	}

}
