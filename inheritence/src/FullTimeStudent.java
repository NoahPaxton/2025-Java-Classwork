public class FullTimeStudent extends Student {
    private double hours;
    public FullTimeStudent(String name, String gender, int age, String studentid, int hours) {
        super(name, gender, age, studentid);
        this.hours = hours;
    }

    @Override
    public void GetStudentInfo() {
        this.fees = hours * 5;
        System.out.println(this.hours + " ," + this.Studentid + ", " + this.fees);
    }
}
