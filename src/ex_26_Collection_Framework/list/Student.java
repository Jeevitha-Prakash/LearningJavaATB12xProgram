package ex_26_Collection_Framework.list;

public class Student {

    private String name;
    private String rollno;

    public Student(String name, String rollno)
    {
      this.name =   name;
      this.rollno = rollno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRollno()
    {
        return rollno;
    }

    public void setRollno(String rollno)
    {
        this.rollno = rollno;
    }

    @Override

    public String toString()
    {
        return "Student{" + "name= " + name + '\'' + ", rollno = " + rollno + '\'' + '}';
    }

    public void printDetails()
    {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollno);
    }


}
