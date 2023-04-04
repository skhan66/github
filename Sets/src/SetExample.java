import java.util.HashSet;
import java.util.Set;
public class SetExample {
    public static void main(String[] args){
       Set<String> mySet = new HashSet<String>();
       mySet.add("Lion");
       mySet.add("Tiger");
       mySet.add("Dove");
       mySet.add("Lion");
       System.out.println(mySet);
    }
}
