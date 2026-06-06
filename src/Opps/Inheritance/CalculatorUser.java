package Opps.Inheritance;


class calc {
    void add(){
        System.out.println("add");
    }
    void sub(){
        System.out.println("sub");
    }
}


class Advcalc extends calc{
    public String name ;
    Advcalc(String name){
        this.name=name;

    }
    void mul(){
        System.out.println("multiply");
    }
    void div(){
        System.out.println("div");
    }
}


class Scicalc extends Advcalc {
    Scicalc(String name){
        super(name);
    }
    void sci(){
        System.out.println("scienific");
    }

}



public class CalculatorUser {
    public static void main(String[] args) {
        Scicalc obj = new Scicalc("bajaj calculator");
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.sci();
        System.out.println(obj.name);


    }
}
