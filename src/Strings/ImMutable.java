package Strings;

public class ImMutable {
    public static void main(String[] args) {

        // 2 ways to initialize string objects
        String n1 = "Adnan";
        String n2 = new String("Adnan");
        System.out.println(n1 == n2);




        // down here there is only one object
       // String constant pool
        String s1 ="Adnan";
        String s2 = "Adnan";
        System.out.println(s1 == s2);


        String str = s1.substring(0,2);
        System.out.println(str);
        s1.length();
        Boolean ans =s1.contains("A");
        System.out.println(ans);





    }
}
