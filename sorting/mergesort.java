public class mergesort {
    public static void conquer(int arr[], int s, int mid, int e) {
        int merge[] = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }
        while (idx2 <= e) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0, j = s; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }

    }

    public static void divide(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conquer(arr, s, mid, e);

    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 6, 9, 3, 2, 1 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}