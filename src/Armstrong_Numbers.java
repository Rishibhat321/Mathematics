public class Armstrong_Numbers {

   public static String armstrongNumber(int n) {

        int sum = 0;
        int num = n;

        while(num>0){
            int a = num%10;
            num /= 10;

            sum += (int)Math.pow(a,3);
        }

        if(sum==n){
            return "true";
        }

        return "false";

    }
    public static void main(String[] args) {
       int n = 321;

       String res = armstrongNumber(n);

       if(res.equals("true"))
       {
           System.out.println("Armstrong");
       }
       else{
           System.out.println("Not Armstrong");
       }

    }
}
