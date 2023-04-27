package Employee;

public class MainClass {
    public static void main(String[] args){
        Employee e1 = new Employee(1234, "Sarwath");
        Employee e2 = new Employee(1234, "Sarwath");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.equals(e2));
    }
}
