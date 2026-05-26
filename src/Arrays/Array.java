package Arrays;

public class Array {
    public static void main(String[] args) {


        // static memory allocation
        int [] arr = {1,2,3,4,5};

        // dynamci memory alocation
        int [] brr  ;
        brr = new int[2];
        brr[0]=1;
        brr[1]=2;


        System.out.println(arr.length);


        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(" " +arr[i]);
        }
//
        for(int i : brr){
            System.out.print(" " +i);

        }











    }
}
