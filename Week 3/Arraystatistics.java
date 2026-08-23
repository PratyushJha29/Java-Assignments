public class Arraystatistics {
    public static int sum(int arr[]){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static double average(int[] arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static int minimum(int[] arr){
        int minimum = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static int Maximum(int arr[]){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
