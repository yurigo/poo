// Subclases de Animal
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
        // System.out.println("constructor de perro");
    }

//    @Override
//    public void hablar() {
//        System.out.println(this.getNombre() + " dice GUAU.");
//    }


    public void hablar(){
        System.out.println(this.getNombre() + " dice GUAU.");
    }
}