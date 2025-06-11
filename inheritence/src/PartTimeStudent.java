public class PartTimeStudent extends Student {
    private int hours;
    public PartTimeStudent(String name, String gender, int age, String studentid, int hours) {
        super(name, gender, age, studentid);
        this.hours = hours;
        double fees = hours / 100;
    }

    @Override
    public void GetStudentInfo() {
        this.fees = hours * 10;
        System.out.println(this.hours + " ," + this.Studentid + ", " + this.fees);
    }
}
