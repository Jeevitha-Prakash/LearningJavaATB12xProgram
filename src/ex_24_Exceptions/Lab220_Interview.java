package ex_24_Exceptions;
import java.io.*;

public class Lab220_Interview {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }
    }
}
