package Opps.Inheritance;


class calc {
    void add(){
        System.out.println("add");
    }
    int add(int a ,int b ){
        System.out.println("add");
        return a+b;
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

    @Override
    void add(){
        System.out.println("in over riden add");
    }

}



public class CalculatorUser {
    public static void main(String[] args) {
        Scicalc obj = new Scicalc("bajaj calculator");
        //int ans = obj.add(2,2);//
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.sci();
        System.out.println(obj.name);


        // dynamic dispatch
        calc obj2= new Scicalc("BMV calculator");
        obj2.add();
        obj2.sub();
        obj2.mul();
        obj2.div();
        obj2.sci();


    }
}
