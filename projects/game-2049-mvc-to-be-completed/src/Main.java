public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        UI ui = new UI();

        Controller c = new Controller(ui, b);
        c.run();
    }
}