public interface PetFactory {
    Pet createPet();
}

class DogFactory implements PetFactory {
    public Pet createPet() {
        return new Dog();
    }
}

class CatFactory implements PetFactory {
    public Pet createPet() {
        return new Cat();
    }
}

class ParrotFactory implements PetFactory {
    public Pet createPet() {
        return new Parrot();
    }
}