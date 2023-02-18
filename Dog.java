import java.lang.ProcessBuilder.Redirect.Type;

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
        if (type=="wolf"){
            System.out.println("Lobo aullando");
        }
       bark();
       System.out.println();
    }
    public void move(String speed){
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if (speed=="slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();

    }
    private void bark(){
        System.out.println("Woof");
    }
    private void run(){
        System.out.println("Dog Running ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }
    private void wagTail(){
        System.out.println("Tail Wagging");
    }

}
