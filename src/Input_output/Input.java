package Input_output;

import java.util.Scanner;

public class Input
{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double pi=input.nextDouble();

        System.out.println(name+pi);

    }
}
