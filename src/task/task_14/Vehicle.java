package task.task_14;

public interface Vehicle {

    default void start()
    {
        System.out.println("Vehicle started");

    }

    public static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}
