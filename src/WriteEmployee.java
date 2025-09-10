import java.util.Scanner;
class Employees {
    private int empNo;
    private String empName;
    private int empBasic;
    public Employees(int empNo, String empName, int empBasic) {
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

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the following employee details:");

        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee Basic Salary: ");
        int empBasic = scanner.nextInt();

        Employees newEmployee = new Employees(empNo, empName, empBasic);

        System.out.println("\n--- Storing and Retrieving Details ---");
        System.out.println("Employee data has been successfully stored.");
        System.out.println("Now retrieving the details from the object...");

        System.out.println("\nEmployee Details:");
        System.out.println("Employee Number: " + newEmployee.getEmpNo());
        System.out.println("Employee Name: " + newEmployee.getEmpName());
        System.out.println("Employee Basic Salary: " + newEmployee.getEmpBasic());

        scanner.close();
    }
}