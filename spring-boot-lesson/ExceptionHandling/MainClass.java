public class MainClass {
    public static void main(String[] args){
        int[] arr = {1,2,4};
        try{
            System.out.println(2/0);
            System.out.println(arr[9]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundException e){
            System.out.println(e);
        }
    }
}
