import java.util.*;

public class secondlargestelement {
    // find second largest element ---------------------------------------
    static int secondLargest(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[i-1]){
                return arr[i];
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr [] = {12,35,1,10,34,1};
        System.out.println(secondLargest(arr));
    }


    //third largest element ------------------------------------
    // static int thirdLargest(int arr[]){
    //     int n = arr.length;
    //     Arrays.sort(arr);
    //     return arr[n-3];


    // }
    // public static void main(String[] args) {
    //     int arr [] = {12,35,1,10,34,1};
    //     System.out.println(thirdLargest(arr));
    // }
}
