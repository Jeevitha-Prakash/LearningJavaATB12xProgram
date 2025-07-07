package ex_26_Collection_Framework.list;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args)
    {
        List al = new ArrayList<>();

        //adding an objects
        al.add("Jeevitha");
        al.add("Sachin");
        al.add("Rajvika");
        al.add(100);
        al.add(200.5);

        //printing an element
        System.out.println(al);

        //addinging an element at specific index
        al.add(5,"Chandra");

        //printing an element
        System.out.println(al);

        //remove an object using specific name
        al.remove("Jeevitha");

        //remove an object using inex
        al.remove(2);

        //printing an element
        System.out.println(al);

        //remove all object
        al.removeAll(al);

        //printing an element
        System.out.println(al);

        //adding an objects
        al.add("Jeevitha");
        al.add("Sachin");
        al.add("Rajvika");
        al.add(100);
        al.add(200.5);

        //Update an object
        al.set(2,"Chandra");

        //printing an element
        System.out.println(al);

       //To check if the object/element is present in arrayList
        System.out.println(al.contains("Chandra"));
        System.out.println(al.contains(46));

        //To check the size
        System.out.println(al.size());

        //To check the index of first occurence of particular object
        System.out.println(al.indexOf(100));

        //to add an element(duplicates are allowed)
        al.add(100);
        al.add("Chandra");

        //printing an element
        System.out.println(al);


        //To check the index of last occurance of particular object
        System.out.println(al.lastIndexOf(100));

       //to iterate in the Arraylist
        //Using for Loop

        for(int i=0; i<al.size();i++)
        {
            System.out.print(al.get(i));
            System.out.print(" ");
            System.out.println();
        }

        //using foreach loop
        for(Object  l : al)
        {
            System.out.print(l);
            System.out.print(" ");
            System.out.println();
        }

        //using Iterator interface
        Iterator iterator = al.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
            System.out.print(" ");
            System.out.println();
        }

        //sort in ascending order
        Collections.sort(al);
        System.out.print(" " + al);
        System.out.println();

        //reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.print(" " + al);
        System.out.println();






    }
}
