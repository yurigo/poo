public class Circle extends Figure {
    private double radius;
    public double getRadius() {
        return radius;
    }

    public Circle(double radius, double x, double y) {
        super(x,y);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }


}
