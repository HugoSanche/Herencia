public class Animal {
    private String type;
    private String size;
    private double wight;

    public Animal(){

    }
    public Animal(String type, String size, double wight) {
        this.type = type;
        this.size = size;
        this.wight = wight;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWight() {
        return this.wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", size='" + getSize() + "'" +
            ", wight='" + getWight() + "'" +
            "}";
    }
    public void move(String speed){
        System.out.println(type+" moves " +speed);
    }
    public void makeNoise(){
        System.out.println(type+" make some type of noise");
    }
}
