package ex_16_Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array_foreach_Loop {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34

        int highest = 0;
        int secondHighest = 0;

        for(int num : numbers)
        {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if(num > secondHighest && num != highest)
            {
                secondHighest = num;
            }

        }
        System.out.println(secondHighest);
    }
}
