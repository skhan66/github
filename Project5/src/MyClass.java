public class MyClass {
    public static void main(String[] args){
        int[] a = {3, 4, 3,0};
        String[] strArr = {"This","is","Sarwath"};
        char[] charArr ={'a', 'v'};
        boolean[] boolArr = {true, false,true, true};
        double[] dArr= {0.2, 0.999};
        String somestr = "kanpur";
        System.out.println(somestr + somestr);
        String s=somestr.substring(0,3);
        System.out.println(s+s+s);
        String otherString="Kanpur";
        System.out.println(somestr.equals(otherString));
        System.out.println(somestr.equalsIgnoreCase(otherString));

    }
}
