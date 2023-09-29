## Excepciones en Java

Las excepciones son eventos inesperados o errores que pueden ocurrir durante la ejecución de un programa Java. Estos errores pueden ser causados por diversas circunstancias, como entrada de datos incorrecta, problemas de acceso a archivos, errores de lógica, entre otros.

### Tipos de Excepciones

#### Excepciones Checked (Excepciones Comprobadas):

- **Definición:** Las excepciones comprobadas son excepciones que el compilador de Java obliga a gestionar o declarar explícitamente en un método utilizando la palabra clave `throws`.

- **Ejemplos:** Algunos ejemplos de excepciones comprobadas son `IOException`, `FileNotFoundException` y `SQLException`. Estas excepciones generalmente están relacionadas con operaciones que pueden generar errores, como lectura/escritura de archivos o acceso a bases de datos.

- **Manejo:** Para manejar excepciones comprobadas, debes utilizar un bloque `try-catch` o declarar la excepción en la firma del método utilizando `throws`. Esto obliga al programador a tomar medidas específicas para lidiar con la excepción.

- **Beneficios:** Las excepciones comprobadas hacen que el código sea más robusto al forzar al programador a manejar los posibles errores de manera explícita. Esto contribuye a una detección temprana de problemas y a una mejor gestión de errores.

#### Excepciones Unchecked (Excepciones No Comprobadas):

- **Definición:** Las excepciones no comprobadas son excepciones que no requieren que se gestionen explícitamente ni que se declaren en la firma del método.

- **Ejemplos:** Algunos ejemplos de excepciones no comprobadas son `NullPointerException`, `ArrayIndexOutOfBoundsException` y `ArithmeticException`. Estas excepciones suelen estar relacionadas con errores de lógica o problemas que el programador debería evitar mediante una programación cuidadosa.

- **Manejo:** Las excepciones no comprobadas no requieren un manejo explícito. Sin embargo, si no se manejan adecuadamente, pueden causar fallos en tiempo de ejecución y problemas en la aplicación.

- **Beneficios:** Las excepciones no comprobadas son útiles para representar errores que generalmente son resultado de errores de programación y que no se pueden anticipar fácilmente. Esto permite que el código sea más conciso y legible.

### Gestión de Excepciones

- En Java, las excepciones se gestionan mediante bloques `try-catch` que permiten detectar y manejar errores de manera controlada.

- El bloque `try` se utiliza para envolver el código que podría generar una excepción.

- El bloque `catch` se utiliza para especificar cómo se debe manejar la excepción si ocurre.

- También se puede utilizar el bloque `finally` opcional para ejecutar código que debe ejecutarse, independientemente de si se produce una excepción o no.

### Lanzamiento de Excepciones

- Puedes lanzar excepciones manualmente utilizando la palabra clave `throw`. Esto es útil cuando deseas indicar una situación excepcional en tu código.

- Las excepciones lanzadas manualmente deben ser capturadas y manejadas en algún lugar de tu programa.

En resumen, las excepciones son mecanismos en Java para manejar errores y situaciones excepcionales. Las excepciones comprobadas deben gestionarse o declararse explícitamente, mientras que las excepciones no comprobadas generalmente están relacionadas con errores de programación y no requieren manejo explícito.

### Ejemplo

```java
public class EjemploExcepciones {
    public static void main(String[] args) {
        try {
            // Intenta realizar una división por cero
            int resultado = dividir(10, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Captura la excepción y maneja el error
            System.out.println("Error: No se puede dividir por cero.");
        }

        // El programa continúa después de manejar la excepción
        System.out.println("Fin del programa.");
    }

    public static int dividir(int numerador, int denominador) {
        // Intenta realizar la división
        return numerador / denominador;
    }
}
```

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {
    public static void main(String[] args) {
        // Nombre del archivo a leer
        String nombreArchivo = "archivo.txt";

        try {
            // Crear un objeto FileReader para abrir el archivo
            FileReader archivo = new FileReader(nombreArchivo);

            // Crear un objeto BufferedReader para leer el archivo de manera eficiente
            BufferedReader lector = new BufferedReader(archivo);

            String linea;

            // Leer y mostrar cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar el archivo
            lector.close();
        } catch (IOException e) {
            // Captura y maneja excepciones relacionadas con la lectura de archivos
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

```