public class CopyConstructor {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Sid";
        s1.roll=11;
        s1.password="xyz";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);
        s2.password="abc";

        s1.marks[2]=100;//s1 marks is change after it is copied in s2

        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Shallow Copy Constructor
    /*Student(Student s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;//Here marks are passed by reference changes made in s1 will be reflected in s2
    }*/

    //Deep Copy Constructor
    Student(Student s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++)
        {
            this.marks[i]=s1.marks[i];
        }
    }

    Student()
    {
        marks=new int[3];
        System.out.println("constuctor is called...");//This is invoked upon creation of object
    }
}
