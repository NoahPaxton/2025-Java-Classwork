public class Main {
    public static void main(String[] args) {
        Test t1=new Test(15, 5);
        System.out.println(t1.Number1);
        t1.Number1=24;
        System.out.println("the number 1 + " + t1.Number1 + " " + t1.getNumber2());
        t1.setNumber2(3);
        System.out.println("the number 1 + " + t1.Number1 + " " + t1.getNumber2());

        Test t2=new Test(13333, 542355325);
    }
}
