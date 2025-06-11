public class Animal {
    private String AnimalName;

    public Animal(String animalname) {
        this.AnimalName = animalname;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalname) {
        this.AnimalName = animalname;
    }

    public void sound() {
        System.out.println("animal has no sound");
    }
}
