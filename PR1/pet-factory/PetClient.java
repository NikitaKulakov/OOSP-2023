public class PetClient {
    public static void main(String[] args) {
        PetFactory dogFactory = new DogFactory();
        Pet dog = dogFactory.createPet();
        System.out.println("Создана собака:");
        dog.makeSound();

        PetFactory catFactory = new CatFactory();
        Pet cat = catFactory.createPet();
        System.out.println("Создана кошка:");
        cat.makeSound();

        PetFactory parrotFactory = new ParrotFactory();
        Pet parrot = parrotFactory.createPet();
        System.out.println("Создан попугай:");
        parrot.makeSound();
    }
}