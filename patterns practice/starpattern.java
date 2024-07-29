
public class starpattern {
        public static void main(String[] args) {
                int n = 5;
                int m = 5;
                // making square------------------------------------------Pattern 1
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= m; j++) {
                                System.out.print(" * ");
                        }
                        System.out.println();
                }

                // hollow square------------------------------------------Pattern 2
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= m; j++) {
                                if (i == 1 || i == n || j == 1 || j == n)
                                        System.out.print("*");
                                else
                                        System.out.print(" ");
                        }
                        System.out.println();
                }
                // right triangle------------------------------------------Pattern 3
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                // uper right angle triangle------------------------------------------Pattern 4
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                // inverted half pyramid (rotated by 180
                // deg)------------------------------------------Pattern 5
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                // print pattern using number------------------------------------------Pattern 6
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(j);
                        }
                        System.out.println();
                }
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i + 1; j++) {
                                System.out.print(j);
                        }
                        System.out.println();
                }
                // floyd's triangle------------------------------------------Pattern 7
                int count = 0;
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                                count++;
                                System.out.print(count);
                        }
                        System.out.println();
                }
                // 0-1 triangle------------------------------------------Pattern 8
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                                int pattern = i + j;
                                if (pattern % 2 == 0) {
                                        System.out.print("1 ");
                                } else {
                                        System.out.print("0 ");
                                }
                        }
                        System.out.println();
                }
                // butterfly pattern------------------------------------------Pattern 9
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        for (int j = 1; j <= 2 * (n - i); j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                for (int i = n; i >= 1; --i) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        for (int j = 1; j <= 2 * (n - i); j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                // solid rhombus------------------------------------------Pattern 10
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= n; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                // number pyramid------------------------------------------Pattern 11
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                                System.out.print(i + " ");
                        }
                        System.out.println();
                }
                // palindromic pattern------------------------------------------Pattern 12

                // for print spaces
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int j = i; j >= 1; j--) {
                                System.out.print(j);
                        }
                        for (int j = 2; j <= i; j++) {
                                System.out.print(j);
                        }
                        System.out.println();
                }
                // print diamond shape------------------------------------------Pattern 13
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }
}