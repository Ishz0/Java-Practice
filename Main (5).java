class Student
{
    private int stuID;
    private String stuName;
    private int stuAge;
    
    public String getstuName()
    {
        return stuName;
    }
    
    public void setstuName(String stuName) {
    this.stuName = stuName;
    }
    
    public int getstuID()
    {
        return stuID;
    }
    
    public void setstuID(int stuID) {
    this.stuID = stuID;
    }
    
    public int getstuAge()
    {
        return stuAge;
    }
    
    public void setstuAge(int stuAge) {
    this.stuAge = stuAge;
    }
    
    Student()
    {
        stuID=117;
        stuName="ishan";
        stuAge=21;
        
        System.out.println(stuID);
        System.out.println(stuName);
        System.out.println(stuAge);
    }
    
    
    Student(int a, String b, int c)
    {
        this.stuID=a;
        this.stuName=b;
        this.stuAge=c;
        
        System.out.println(stuID);
        System.out.println(stuName);
        System.out.println(stuAge);
    }
}
    
public class Main
{
    public static void main(String[] args)
    {
    Student s = new Student();
    Student s1 = new Student(118,"dainik",21);
    }
}
