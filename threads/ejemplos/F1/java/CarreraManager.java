public class CarreraManager implements FormulaUnoListener {

    FormulaUno formulaUno1;
    FormulaUno formulaUno2;
    FormulaUno formulaUno3;
    FormulaUno formulaUno4;


    Thread hilo1;
    Thread hilo2;
    Thread hilo3;
    Thread hilo4;

    public void run() throws InterruptedException {
        //clear screen
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        Utils.clearScreen();

        //
        System.out.println("GO!!!!");

        formulaUno1 = new FormulaUno("Fernando AIlonso");
        formulaUno2 = new FormulaUno("Max VerstAIppen");
        formulaUno3 = new FormulaUno("Lewis HAImilton");
        formulaUno4 = new FormulaUno("Carlos SAInz");

        formulaUno1.addCaballoListener(this);
        formulaUno2.addCaballoListener(this);
        formulaUno3.addCaballoListener(this);
        formulaUno4.addCaballoListener(this);

        hilo1 = new Thread(formulaUno1);
        hilo2 = new Thread(formulaUno2);
        hilo3 = new Thread(formulaUno3);
        hilo4 = new Thread(formulaUno4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();

        System.out.println("Fin!");
    }

    @Override
    public void formulaUnoAvanza(FormulaUno c , int porcentaje) {

        repaint();

        if (porcentaje >= 100) {
            endRace(c.getNombre());
        }


    }

    public void repaint() {
        //clear screen
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        Utils.clearScreen();
        //print
        // System.out.println(caballo1.getNombre(10) + " " + "#".repeat(caballo1.getPorcentaje()));
        System.out.println(formulaUno1.getNombre(20) + " " + formulaUno1.getVisualizacion());
        System.out.println(formulaUno2.getNombre(20) + " " + formulaUno2.getVisualizacion());
        System.out.println(formulaUno3.getNombre(20) + " " + formulaUno3.getVisualizacion());
        System.out.println(formulaUno4.getNombre(20) + " " + formulaUno4.getVisualizacion());

    }

    public void endRace(String winnerName){

        System.out.println();
        System.out.println(" 🏅 " + winnerName + " ha ganado");
        System.out.println();

        hilo1.interrupt();
        hilo2.interrupt();
        hilo3.interrupt();
        hilo4.interrupt();
    }
}
