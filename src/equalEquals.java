public class equalEquals {
    public static void main(String[] args) {
        // == for object compares refrences thats why even value is same it gives false

        int x =100;
        int y=100;
        System.out.println(x==y);


        Integer a =200;
        Integer b=200;
        System.out.println(a==b);
        System.out.println(a.intValue()==b.intValue());
        System.out.println(a.equals(b));



    }
}
