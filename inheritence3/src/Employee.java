public abstract class Employee {
    private String name;
    private int PaymentPerHour;

    public Employee(String name, int paymentperhour) {
        this.name = name;
        this.PaymentPerHour = paymentperhour;
    }


    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int GetPaymentPerHour() {
        return PaymentPerHour;
    }

    public void SetPaymentPerHour(int paymentperhour) {
        this.PaymentPerHour = paymentperhour;
    }

    public abstract int CalculateSalary();

}
