
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // print each character of the string in separate line ------------------P1
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(i);
        }
    }
}
