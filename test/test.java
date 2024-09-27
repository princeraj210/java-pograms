import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {

    // public static void main(String[] args) {

    // reverse a number ------------------------------
    // int number = 987654;
    // int reversed = 0;
    // while (number != 0) {
    // int digit = number / 10;
    // reversed = reversed * 10 + digit;
    // number = number / 10;
    // }
    // System.out.println(reversed);

    // find the largest number in the array--------------
    // int[] arr = new int[] { 1, 4, 6, 7, 8, 9 };
    // int max = arr[0];
    // for (int i = 0; i <= arr.length; i++) {

    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // System.out.println(max);

    // }
    // public static void main(String[] args) {
    // int row = 6;
    // int mid = row / 2;
    // for (int i = 0; i <= row; i++) {
    // for (int j = 0; j <= row; j++) {
    // if ((j == mid) || (i == row) || (j == mid - i)) {
    // System.out.print(" * ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // for (int i = 0; i <= row; i++) {
    // for (int j = 0; j <= row; j++) {
    // if ((i == mid || j == mid - i) || (i == row)) {
    // System.out.print(" * ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }
    public static void main(String[] args) {
        // int n = 8;
        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j <= n; j++) {
        // if (i == n || j == n || i == 0 || j == 0)
        // System.out.print(" * ");
        // else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }
        String str = "prince";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        System.out.println(str2);
        // char[] char1 = str.toCharArray();
        // for (int i = char1.length; i <= 0; i++) {
        // System.out.println(char1[i]);
        // }

    }
}