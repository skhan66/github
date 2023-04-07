import com.sun.source.doctree.DeprecatedTree;
public class Something {
    public static void main(String[] args){
        Department dept1 = new Department("Biology", 102);
        dept1.deptName = "Physics";
        dept1.deptCode = 101;
        Department dept2 = new Department("Physics", 101);
        System.out.println(dept2);
    }
}
class Department{
    public String deptName;
    public int deptCode;

    public Department(String name, int code){
        this.deptName = name;
        this.deptCode = code;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptCode=" + deptCode +
                '}';
    }
}