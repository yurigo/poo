public class Main {
    public static void main(String[] args) {

        // esto está prohibido
        // porque el constructor es privado
        //Car c1 = new Car();

        //Car americano = new Car("UK00000") // <--- error

        Car americanCar1 = Car.createUSCar();
        Car americanCar2 = Car.createUSCar();
        Car americanCar3 = Car.createUSCar();
        Car americanCar4 = Car.createUSCar();
        Car americanCar5 = Car.createUSCar();
        Car americanCar6 = Car.createUSCar();
        Car americanCar7 = Car.createUSCar();
        Car americanCar8 = Car.createUSCar();
        Car americanCar9 = Car.createUSCar();
        Car americanCar10 = Car.createUSCar();
        Car americanCar11 = Car.createUSCar();

        Car englishCar1 = Car.createUKCar();
        Car englishCar2 = Car.createUKCar();
        Car englishCar3 = Car.createUKCar();

        System.out.println(americanCar1.getPlate());
        System.out.println(americanCar2.getPlate());
        System.out.println(americanCar3.getPlate());
        System.out.println(americanCar4.getPlate());
        System.out.println(americanCar5.getPlate());
        System.out.println(americanCar6.getPlate());
        System.out.println(americanCar7.getPlate());
        System.out.println(americanCar8.getPlate());
        System.out.println(americanCar9.getPlate());
        System.out.println(americanCar10.getPlate());
        System.out.println(americanCar11.getPlate());

        System.out.println(englishCar1.getPlate());
        System.out.println(englishCar2.getPlate());
        System.out.println(englishCar3.getPlate());

    }
}