package Exception;

public class demo {
    public static void main(String[] args) {
        // arithmetic exception
        int i = 0;
        int j =0;


        try{
             j = 18/i;
        }catch(Exception e ){
            System.out.println("someting went wrong" + e);
        }



        System.out.println(j);
        System.out.println("code executed  ");




    }
}
