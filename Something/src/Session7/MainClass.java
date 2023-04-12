package Session7;
public class MainClass {
    public static void main(String[] args){
        int[] arr = { 1, 4, 6, 10, 0, 5};
        for (int i = 0; i<arr.length; i++){
            System.out.println("index =" + i);
            if (arr[i] == 10){
                System.out.println("number is = " +arr[i]);
                break;
            }
        }
    }
}
