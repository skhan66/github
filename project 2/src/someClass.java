public class someClass {
    public static void main(String[] args) {
System.out.println(getProduct(2,3));
        System.out.println(canFly(true));
        System.out.println(canFly(false));
    }
    public static int getProduct(int a, int b) {
        return a * b;
    }
    public static boolean canFly(boolean hasWings)
    {
        if (hasWings == true){
            return true;
        }
        else{
            return false;
        }
    }
}
