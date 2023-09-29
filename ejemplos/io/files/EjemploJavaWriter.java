import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class EjemploJavaWriter {
    public static void main(String[] args) {
        // Nombre del archivo en el que escribir
        String nombreArchivo = "usuarios.json";

        try {
            // Crear un objeto FileWriter para abrir o crear el archivo
            //FileWriter archivo = new FileWriter(nombreArchivo);

            // Crear un objeto BufferedWriter para escribir en el archivo de manera eficiente
            //BufferedWriter escritor = new BufferedWriter(archivo);

            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));

            String json = "";
            json += "[";
            json += "  {\"nombre\": \"John\" , \"edad\": 33 },";
            json += "  {\"nombre\": \"Jane\" , \"edad\": 32 }";
            json += "]";

            // Escribir las líneas en el archivo
            escritor.write(json);


            // Cerrar el archivo
            escritor.close();

            System.out.println("Se ha escrito en el archivo correctamente.");
        } catch (IOException e) {
            // Captura y maneja excepciones relacionadas con la escritura de archivos
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}