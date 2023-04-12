public class MainClass {
    public static void main(String[] args) {
        String str = "Hello";
        String result = withoutEnd(str);
        System.out.println(result);
    }
        public static String withoutEnd(String str) {
            if(str.length()>= 2)
            {
                return str.substring(1, str.length()-1);
            }
            else{
                return str;
            }
        }

    }
