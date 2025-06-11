public class FullTimeEmployee extends Employee {
    public int WorkingHours;

         public FullTimeEmployee(String name, int paymentPerHour, int workinghours) {
        super(name, paymentPerHour);
        this.WorkingHours = workinghours;
    }

    @Override
    public int CalculateSalary() {
        return GetPaymentPerHour() * WorkingHours;
    }
}