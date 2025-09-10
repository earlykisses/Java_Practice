class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}
public class Create_class_employee {
    public static void main(String[] args){
        Employee myEmployee = new Employee(101, "Alice Johnson", 50000);
        System.out.println("Employee Details:");
        System.out.println("Employee Number: " + myEmployee.getEmpNo());
        System.out.println("Employee Name: " + myEmployee.getEmpName());
        System.out.println("Employee Basic Salary: " + myEmployee.getEmpBasic());
    }
}
