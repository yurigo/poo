public class Dog extends Animal {
    private String unaPropiedadEspecíficaDePerros;

    public Dog(String name, Integer age, String gender, String xxx){
        super(name, age, gender);
        this.unaPropiedadEspecíficaDePerros = xxx;
    }

    public void speak(){
        System.out.println("Woof woof");
        super.speak();
    }

    public String toString(){
        return "Dog: " + this.getName();
    }
}
