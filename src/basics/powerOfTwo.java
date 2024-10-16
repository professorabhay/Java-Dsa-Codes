public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }

    static boolean isPowerOfTwo(int x) {
        int result = 0;
        while (x != 0) {
            int lastBit = x & 1;
            if (lastBit == 1) {
                result++;
            }
            x = x >>> 1;
        }
        if (result == 1){
            return true;
        }
        return false;
    }
}
