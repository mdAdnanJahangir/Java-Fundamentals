package Opps.ClassObjectTheory;

class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand +" "+price+" "+name);
    }
}


public class MobileUser {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand= "apple";
        obj1.price=999;
        Mobile.name = "smartphone";
        obj1.show();

    }

}
