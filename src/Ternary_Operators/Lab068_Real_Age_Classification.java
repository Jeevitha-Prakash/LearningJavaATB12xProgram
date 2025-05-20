//Again, use the nested ternary. You have to figure it out if I am an adult, minor, or senior.
// What is the condition? The condition is very simple. If age is less than 18, then minor,If my age is greater than 18,
// then I can be  adult or senior.
// But if my age is greater than 65, then I am a senior. If I am between 18 to 65, then I am an adult.
package Ternary_Operators;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        int age = 26;
        //adult, minor or senior
        //age>18 -> adult, minor or senior
        //agr >65 -> senior
        //(age >=18 || age <=65) -> adult

        String result = age>18 ? ((age >18 && age <=65)?"Adult":"Senior") : "Minor";
        //  String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);


    }
}
