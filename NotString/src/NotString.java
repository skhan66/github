public class NotString {
    public static void main(String[] args) {
        public String notString(String str){
            if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
                return str;
            }
            return "not " + str;
        }
    }
}
