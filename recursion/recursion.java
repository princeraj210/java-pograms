package recursion;

public class recursion {
    // // print number from 5 to 1 --------------------------------------------
    // public static void print_num(int n) {
    // if (n == 6) { // base case
    // return;
    // }
    // System.out.println(n); // print function
    // print_num(n + 1); // recursion
    // }

    // public static void main(String[] args) {
    // int n = 1;
    // print_num(n);
    // }

    // sum of first n natural number ---------------------------------------------
    // public static void natural_number(int i, int n, int sum) {
    // if (i == n) {
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // natural_number(i + 1, n, sum);
    // }

    // public static void main(String[] args) {
    // natural_number(1, 5, 0);
    // }

    // print factorial of number n
    // -----------------------------------------------------
    // public static int fact(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }
    // int factn1 = fact(n - 1);
    // int fact_n = n * factn1;
    // return fact_n;
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // int ans = fact(n);
    // System.out.println(ans);
    // }

    // fibonacci series sequece till nth term -------------------------------------
    // public static void print_fib(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // print_fib(b, c, n - 1);
    // }

    // public static void main(String[] args) {
    // int a = 0;
    // int b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 7;
    // print_fib(a, b, n - 2);
    // }

    // print x^n (stack height = n)-------------------------------------------------
    // public static int calcpower(int x , int n){
    // if (n==0){
    // return 1;
    // }
    // if(x==0){
    // return 0;
    // }
    // int xpowm1 = calcpower(x, n-1);
    // int xpow = x * xpowm1;
    // return xpow;
    // }
    // public static void main(String[] args) {
    // int x =2,n=5;
    // int ans = calcpower(x, n);
    // System.out.println(ans);
    // }

    // print x^n(stack height = logn)
    // ------------------------------------------------
    public static int calcpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcpower(x, n / 2) * calcpower(x, n / 2);
        } else {
            return calcpower(x, n / 2) * calcpower(x, n / 2)  * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}
