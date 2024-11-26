import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        PresentationInterface p = new Presentation();
        // PresentationInterface p = new PresentacionSuperChula();

        Controller c = new Controller(b, p);
        c.run();
    }

}