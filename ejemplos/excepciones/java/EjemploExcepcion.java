public class EjemploExcepcion {
    public static void main(String[] args) {

        try {
            double resultado = dividir(10.0, 100.0);
            System.out.println("El resultado es: " + resultado);
        }
        catch (ArrayStoreException ex){
            System.out.println("Ha habido un error de ArrayStore: " + ex.getMessage() + ", " + ex.getClass());
        }
        catch (ArithmeticException ex){
            System.out.println("Ha habido un error aritméticod: " + ex.getMessage() + ", " + ex.getClass());
        }
        catch (Exception ex){
            System.out.println("Ha habido un error: " + ex.getMessage() + ", " + ex.getClass());
        }
        // El programa continúa después de manejar la excepción
        System.out.println("Fin del programa.");
    }

    public static double dividir(double numerador, double denominador) throws Exception{
        try{

            if (denominador == 100.0){
                throw new Exception("NO SE PUEDE DIVIDIR POR 100!!!!!!11");
            }
            // Intenta realizar la división
            return numerador / denominador;
        }
        catch(Exception ex){
            System.out.println("dentro de dividir digo que: No se puede dividir por 100.0");
            throw ex;
            // return -1;
        }
    }
}