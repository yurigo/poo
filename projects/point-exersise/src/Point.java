public class Point {
    private double x;
    private double y;

//    public Point(int x, int y) {
//    }

    public void moveTo(double newX , double newY){
        this.x = newX;
        this.y = newY;
    }

    //...

    public double manhattanDistance(Point point) {
        //punto actual = x,y
        //punto recibido = point.x, point.y
        return Math.abs( point.x - x ) + Math.abs(point.y - y);

        //Disponible en Math.
        //Math.sqrt(4)
        //Math.pow(1,2)
    }

}
