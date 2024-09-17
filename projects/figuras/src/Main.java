public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Rectangle cuadrado = new Rectangle(10, 10);
        Circle circulo = new Circle(100);
        Circle circulo2 = new Circle(10,10,70);

        // cuadrado.setHeight(-10);
        // cuadrado.setWidth(10);
        // circulo.setRadius(10);

        System.out.println(cuadrado.calculateArea());
        System.out.println(circulo.calculateArea());
        System.out.println(circulo2.calculateArea());



    }
}
