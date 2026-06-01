package Opps.ClassObjectTheory;

class calc{
    void add(){
        System.out.println("add");
    }
}


public class CalculatorUser {
    public static void main(String[] args) {
        calc obj = new calc();
        obj.add();
    }
}
