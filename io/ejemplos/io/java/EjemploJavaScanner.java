import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploJavaScanner {
    public static void main(String[] args) {
        // Nombre del archivo que deseas leer
        String nombreArchivo = "./filename.txt";

        try {
            // Crear un objeto Scanner para leer el archivo
            Scanner scanner = new Scanner(new File(nombreArchivo));

            // Inicializar contador de palabras
            int contadorPalabras = 0;

            // Leer el archivo línea por línea
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                // Dividir la línea en palabras utilizando espacios como delimitadores
                String[] palabras = linea.split(" ");
                // Incrementar el contador de palabras por la cantidad de palabras en la línea
                contadorPalabras += palabras.length;
            }

            // Cerrar el scanner
            scanner.close();

            // Mostrar el resultado
            System.out.println("El archivo " + nombreArchivo + " contiene " + contadorPalabras + " palabras.");

        } catch (FileNotFoundException e) {
            // Manejo de excepción si el archivo no se encuentra
            System.err.println("No se pudo encontrar el archivo: " + nombreArchivo);
        }
    }
}
