package ex_26_Collection_Framework.list;

import java.util.List;
import java.util.*;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args) {

        Student s1 = new Student("jeevitha", "12345");
        Student s2 = new Student("Sachin","222");
        Student s3 = new Student("Rajvika","111");

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        s1.setName("Prakash");
        s1.setRollno("3476");


        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
