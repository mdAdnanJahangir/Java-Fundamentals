package Opps.Encasulation;

class Mobile
{
    private String brand;
    private int price;
    private static String name= "smartphone";



    public Mobile(String brand,int price){
         this.brand=brand;
       this.price=price;
    }
    public Mobile(){

    }



    public void show()
    {
        System.out.println(brand +" "+price+" "+name);
    }
}


public class MobileUser {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
//        obj1.brand= "apple";
//        obj1.price=999;

        obj1.show();


        Mobile obj2 = new Mobile("samsung",888);
        obj2.show();



    }

}
