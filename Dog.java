public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        //Si no pones super(); por default lo realizara
        super("Chihuhua","Very small", 10); //marca error si no defines en el padre un default constructor(constructor sin argumentos)       
    }

    //Este constructor sirve para los perros que son "perkey" y "curley"
    public Dog(String type, double wight){
        this(type,wight,"Perky","Curley");
    }

    public Dog(String type, double wight, String earShape, String tailShape) {
        super(type, wight<15 ? "Small" : (wight<35 ? "Medium" : "Large"), wight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public String getEarShape() {
        return this.earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return this.tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    //OJO
    //Si toString esta en el hijo imprime el del hij
    //si el el hijo no tiene toString imprime el toString del padre
    @Override
    public String toString() {
        return "{" +
            " earShape='" + getEarShape() + "'" +
            ", tailShape='" + getTailShape() + "'" +
            "} "+super.toString();
    }

    public void makeNoise(){
       
    }
    public void move(String speed){
        super.move(speed);
    }
}
