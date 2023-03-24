public class MyClass {
    public static void main(String[] args){
        System.out.println(sumOfTwoNums(4,5));
        System.out.println(diffOfTwoNums(9,3));
        System.out.println(proOfTwoNums(2,3));
    }
    public static int sumOfTwoNums(int a, int b){
        return a+b;
    }
    public static int proOfTwoNums(int a, int b){
        return a*b;
    }
    public static int diffOfTwoNums(int a, int b){
        return a-b;
    }
}
