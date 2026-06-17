package CastingTypes;

class A {
    public void show1(){
    System.out.println("in A");
}
}

class B extends A{
    public void show2 (){
        System.out.println("in B");
    }
}

class TypeCating{

    static double a =4.5;
   static int a2 = (int)a;
   static  float c = (float)a;


}



public class casting {
    public static void main(String[] args) {


        // typecasting
        System.out.println(  TypeCating.a2);
        System.out.println(  TypeCating.c);

        // upcasting
        A obj = (A) new B();
        obj.show1();

        //downcasting

        B obj1 = (B) obj;
        obj1.show2();;




    }
}
