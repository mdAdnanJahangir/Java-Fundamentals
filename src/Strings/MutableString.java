package Strings;

public class MutableString {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("adnan");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.append(" khan");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);











    }
}
