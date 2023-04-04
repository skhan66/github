
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListExample {
    public static void main(String[] args){
        int[] a ={1, 2, 3, 4};
System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        List<String>  myList = new ArrayList<String>();
        myList.add("Hyd");
        myList.add("Delhi");
        myList.add("Blr");

        System.out.println(myList);
        List<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(9);
        myIntList.add(8);
        myIntList.add(0);

        System.out.println(myIntList);
}
}
