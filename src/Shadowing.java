public class Shadowing {
    static int x = 12;
    public static void main(String [] args){
        System.out.println(x);
        int x = 90;
        System.out.println(x);
        test2();
    }
    public static void test2(){
        System.out.println(x);
    }
}
