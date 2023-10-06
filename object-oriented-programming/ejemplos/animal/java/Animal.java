// Clase Animal (superclase)
class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        // System.out.println("constructor de animal");
    }


    public void hablar(int numero) {
        System.out.println(nombre + " hace un sonido. (" + this.edad + ")");
    }

    public String getNombre(){
        return "*" + this.nombre + "*";
    }
}