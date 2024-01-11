abstract class Pet {
    public abstract void makeSound();
}

class Dog extends Pet {
    public void makeSound() {
        System.out.println("Гав");
    }
}

class Cat extends Pet {
    public void makeSound() {
        System.out.println("Мяу");
    }
}

class Parrot extends Pet {
    public void makeSound() {
        System.out.println("Здарова");
    }
}