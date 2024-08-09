
public class important {
    // print all permutation of a string----------------------------------
    // public static void printperm(String str, String permutation) {
    // if (str.length() == 0) {
    // System.out.println(permutation);
    // return;
    // }
    // for (int i = 0; i < str.length(); i++) {
    // char currChar = str.charAt(i);
    // String newstr = str.substring(0, i) + str.substring(i + 1);
    // printperm(newstr, permutation + currChar);
    // }

    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // printperm(str, "");
    // }

    // count total path in a maze to move from (0,0) to (m,n)-----------------

    // public static int countpath(int i, int j, int n, int m) {
    // if (i == n || j == m) {
    // return 0;
    // }
    // if (i == n - 1 && j == m - 1) {
    // return 1;
    // }
    // int downpath = countpath(i + 1, j, n, m);
    // int rightpath = countpath(i, j + 1, n, m);
    // return downpath + rightpath;
    // }

    // public static void main(String[] args) {
    // int n = 3, m = 4;
    // int totalpath = countpath(0, 0, n, m);
    // System.out.println(totalpath);

    // }
}
