import java.util.*;
public class threegreat {
    // only for positive three great multiplication--------------------

    // static int threeGreatProduct(int arr[]){
    //     int n = arr.length;
    //     Arrays.sort(arr);
    //     int count = 1;
    //     for(int i = n-1; i>=n-3; i--){
    //         count = count*arr[i];
    //     }
    //     return count;

    // }
    // public static void main(String[] args) {
    //     int arr [] = {1,-4,3,-6,7,0};
    //     System.out.println(threeGreatProduct(arr));
    // }

    static int greatProduct(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);

    }
    public static void main(String[] args) {
        int arr [] = {1,-4,3,-6,7,0};
        System.out.println(greatProduct(arr));
    }
}
