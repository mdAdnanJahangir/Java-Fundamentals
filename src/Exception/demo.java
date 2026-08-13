package Exception;

public class demo {
    public static void main(String[] args) {
        // arithmetic exception
        int i = 0;
        int j =0;


        try{
            if(j==0)
                throw new ArithmeticException(" hello ");
             j = 18/i;

        }catch(ArithmeticException e ){
            System.out.println("hellooooo " + e);
        }



        System.out.println(j);
        System.out.println("code executed  ");




    }
}
