public class returnInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    static int reverse(int x){
        int result = 0;
        while(x!=0){
            int lastDigit = x % 10;
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10){
                return  0;
            };
            result = result * 10 + lastDigit;
            x = x / 10;
        }
        return result;
    }
}
