public class d2b {
    public static void main(String[] args) {
        int decimal = 10;
        String result = "";
        while(decimal !=0){
            int lastBit = decimal & 1 ;
            result = lastBit + result;
            decimal = decimal >> 1;
        }
        System.out.println(result);
    }
}
