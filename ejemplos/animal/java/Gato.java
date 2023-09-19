 class Gato extends Animal{
    public Gato(String name) {
        super(name);
        // System.out.println("constructor de gato");

    }


    public void hablar() {
        System.out.println(this.getNombre() + " dice MIAU.");
    }
}
