package methods;

public class Func {
    public static void main(String[] args) {
    greet();
    greetwithbname("addy");
    sayNumber(10);
    add(10,2);


    }







    static void greet(){
        System.out.println("hello");
    }

    static void greetwithbname(String name ){
        System.out.println(" helllo "+ name );
    }
    static int sayNumber(int num){
    return num;
    }
    static int add(int a,int b){
    return a+b;
    }
}
