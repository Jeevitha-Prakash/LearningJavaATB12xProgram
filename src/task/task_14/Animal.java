package task.task_14;

public abstract class Animal {

    public abstract void makeSound();
}


class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    public void makeSound()
    {
        System.out.println("Cat meows");
    }
}