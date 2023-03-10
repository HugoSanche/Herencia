public class Main {
    public static void main(String[] args) {


        SalariedEmployee hugo=new SalariedEmployee("Hugo", "16/07/1980","01/01/2007",24000);

        System.out.println("Age = "+hugo.getAge());
        System.out.println("Pay "+hugo.collectPay());

        SalariedEmployee veronica=new SalariedEmployee("Veronica", "16/07/1986","01/07/2017",24000);

        System.out.println(veronica);
        System.out.println("Veronica Paycheck = $"+veronica.collectPay());
        veronica.retire();
        System.out.println("Veronica Pension check = $ " +veronica.collectPay());

        HourlyEmployee diana=new HourlyEmployee("Diana", "16/07/1988","01/01/2020",35);
        System.out.println("Diana Paycheck = $"+diana.collectPay());
        System.out.println("Diana Holyday Pay = $ " +diana.getDoublePay());
    }
}