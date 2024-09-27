public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.moveTo(1, 1);

        Point p2 = new Point();
        p2.moveTo(4, 2);

        double manhattanDistance = p2.manhattanDistance(p1);
        System.out.println(manhattanDistance);

        p1.translateTo(200,314);




    }


}