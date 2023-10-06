import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploJavaReader {
    public static void main(String[] args) {
        // Nombre del archivo a leer
        String nombreArchivo = "./filename.txt";

        try {
            // Crear un objeto FileReader para abrir el archivo
            FileReader archivo = new FileReader(nombreArchivo);

            // Crear un objeto BufferedReader para leer el archivo de manera eficiente
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            int contadorPalabras = 0;

            // Leer y mostrar cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                String[] splittedLine = linea.split(" ");
                contadorPalabras = contadorPalabras + splittedLine.length;
            }

            System.out.println("el archivo tiene: " + contadorPalabras +" palabras");

            // Cerrar el archivo
            lector.close();
        } catch (IOException e) {
            // Captura y maneja excepciones relacionadas con la lectura de archivos
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
