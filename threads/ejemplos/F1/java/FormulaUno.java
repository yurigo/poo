public class FormulaUno implements Runnable {

    private String nombre;
    private int porcentaje = 0;
    private FormulaUnoListener listener;

    public FormulaUno(String nombre) {
        this.nombre = nombre;
        this.porcentaje = 0;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre(int padding) {
        padding = padding - 3;

        // string substring or padding until i and ...
        return String.format("%-" + padding + "s", this.nombre).substring(0, padding)
                + (padding>this.nombre.length() ? "   " : "...");

        // fails when i is greater than nombre.length()
        // return this.nombre.substring(0, i);
    }

    public String getVisualizacion() {

        if (this.porcentaje >= 100) {
            return "| " + "_".repeat(100) +"_____ | "+ ">ó=ò> 🏅" ;
        }

        return "| " + "_".repeat(this.getPorcentaje()) + ">ó=ò>" + " ".repeat(100 - this.getPorcentaje()) + " |";
    }

    @Override
    public void run() {

        int numAleatorio;
        int tiempoDeEspera;

        try {
            while (porcentaje < 100) {
                tiempoDeEspera = Utils.getRandomNumber(500, 2000);
                Thread.sleep(tiempoDeEspera);

                numAleatorio = Utils.getRandomNumber(1, 15);
                // System.out.println(nombre + " ha aumentado en " + numAleatorio);
                this.porcentaje += numAleatorio;

                if (this.porcentaje > 100) {
                    this.porcentaje = 100;
                }

                // this.setChanged();
                // this.notifyObservers(porcentaje);
                // this.clearChanged();
                listener.formulaUnoAvanza(this, this.porcentaje);
            }
        } catch (InterruptedException ex) {
            // System.out.println("Hilo interrumpido");
        }

    }


    public void addCaballoListener(FormulaUnoListener listener) {
        this.listener = listener;
    }
}