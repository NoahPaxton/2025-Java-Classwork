public class Dog extends Animal {
    public Dog(String animalname) {
        super(animalname);
    }

    private void bark() {
        System.out.println("The dog" + getAnimalName() + " barks");
    }

    @Override
    public void sound() {
        bark();
    }
}
