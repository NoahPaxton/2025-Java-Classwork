public class Person {
    public String Name;
    public String Gender;
    public int Age;

    public Person(String name, String gender, int age) {
        super();
        this.Name = name;
        this.Gender = gender;
        this.Age = age;
    }

    public void getInfo() {
        System.out.println(this.Name + ", " + this.Gender + ", " + this.Age);
    }

}
