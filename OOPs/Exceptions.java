public class Exceptions {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(arr[1]);
        try {
            System.out.println(arr[-1]);
        } catch (Exception e) {
            System.out.println("Error 404" + e.getMessage());
        } finally{System.out.println(arr[0]);} 
        myException();
    }
    static void myException() throws Exception{
        throw new Exception("Smething went wrong");
    }
}
