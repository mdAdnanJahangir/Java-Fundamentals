package methods;

public class MethodOverLoading {
    // method overloading depends on parameters not return type

    static void show(){
        System.out.println("no parameter");
    }


    static void show(int a ){
        System.out.println("no parameter");
    }

//    static int show(int a){
//        System.out.println("int in para");
//        return 0;
//    }


    static double show(double a ){
        System.out.println("double in para ");
        return 2.22222;
    }



    public static void main(String[] args) {
    show ();
    }
}
