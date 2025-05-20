package task;

public class T3_Operators {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

                //m = 1(0)-2(1)-3(2)
                //i =0, j=1, k=2, m=-4
    }

}
