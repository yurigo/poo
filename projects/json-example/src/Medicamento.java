public class Medicamento {
    private String nombre;
    private int dosis;
    private int frecuencia;

    public Medicamento(String nombre, int dosis, int frecuencia) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
    }

    public String toString(){
        return this.nombre + ": " + this.dosis + "mg cada " + this.frecuencia + " hora(s)";
    }
}
