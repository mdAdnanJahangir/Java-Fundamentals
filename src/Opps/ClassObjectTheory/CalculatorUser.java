package Opps.ClassObjectTheory;


class Advcalc{
    void mul(){
        System.out.println("multiply");
    }
    void div(){
        System.out.println("div");
    }
}


class calc extends Advcalc{
    void add(){
        System.out.println("add");
    }
    void sub(){
        System.out.println("sub");
    }
}


public class CalculatorUser {
    public static void main(String[] args) {
        calc obj = new calc();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
