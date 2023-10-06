public class Pajaro extends Animal{
    public Pajaro(String name) {
        super(name);
        // System.out.println("constructor de pajaro");
    }

    public void hablar() {
        System.out.println(this.getNombre() + " dice PIO.");
    }

}
