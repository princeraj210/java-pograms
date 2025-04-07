public class allSubstring {
    public static void main(String[] args) {
        String input = "abc";
        printAllSubstring(input);
    }
    public static void printAllSubstring(String input){
        int n = input.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(input.substring(i,j).split("\n"));
            }
        }
    }
}
