package task.task_14;

public class Document implements Printable,Showable{

    @Override
    public void print()
    {
        System.out.println("Printing Document");
    }

    @Override
    public void show(){
        System.out.println("Showing Document");
    }
}
