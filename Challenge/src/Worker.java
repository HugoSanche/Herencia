public class Worker {
    private String name;
    private String birthdate;
    protected String EndDate;

    public Worker(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    //16/07/1980
    public int getAge(){

        // Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Birthdate);
//        try {
//            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
//            Date date = formatter1.parse(birthdate);
//        } catch (java.text.ParseException e){
//            e.printStackTrace();
//        }

//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        System.out.println(formatter.format(date));

        // int days = Days.daysBetween(new DateTime(past), new DateTime(today)).getDays()
        int currentYear=2025;


        int birtyear=Integer.parseInt(birthdate.substring(6));

        return currentYear-birtyear;

    }
    public double collectPay(){
        return 2.0;
    }
    public void terminate(String endDate){
        //like setter of enDate buy its most cleary in this way
        this.EndDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }
}
