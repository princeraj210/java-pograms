import java.util.Scanner;

class functions {
    public static int averageNumber(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        // three input from user to print average of that number------------------
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        averageNumber(num1, num2, num3);
        sc.close();
    }
}