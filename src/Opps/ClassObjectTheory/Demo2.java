package Opps.ClassObjectTheory;

public class Demo2 {
    // in java there is no pass by reference
    // only pass by value
    public static void main(String[] args) {
        Random r= new Random(4,5);
        System.out.println("value of x is "+r.x +"  value of y is "+r.y);
        addTen(r);
        System.out.println("value of x is "+r.x +"  value of y is "+r.y);




    }


    static void addTen(Random r){
       r.x=r.x+10;
       r.y=r.y+10;
    }
}




 class Random{
    int x;
    int y;

    Random(int x,int y){
        this.x=x;
        this.y=y;

    }

 }