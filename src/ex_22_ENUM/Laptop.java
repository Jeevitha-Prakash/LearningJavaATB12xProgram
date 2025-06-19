package ex_22_ENUM;
enum Laptops{
    HP(100),DELL(200),VIVO(400),ACER(1000);

    private int price;

    private Laptops(int price)
    {
        this.price = price;
    }

    private Laptops()
    {
        price = 550;
        System.out.println("Default price");
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
       this.price = price;
    }

}
public abstract class Laptop {
    public static void main(String[] args) {
        Laptops[] lap = Laptops.values();

        for(Laptops l1 : lap)
        {
            System.out.println(l1 + "Price: " + l1.getPrice());
        }
    }

    public abstract void acer();
}
