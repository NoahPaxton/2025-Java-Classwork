public class Teacher extends Person {
    public String EmpID;
    public double Salary;

    public Teacher(String name, String gender, int age, String empid, double salary) {
        super(name, gender, age);
        this.EmpID = empid;
        this.Salary = salary;
    }

    public void getTeacherInfo() {
        System.out.println(this.EmpID + ", " + this.Salary);
    }
}
