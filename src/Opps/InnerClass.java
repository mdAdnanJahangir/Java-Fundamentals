package Opps;

class Outer{

    class Inner{

        void show(){
            System.out.println("inner show method ");
        }

    }
}


public class InnerClass {
    public static void main(String[] args) {
        // 1st
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();

        // 2 nd way
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

    }
}
