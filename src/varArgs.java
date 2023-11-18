import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
//        don't know how many inputs are there || something like spread operator
        fun(2,3,4,5,6,2,7,4,3,3,3,2,1,2);
        multiple(1,2, "add", "asd", "add");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }
}