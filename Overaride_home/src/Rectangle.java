public class Rectangle extends Square{
    private double sideA;
    private double sideB;

    public Rectangle(double side, double sideA) {
        super(side);
        this.sideA = sideA;
        this.sideB = side;
    }

    public double calcArea(){
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "sideA=" + sideA +
                ", sideB=" + sideB;
    }
}
