import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Capybara c1 = new Capybara("Fernanda", 38, "F");
        Capybara c2 = new Capybara("Laura", 99, "F");
        Dog p = new Dog("Bobby", 7 , "M" , "Lorem ipsum");
        Cat cat = new Cat("Calipo", 8 , "M" , "Dolor sit amet");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(c1);
        animals.add(c2);
        animals.add(p);
        animals.add(cat);

        for (Animal a : animals) {
            System.out.println(a.toString());
            a.speak();
        }
    }
}