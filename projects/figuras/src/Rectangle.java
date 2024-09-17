public class Rectangle extends Figure {

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        // controlar cosas
        if (height < 0){
            System.out.println("Error: Height must be a positive number");
            return;
        }
        this.height = height;
    }

    private double width;
    private double height;



    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }
}
