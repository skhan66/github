
import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args){
     Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Hyd");
        myMap.put(2, "Blr");
        myMap.put(31, "Cali");
        System.out.println(myMap.get(1));
        Map<String, String> myStringMap = new HashMap<String, String>();
        myStringMap.put("telugu", "Dasara");
        myStringMap.put("hindi", "Pathaan");
        myStringMap.put("english", "John Wick");
        System.out.println(myStringMap);
        System.out.println(myStringMap.get("hindi"));

}
}
