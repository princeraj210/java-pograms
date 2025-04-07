
public class findCompanyName {
    // find out the company name -------------------
    public static void main(String[] args) {
        String email = "shaswattiwari8@gmail.com";
        String email2 = "princeraj210@hotmail.com";
        String emailarr[] = email2.split("@");
        String lastPart = emailarr[emailarr.length-1];
        int dotIndex = lastPart.lastIndexOf('.');
        System.out.println(lastPart.substring(0, dotIndex));
    }



}