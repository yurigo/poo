public class Point {

    private int x;
    private int y;
    private String name;



    public Point(Integer x, Integer y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point(String infoLinea) {
        String[] info = infoLinea.split(" ");
        this.x = Integer.parseInt(info[0]);
        this.y = Integer.parseInt(info[1]);
        this.name = info[2];
    }

    @Override
    public String toString() {
        return "\nPoint [x=" + x + ", y=" + y + ", name=" + name + "]";
    }
}
