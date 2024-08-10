import java.util.ArrayList;

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

    // place tiles of size 1xm in a floor of size nxm
    // public static int tileplace(int n, int m) {
    // if (n == m) {
    // return 2;
    // }
    // if (n < m) {
    // return 1;
    // }
    // // vertical placement
    // int verplacement = tileplace(n - m, m);
    // // horizontal placement
    // int horplacement = tileplace(n - 1, verplacement);
    // return verplacement + horplacement;
    // }

    // public static void main(String[] args) {
    // int n = 4, m = 2;
    // System.out.println(tileplace(n, m));
    // }

    // find the number of ways in which you can invite n people to your party,
    // single or in pairs----------------------------------------------------
    // public static int callguest(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // // single
    // int ways1 = callguest(n - 1);
    // // pairs
    // int ways2 = (n - 1) * callguest(n - 2);
    // return ways1 + ways2;
    // }

    // public static void main(String[] args) {
    // int n = 4;
    // System.out.println(callguest(n));
    // }

    // print all the subsets of a set of first n natural numbers -----------------
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findsubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;

        }
        // to be add
        subset.add(n);
        findsubsets(n - 1, subset);

        // not to be add
        subset.remove(subset.size() - 1);
        findsubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsubsets(n, subset);
    }

}

// ---------------remove comments and enjoy :)---------------------------------
