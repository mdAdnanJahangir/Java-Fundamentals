package Opps.ClassObjectTheory;


class calc {
    void add(){
        System.out.println("add");
    }
    void sub(){
        System.out.println("sub");
    }
}


class Advcalc extends calc{
    void mul(){
        System.out.println("multiply");
    }
    void div(){
        System.out.println("div");
    }
}


class Scicalc extends Advcalc {
    void sci(){
        System.out.println("scienific");
    }

}



public class CalculatorUser {
    public static void main(String[] args) {
        Scicalc obj = new Scicalc();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.sci();
    }
}
