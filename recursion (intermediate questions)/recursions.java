public class recursions {
    // tower of hanoi
    // ---------------------------------------------------------------------------------------
    // public static void toi(int n, String src, String helper, String dest) {
    // if (n == 1) {
    // System.out.println("transfer disc" + n + " from" + src + " to" + dest);
    // return;
    // }
    // toi(n - 1, src, dest, helper);
    // System.out.println("transfer disc " + n + " from " + src + " to " + dest);
    // toi(n - 1, helper, src, dest);
    // }

    // public static void main(String[] args) {
    // int n = 3;
    // toi(n, "S", "H", "D");
    // }
    // print a string in
    // reverse---------------------------------------------------------------
    // public static void printrev(String str, int x) {
    // if (x == 0) {
    // System.out.println(str.charAt(x));
    // return;
    // }
    // System.out.println(str.charAt(x));
    // printrev(str, x - 1);
    // }

    // public static void main(String[] args) {
    // String str = "prince";
    // printrev(str, str.length() - 1); //time complexity --> O(n)
    // }
    // find the 1st & last occurance of an element in string
    // --------------------------------------------
    // public static int first = -1;
    // public static int last = -1;

    // public static void stroccur(String str, int idx, char element) {
    // if (idx == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char current = str.charAt(idx);
    // if (current == element) {
    // if (first == -1) {
    // first = idx;
    // } else {
    // last = idx;
    // }
    // }
    // stroccur(str, idx + 1, element);
    // }

    // public static void main(String[] args) {
    // String str = "abssaskhaaahah";
    // stroccur(str, 0, 'a'); //time complexity --> O(n)
    // }
    // check if a =n array is
    // sorted(strictly(increasing)-----------------------------------------
    // public static boolean issorted(int arr[], int index) {
    // if (index == arr.length - 1) {
    // return true;
    // }

    // if (arr[index] < arr[index + 1]) {
    // return issorted(arr, index + 1);
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 3, 5 };
    // System.out.println(issorted(arr, 0)); //time complexity --> O(n)
    // }

    // move all "x" to the end of the string-----------------------------------
    // public static void moveall(String str, int idx, int count, String newstring)
    // {
    // if (idx == str.length()) {
    // for (int i = 0; i < count; i++) {
    // newstring += 'x';
    // }
    // System.out.println(newstring);
    // return;
    // }
    // char current = str.charAt(idx);
    // if (current == 'x') {
    // count++;
    // moveall(str, idx + 1, count, newstring);
    // } else {
    // newstring += current;
    // moveall(str, idx + 1, count, newstring);
    // }
    // }

    // public static void main(String[] args) { // time complexity --> O(n) -->
    // string length
    // String str = "axbcxxd";
    // moveall(str, 0, 0, "");
    // }

    // remove duplicate in a string -------------------------------------------
    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicate(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currchar = str.charAt(idx);
    // if (map[currchar - 'a'] == true) {
    // removeDuplicate(str, idx + 1, newString);
    // } else {
    // newString += currchar;
    // map[currchar - 'a'] = true;
    // removeDuplicate(str, idx + 1, newString);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "abbccda";
    // removeDuplicate(str, 0, "");
    // }

    // print all the subsequence of string ------------------------------------
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, newString + currChar);

        // or not to be
        subsequences(str, idx + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
