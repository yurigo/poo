public class Animal {
    private String name;
    private int age;
    private String gender;

    // public Animal() {}

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("The animal speaks");
    }
}
