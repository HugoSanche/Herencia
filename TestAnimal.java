public class TestAnimal {
    public static void main(String[] Args){
        Animal animal= new Animal("Generic Animal","Small",400.00 );
        Dog dog = new Dog();
        doAnimalSuff(dog, "Very slow");

        System.out.println("-------------Coquer----------------");

        Dog dog1= new Dog("Coquer",10);
        doAnimalSuff(dog1, "Very slow");

        System.out.println("--------------Golden----------------");

        Dog golden= new Dog("Golden Retriver",40,"Parada","Larga");
        doAnimalSuff(golden, "fast");

        Dog wolf=new Dog ("wolf", 40);
        doAnimalSuff(wolf, "slow");

        Fish godie=new Fish("GoldFish", 2.5, 2, 3);
        doAnimalSuff(godie, "fast");
        
    }
    public static void doAnimalSuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);


        System.out.println(animal);
        System.out.println("----");
    }
}
