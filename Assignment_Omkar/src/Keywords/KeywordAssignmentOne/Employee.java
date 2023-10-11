package Keywords.KeywordAssignmentOne;

public class Employee {
    int employeeId;
    String employeeName;
    String DOB;
    String jobTitle;
    public static int noOfEmployee;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String DOB, String jobTitle) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.DOB = DOB;
        this.jobTitle = jobTitle;
        noOfEmployee++;
    }
}
