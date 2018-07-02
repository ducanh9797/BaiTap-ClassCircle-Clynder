public class Cylinder extends ClassCircle {
    double high;

    public Cylinder(double high, double radius, String color) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double Cylinder() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}