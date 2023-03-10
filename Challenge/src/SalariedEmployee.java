public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary) {
        super(name, birthdate,  hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck=annualSalary/26;
        double ajustedPay=(isRetired) ? 0.9*payCheck:payCheck;
        return (int) ajustedPay;
    }

    public void retire(){
        terminate("10/03/2023");
        isRetired=true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}'+super.toString()+" "+this.getClass().getSimpleName().toLowerCase();
    }
}
