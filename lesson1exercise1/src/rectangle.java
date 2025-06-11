public class rectangle {
    private int sideA;
    private int sideB;

    public rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getArea() {
        return sideA * sideB;
    }

    public int getPerimeter() {
        return sideA + sideB * 2;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
