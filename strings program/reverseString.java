public class reverseString {
    public static void main(String[] args) {
        String str = "prince";
        reverseStringBySwap(str);
        //reverseTheString(str);
    }
    // public static void reverseTheString(String str){
    //     String count = "";
    //     int n = str.length();
    //     for(int i=n-1;i>=0;i--){
    //         count += str.charAt(i);
    //     }
    //     System.out.println(count);

    // }

    //second method by swaping ---------
    public static void reverseStringBySwap(String str){
        StringBuilder ans = new StringBuilder(str);
        int n = ans.length();
        for(int i=0;i<n/2;i++){
            char first = ans.charAt(i);
            char last = ans.charAt(n-1-i);
            ans.setCharAt(i, last);
            ans.setCharAt(n-1-i, first);
        }
        System.out.println(ans.toString());
    }
}
