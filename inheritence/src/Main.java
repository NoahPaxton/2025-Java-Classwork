public class Main {
    public static void main(String[] args) {
        Person person1=new Person("John", "Male", 23);
        FullTimeStudent student1=new FullTimeStudent("Paul", "Male", 18, "3in4u3", 100);
        PartTimeStudent student=new PartTimeStudent("Jake", "Male", 45, "345tf", 50);
        Teacher teacher1=new Teacher("oefji", "Male", 27, "efir", 344567);
        person1.getInfo();
        student1.getInfo();
        student1.GetStudentInfo();
        teacher1.getInfo();
        teacher1.getTeacherInfo();
        student.GetStudentInfo();
        student.getInfo();
    }
}
