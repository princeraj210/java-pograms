public class checkPelindrome {
    public static void main(String[] args) {
        String str = "prince";
        checkStringPelindrome(str);
    }
    public static void checkStringPelindrome(String str){
        String count = "";
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            count += str.charAt(i);
        }
        if(count.equals(str)){
            System.out.println(str + " is a pelindrome");
        }else{
            System.out.println(str + " is not a pelindrome");
        }

    }
}
