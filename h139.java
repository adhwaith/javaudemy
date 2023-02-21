package one;

import java.util.Date;

class Student1
{
    private String rollNo;
    
    private static int count=1;
    
    private String assignRollNo()
    {
        Date d=new Date();
        
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student1()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
    
}

public class h139 {

	public static void main(String[] args) {
		 	Student1 s1=new Student1();
	        Student1 s2=new Student1();
	        Student1 s3=new Student1();
	        
	        System.out.println(s1.getRollNo());
	        System.out.println(s2.getRollNo());
	        System.out.println(s3.getRollNo());

	}

}
