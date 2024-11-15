public class Cat extends Animal {
    private String unaPropiedadEspecíficaDeGatos;

    public Cat(String name, Integer age, String gender, String xxx){
        super(name, age, gender);
        this.unaPropiedadEspecíficaDeGatos = xxx;
    }

    public void speak(){
        System.out.println("Miau miau");
    }
}
