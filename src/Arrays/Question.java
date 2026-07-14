package Arrays;

class Fun{
    public static int maxi(int [] arr,int maxi){
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }

        return maxi;
    }

    public static int linearS(int [] arr,int target)
    {
        for(int i =0;i<arr.length;i++){
            if(arr[i]== target)
            {
                return target ;
            }
        }

        return -1;

    }



}






public class Question {
    public static void main(String[] args) {

        int [] arr={2,22,3,4,5};
       int maxans = Fun.maxi(arr,arr[0]);
        System.out.println(maxans);
        int Target = Fun.linearS(arr,3);
        System.out.println(Target);


    }
}
