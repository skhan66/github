package Session3;
import java.sql.SQLOutput;
public class MainClass {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.setEmpName("Sarwath");
        emp1.setEmpId(123);
        System.out.println(emp1.getEmpId());
    }
}
class Employee {
    private String empName;
    private int empId;
    public void setEmpName(String name) {
        this.empName = name;
    }
    // getter
    public String getEmpName() {
        return this.empName;
    }
    public void setEmpId(int id) {
        this.empId = id;
    }
    public int getEmpId() {
        return this.empId;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }
}
