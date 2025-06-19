package task.task_14;

public class TestBank {

    public static void main(String[] args) {

        SBI s = new SBI();
        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");

        HDFC h = new HDFC();
        System.out.println("HDFC Interest Rate: " + h.getInterestRate() + "%");
    }
}

abstract class Bank{

    public abstract double getInterestRate();
}

class SBI extends Bank{
    public double getInterestRate()
    {
        return 7.5;
    }
}

class HDFC extends Bank{
    public double getInterestRate()
    {
        return 8.0;
    }
}
