public class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(){

    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
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
        return this.weight;
    }

    public void setWight(double wight) {
        this.weight = wight;
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
