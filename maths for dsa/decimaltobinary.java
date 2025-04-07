class decimaltobinary{

    // converting decimal to any base
    // public  static void decimalToBinary(int decimalNum, int base){
    //     int resNum = 0;
    //     int pow = 0;
    //     while (decimalNum>0) {
    //         int rem =decimalNum%base;
    //         decimalNum/= base;
    //         resNum += rem * Math.pow(10, pow);
    //         pow ++;
    //     }
    //     System.out.println("result is " + resNum);
    // }

     // converting binary to any base
    //  public  static void binaryToAnyBase(int binaryNum, int base){
    //    int resNum = 0;
    //    int pow = 0;
    //    while(binaryNum>0){
    //     int unitDig = binaryNum % 10;
    //     binaryNum /= 10;
    //     resNum += unitDig * Math.pow(base, pow);
    //     pow ++;
        
    //    }
    //    System.out.println("result in decimal is :" + resNum);
    // }

    //find a number is even or odd
    // public static void eveOrOdd(int num){
    //     if(num%2==0){
    //         System.out.println("the number "+ num + " is even.");
    //     }
    //     else{
    //         System.out.println("the number "+ num + " is odd.");
    //     }
    // }


    //reverse a number
    // public static void reverseNum(int num){
    //     int rev = 0;
    //     while(num>0){
    //         int unit = num%10;
    //         rev = rev*10 + unit;
    //         num/=10;
    //     }
    //     System.out.println("reverse Number is: " + rev);
    // }

    //code for power a number
    // public static double power(int num, int pow){
    //     double res = 1;
    //     for(int i=0;i<pow;i++){
    //         res = res*num ;
    //     }
    //     System.out.println(res);
    //     return res;
    // }

    //fast exponential of finding power
    // static double fastExponential(int num, int pow){
    //     double res = 1;
    //     while(pow > 0){
    //         if(pow%2!=0){
    //             res = res* num;
    //         }
    //         pow /= 2;
    //         num = num * num;
    //     }
    //     System.out.println(res);
    //     return res;
    // }

    static void countDigits(int num){
        int counter =0;
        while (num>0) {
            if(num == 0){
                System.out.println("digits are counted as : 1 times");
                return;
            }
            num/=10;
            counter++;
            
        }
        System.out.println("digits are counted as :"+ counter + " times");
    }

    public static void main(String[] args) {
        // decimalToBinary(5,2);
        // binaryToAnyBase(101,2);
        //eveOrOdd(5);
        //reverseNum(2974);
        // power(2, 6);
        //fastExponential(2, 7);
        countDigits(10);
    }
}