public class Constructor {
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student("Siddharth");
        Student s3=new Student(11);
    }
}
//If user doesn't creates the constructor then java creates a default constructor
class Student{
    String name;
    int roll;
    //This is non-parameterized constructor
    Student()
    {
        System.out.println("constuctor is called...");//This is invoked upon creation of object
    }
    //This is parameterized constructor
    Student(String name)
    {
        this.name=name;
    }
    Student(int roll)
    {
        this.roll=roll;
    }
}
