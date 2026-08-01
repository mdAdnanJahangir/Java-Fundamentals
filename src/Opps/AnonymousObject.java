package Opps;

class A{
    A(){
        System.out.println("A constructor");
    }
    void show(){
        System.out.println("in A");
    }
}


public class AnonymousObject {
    public static void main(String[] args) {
       // A a;
        // can only use once eveytime a new  object will be created
        // anaonymous object
        new A().show();
        new A().show();

    }
}
