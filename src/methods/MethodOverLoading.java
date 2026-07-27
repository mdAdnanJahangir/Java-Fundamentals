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

    // here down in add function see return type is same but parameter is different
    // so hence proved overloading depends on parameters not retrun type
    //example2
    static int add(int a ,int b){
        return  a+b;
    }

    static int add(double a ,double b){
        return (int)( a+b);
    }


    public static void main(String[] args) {
    show ();
    int ans1 = add(4,4);
    int ans2 = add(4.2,4.6);

        System.out.println(ans1);
        System.out.println(ans2);


    }
}
