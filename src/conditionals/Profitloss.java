package conditionals;

import java.util.Scanner;

public class Profitloss {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter cp");
       int cp=input.nextInt();
        System.out.println("enter sp");
       int sp=input.nextInt();

       if(sp>cp) {System.out.println("profit");}
       if(sp==cp) System.out.println("no profit and no loss");
       else System.out.println("loss");




    }
}
