# Threads

[javaTpoint](https://www.javatpoint.com/how-to-create-a-thread-in-java)

En Java, un "thread" (hilo) es la unidad más pequeña de ejecución dentro de un programa. Los threads permiten que un programa realice múltiples tareas simultáneamente, lo que puede mejorar el rendimiento y la capacidad de respuesta de una aplicación. Java proporciona soporte integrado para la creación y gestión de threads a través del paquete `java.lang.Thread` y la interfaz `java.lang.Runnable`.

Aquí hay algunos conceptos clave relacionados con los threads en Java:

1. **Clase Thread:**
   La clase `Thread` es la clase central para trabajar con threads en Java. Puedes crear un nuevo thread extendiendo esta clase y sobrescribiendo el método `run()`, que contiene el código que se ejecutará en el nuevo thread. Aquí hay un ejemplo básico:

   ```java
   class MiThread extends Thread {
       public void run() {
           // Código a ejecutar en el nuevo thread
       }
   }
   ```

2. **Interfaz Runnable:**
   Además de extender la clase `Thread`, puedes implementar la interfaz `Runnable` para crear un thread. Esta interfaz tiene un solo método llamado `run()`, similar al método `run()` en la clase `Thread`. La diferencia principal es que puedes implementar `Runnable` y luego pasar la instancia a un constructor de `Thread`.

   ```java
   class MiRunnable implements Runnable {
       public void run() {
           // Código a ejecutar en el nuevo thread
       }
   }

   // Crear un thread utilizando la interfaz Runnable
   Thread miThread = new Thread(new MiRunnable());
   ```

3. **Creación de Threads:**
   Puedes crear e iniciar un thread de varias maneras. Aquí hay dos ejemplos:

   ```java
   // Usando la clase Thread
   MiThread thread1 = new MiThread();
   thread1.start(); // Inicia el nuevo thread

   // Usando la interfaz Runnable
   MiRunnable miRunnable = new MiRunnable();
   Thread thread2 = new Thread(miRunnable);
   thread2.start();
   ```

4. **Método `start()`:**
   El método `start()` se llama en un objeto de tipo `Thread` para iniciar la ejecución del thread. Internamente, Java invoca el método `run()` en un nuevo thread creado por el sistema operativo.

5. **Método `run()`:**
   El método `run()` contiene el código que será ejecutado en el nuevo thread. Si estás extendiendo la clase `Thread`, sobrescribes este método. Si estás implementando la interfaz `Runnable`, el código se coloca en el método `run()` de la clase que implementa la interfaz.

6. **Método `join()`:**
   Puedes usar el método `join()` para hacer que un thread espere hasta que otro thread termine su ejecución. Esto es útil cuando necesitas coordinar la ejecución de múltiples threads.

   ```java
   try {
       thread1.join(); // Espera hasta que thread1 termine
       thread2.join(); // Espera hasta que thread2 termine
   } catch (InterruptedException e) {
       // Manejar la excepción si es necesario
   }
   ```

Estos son conceptos básicos de threads en Java. Es importante tener en cuenta que también existen mecanismos más avanzados para la sincronización y la comunicación entre threads, como el uso de bloqueos (`synchronized`), semáforos, y otras clases del paquete `java.util.concurrent`. Estos mecanismos ayudan a evitar problemas como las condiciones de carrera y la inconsistencia de datos cuando múltiples threads acceden a recursos compartidos.

## Sincronización

### Synchronized y Lock

`Synchronized` y `lock` son mecanismos en Java utilizados para sincronizar el acceso a recursos compartidos y evitar problemas de concurrencia.

#### `synchronized`:

1. **Bloque Synchronized:**
   - La palabra clave `synchronized` se puede aplicar a bloques de código o métodos.
   - Cuando un thread entra en un bloque `synchronized`, adquiere un bloqueo para el objeto asociado.
   - Otros threads que intentan entrar en bloques `synchronized` para el mismo objeto deben esperar hasta que el bloqueo sea liberado.

```java
public class EjemploSynchronized {
    private Object lock = new Object();

    public void metodoSincronizado() {
        synchronized (lock) {
            // Código crítico sincronizado
        }
    }
}
```

2. **Métodos Synchronized:**
   - También puedes aplicar `synchronized` a métodos completos. En este caso, el bloqueo se aplica al objeto en el que se invoca el método.

```java
public class EjemploSynchronized {
    private Object lock = new Object();

    public synchronized void metodoSincronizado() {
        // Código crítico sincronizado
    }
}
```

3. **Inconvenientes:**
   - Aunque `synchronized` es simple de usar, tiene limitaciones. Por ejemplo, no proporciona facilidades para timeouts o condiciones más avanzadas.

#### `Lock` (Interfaz y Clases Implementadoras):

1. **Reemplazo de `synchronized`:**
   - `Lock` es una interfaz en el paquete `java.util.concurrent` que proporciona una alternativa más flexible a `synchronized`.
   - Puedes crear instancias de implementaciones de `Lock` como `ReentrantLock`.

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EjemploLock {
    private Lock lock = new ReentrantLock();

    public void metodoConLock() {
        lock.lock();
        try {
            // Código crítico con lock
        } finally {
            lock.unlock();
        }
    }
}
```

2. **Manejo de Interrupciones:**
   - A diferencia de `synchronized`, los locks permiten manejar interrupciones de threads bloqueados.

```java
public class EjemploLock {
    private Lock lock = new ReentrantLock();

    public void metodoConLock() throws InterruptedException {
        lock.lockInterruptibly(); // Puede lanzar InterruptedException
        try {
            // Código crítico con lock
        } finally {
            lock.unlock();
        }
    }
}
```

3. **Condiciones:**
   - Los objetos `Condition` pueden crearse a partir de un lock y utilizarse para gestionar la ejecución condicional de threads.

```java
import java.util.concurrent.locks.Condition;

public class EjemploCondition {
    private Lock lock = new ReentrantLock();
    private Condition condicion = lock.newCondition();

    public void metodoConCondicion() throws InterruptedException {
        lock.lock();
        try {
            while (condicionNoSatisfecha) {
                condicion.await(); // Puede lanzar InterruptedException
            }
            // Código crítico con condición
        } finally {
            lock.unlock();
        }
    }
}
```

4. **Try-with-Resources:**
   - A partir de Java 7, se puede utilizar `try-with-resources` con un lock para asegurar que se libere correctamente.

```java
public class EjemploTryWithResources {
    private Lock lock = new ReentrantLock();

    public void metodoConTryWithResources() {
        try (LockScope ignored = new LockScope(lock)) {
            // Código crítico con lock
        }
    }
}

class LockScope implements AutoCloseable {
    private final Lock lock;

    public LockScope(Lock lock) {
        this.lock = lock;
        this.lock.lock();
    }

    @Override
    public void close() {
        lock.unlock();
    }
}
```

En resumen, tanto `synchronized` como `Lock` son herramientas importantes para gestionar la concurrencia en Java. La elección entre ellas dependerá de los requisitos específicos del programa y la complejidad de la lógica de sincronización que se necesita implementar. `Lock` proporciona más flexibilidad y control, pero también requiere una gestión más cuidadosa.

#### Ejemplo de `synchronized`:

Tienes una clase `Contador` con un método `incrementar()` que incrementa un contador que será compartido entre varios threads:

```java
public class Contador {
    private int contador = 0;

    public synchronized void incrementar() {
        contador++;
        System.out.println("Contador: " + contador + " - Thread: " + Thread.currentThread().getName());
    }
}
```

Aquí, el método `incrementar()` está marcado como `synchronized`, lo que significa que solo un thread puede ejecutar este método a la vez. Esto evita condiciones de carrera.

```java
public class EjemploSynchronized {
    public static void main(String[] args) {
        Contador contadorCompartido = new Contador();

        Runnable tarea = () -> {
            for (int i = 0; i < 5; i++) {
                contadorCompartido.incrementar();
            }
        };

        Thread thread1 = new Thread(tarea, "Thread 1");
        Thread thread2 = new Thread(tarea, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
```

En este ejemplo, dos threads (`Thread 1` y `Thread 2`) comparten el mismo objeto `Contador`, y cada uno ejecuta la tarea de incrementar el contador varias veces. Gracias al método `incrementar()` sincronizado, se evitan condiciones de carrera, y la salida es ordenada.


#### Ejemplo de `Lock`:

Ahora, veamos cómo podríamos lograr lo mismo usando un `Lock`. Vamos a modificar la clase `Contador`:

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Contador {
    private int contador = 0;
    private final Lock lock = new ReentrantLock();

    public void incrementar() {
        lock.lock();
        try {
            contador++;
            System.out.println("Contador: " + contador + " - Thread: " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
```

En este caso, se utiliza un `ReentrantLock`. El método `incrementar()` adquiere el lock antes de modificar el contador y lo libera en la cláusula `finally`, asegurándose de que se libere incluso si ocurre una excepción.

El código del programa principal sigue siendo el mismo que en el ejemplo anterior, ya que la interfaz de `Contador` no ha cambiado. La principal diferencia está en cómo se maneja la sincronización internamente.