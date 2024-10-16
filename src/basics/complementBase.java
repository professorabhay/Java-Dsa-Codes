public class complementBase {
    public static void main(String[] args) {
        int n = 10;
        String bit = "" ;
        int reverse = 0;

        while(n != 0){
            int lastBit = n & 1;
            bit = lastBit + bit;
            n = n >> 1;
        }
//        reverse =
//        System.out.println(bit);
    }
}
