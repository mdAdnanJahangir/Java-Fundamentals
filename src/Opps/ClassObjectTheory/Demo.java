package Opps.ClassObjectTheory;

public class Demo {
    public static void main(String[] args) {
        int x =4;
        int y =5;
        System.out.println("value of x is "+x +"  value of y is "+y);
        addTen(x,y);
        System.out.println("value of x is "+x +"  value of y is "+y);
    }

    static void addTen(int x,int y){
        x=x+10;
        y=y+10;
    }

}
