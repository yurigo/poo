import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemploJavaNioFile {
    public static void main(String[] args) {
        // Ruta al archivo que deseas leer
        String rutaArchivo = "./filename.txt";

        try {
            // Leer todas las líneas del archivo en una lista
            Path archivo = Paths.get(rutaArchivo);
            List<String> lineas = Files.readAllLines(archivo);

            // Inicializar contador de palabras
            int contadorPalabras = 0;

            // Recorrer cada línea y contar las palabras
            for (String linea : lineas) {
                // Dividir la línea en palabras utilizando espacios como delimitadores
                String[] palabras = linea.split(" ");
                // Incrementar el contador de palabras por la cantidad de palabras en la línea
                contadorPalabras += palabras.length;
            }

            // Mostrar el resultado
            System.out.println("El archivo " + rutaArchivo + " contiene " + contadorPalabras + " palabras.");

        } catch (IOException e) {
            // Manejo de excepción en caso de errores de lectura
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}