//import java.util.*;

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
    // public static void main(String[] args) {
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

    // this code is for reverse a string--------------------
    // String str = "prince";
    // StringBuilder str2 = new StringBuilder();
    // str2.append(str);
    // str2 = str2.reverse();
    // System.out.println(str2);
    // char[] char1 = str.toCharArray();
    // for (int i = char1.length; i <= 0; i++) {
    // System.out.println(char1[i]);
    // }

    // this code is for print the only even length of string-------------

    // }
    // public static void evenString(String s) {
    // for (String word : s.split(" ")) {
    // if (word.length() % 2 == 0) {
    // System.out.println(word);
    // }

    // }
    // }

    // public static void main(String[] args) {
    // String s = "this is a java language";
    // evenString(s);
    // }

    // reverse a string ----------------------------------
    // public static void main(String[] args) {

    // String s = "ranjan";
    // StringBuilder reversed = new StringBuilder(s).reverse();
    // System.out.println(reversed);
    // }

    // check string is pelindrom or not--------------------------
    // public static void main(String[] args) {
    // String str = "from";
    // StringBuilder reversed = new StringBuilder(str).reverse();
    // System.out.println(reversed);
    // }

    // print fabonachi sequence-----------------------------------
    // public static void main(String[] args) {
    // int num = 10, num1 = 1, num2 = 2;
    // System.out.print(num1 + "," + num2);
    // for (int i = 2; i < num; i++) {
    // int num3 = num1 + num2;
    // System.out.print("," + num3);
    // num1 = num2;
    // num2 = num3;
    // }
    // }

    // factorial of a number----------------------------------------
    // public static void main(String[] args) {
    // int num = 5, fact = 1;
    // for (int i = 1; i < num + 1; i++) {
    // fact *= i;
    // }
    // System.out.println(fact);
    // }

    // to check number is prime or not-------------------------
    // public static void main(String[] args) {
    // int num = 4;
    // if (num == 1) {
    // System.out.println("you enter 1. which is a prime number.");
    // } else if (num < 0) {
    // System.out.println("you entered negative number.");
    // } else {
    // for (int i = 2; i < num; i++) {
    // if (num % i == 0) {
    // System.out.println("this is not a prime number");
    // break;
    // } else {
    // System.out.println("it is a prime number");
    // }
    // }
    // }
    // }
    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disc " + n + " from " + src + " to " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);
    // System.out.println("transfer disc " + n + " from " + src + " to " + dest);
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void main(String[] args) {
    // int n = 3;
    // towerOfHanoi(n, "S", "H", "D");

    // }
    // public static void main(String[] args) {
    // String s = "prince";
    // StringBuilder str = new StringBuilder(s);
    // for (int i = str.length() - 1; i >= 0; i--) {
    // System.out.print(str.charAt(i));
    // }
    // }

    // pattern test----------------------
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }

            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}