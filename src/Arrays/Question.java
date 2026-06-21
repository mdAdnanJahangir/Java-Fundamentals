package Arrays;

class Fun{
    public static int maxi(int [] arr,int maxi){
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }
        System.out.println(maxi);
        return maxi;
    }

}






public class Question {
    public static void main(String[] args) {

        int [] arr={2,22,3,4,5};
        Fun.maxi(arr,arr[0]);


    }
}
