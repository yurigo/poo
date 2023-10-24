import java.util.*;

public class Main {

    public static void main(String[] args) {
        UI ui = new UI();
        Business business = new Business();
        ui.wellcome();

        Controller controller = new Controller(ui, business);
        controller.run();
    }

}