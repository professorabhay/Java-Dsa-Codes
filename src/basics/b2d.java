public class b2d {
    public static void main(String[] args) {
        int binary = 1010;
        int result = 0 ;
        int index = 0 ;

        while (binary !=0){
            int lastDigit = binary % 10;
            if(lastDigit == 1) {
                result = result + (int) Math.pow(2, index);
            }
            index = index + 1;
            binary = binary / 10;
        }
        System.out.println(result);
    }
}
