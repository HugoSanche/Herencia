public class Employee extends Worker {
    private String hireDate;
    private static int employeeId=1;
    public Employee(String name, String birthdate, String hireDate) {
        super(name, birthdate);
        this.employeeId = employeeId++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}'+super.toString();
    }
}
