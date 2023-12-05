public class Main {
    public static void main(String[] args) throws InterruptedException {

        Utils.clearScreen();

        System.out.print("3\r");
        Thread.sleep(1000);
        System.out.print("2\r");
        Thread.sleep(1000);
        System.out.print("1\r");
        Thread.sleep(1000);


        CarreraManager cm = new CarreraManager();

        cm.run();
    }
}