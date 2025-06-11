public abstract class Student extends Person {
    public String Studentid;
    public double fees;

    public Student(String name, String gender, int age, String studentid) {
        super(name, gender, age);
        this.Studentid = studentid;
       // this.fees = Fees;
    }
    public abstract void GetStudentInfo();

}