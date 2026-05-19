package Loops;

public class PrintEven {


    public static void main(String[] args) {
        //System.out.println("Even numbers between 1 and 50:");
//        for (int i = 1; i <= 50; i ++) {
//           if(i%2==0){
//               System.out.print(" " + i);
//
//           }
        // }
        System.out.print("Even numbers between 1 and 50:");
        for (int i = 2; i <= 50; i = i + 2) {
            System.out.print(" " + i);

        }

    }
}
