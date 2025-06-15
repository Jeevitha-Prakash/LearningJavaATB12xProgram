package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] number = {1,2,3,4};
        int sum=0;
        for(int i =0; i<number.length;i++)
        {
            sum= sum+number[i];

        }
        System.out.println("Sum of number is " + sum);

    }
}
