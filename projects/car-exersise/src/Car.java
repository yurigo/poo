public class Car {
    static private int platesUS = 0;
    static private int platesUK = 0;
    private String plate;

    // constructor
    private Car(String plate){
        this.plate = plate;
    }

    static public Car createUSCar(){
        // tengo que montar la plate: el formato es 00001US.
        // tengo que montar la plate: el formato es 00002US.
        // tengo que montar la plate: el formato es 00003US.
        platesUS = platesUS + 1;

        String plate = String.format("%05dUS", platesUS);

        return new Car(plate);
    }

    static public Car createUKCar(){
        platesUK++;

        String plate = String.format("UK%05d", platesUK);

        return new Car(plate);

    }

    public String getPlate(){
        return plate;
    }


}
