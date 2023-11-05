public class Circle extends Square {
    private double radius;

    public Circle(double side) {
        super(side);
        this.radius = side;
    }
    public double calcArea(){
        return (radius * radius) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle" +
                "radius=" + radius;
    }
}
