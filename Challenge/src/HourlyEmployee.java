public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, String hireDate, double hourlyPayRate) {
        super(name, birthdate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}'+" "+this.getClass().getSimpleName().toLowerCase();
    }

    @Override
    public double collectPay() {
        return 40* hourlyPayRate;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }
}
