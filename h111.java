package one;
class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject(String subID,String name,int maxMarks,int marksObtains)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtains=marksObtains;
    }
    
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}
public class h111 {

	public static void main(String[] args) {
		Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100,70);
        subs[1]=new Subject("s102","Algorithms",100,80);
        subs[2]=new Subject("s103","Operating Systems",100,90);
        
        for(Subject s:subs)
            System.out.println(s);
    
		

	}

}
