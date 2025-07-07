package ex_26_Collection_Framework.list;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Lab234_Arraylist_input {
    public static void main(String[] args) {

        //user input
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        String continueinput = "Y";

        while(continueinput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to enter another name Y/N");
            continueinput = scanner.nextLine();
        }

        for(Object o : names)
        {
            System.out.println(o);
        }

    }
}
