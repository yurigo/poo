# Programación orientada a objetos

## Clases y Objetos:

   - Las clases son plantillas para crear objetos en la programación orientada a objetos (POO).
   - Los objetos son instancias concretas de una clase que pueden tener atributos (variables) y métodos (funciones) asociados.
   - Las clases definen la estructura y el comportamiento de los objetos, y los objetos representan datos y acciones en el programa.

Crea una clase "Persona" con atributos como nombre, edad y dirección. Luego, crea objetos de esta clase e imprime sus atributos.

```java
// Clase Persona
class Persona {
    String nombre;
    int edad;
    String direccion;
    
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30, "Calle 123");
        Persona persona2 = new Persona("María", 25, "Avenida XYZ");
        
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}
```

Implementa una clase "Coche" con métodos para acelerar y frenar. Crea varios objetos de esta clase y simula su movimiento.

```java
class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El coche " + marca + " " + modelo + " acelera a " + velocidad + " km/h.");
    }

    public void frenar(int decremento) {
        if (velocidad - decremento >= 0) {
            velocidad -= decremento;
        } else {
            velocidad = 0;
        }
        System.out.println("El coche " + marca + " " + modelo + " frena a " + velocidad + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");

        coche1.acelerar(30);
        coche2.acelerar(50);

        coche1.frenar(10);
        coche2.frenar(20);
    }
}
```

## Herencia:

   - La herencia es un concepto clave en la POO que permite crear nuevas clases basadas en clases existentes (superclases).
   - Las subclases heredan atributos y métodos de sus superclases, lo que promueve la reutilización de código y la jerarquía de clases.
   - Las subclases pueden agregar nuevos atributos y métodos o modificar el comportamiento heredado.

Crea una jerarquía de clases relacionadas, por ejemplo, "Animal" con subclases "Perro", "Gato" y "Pájaro". Define atributos y métodos específicos para cada subclase.

```java
// Clase Animal (superclase)
class Animal {
    String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hablar() {
        System.out.println(nombre + " hace un sonido.");
    }
}

// Subclases de Animal
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hablar() {
        System.out.println(nombre + " ladra.");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hablar() {
        System.out.println(nombre + " maulla.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Perro("Max");
        Animal animal2 = new Gato("Luna");
        
        animal1.hablar();
        animal2.hablar();
    }
}
```

## 4 pilares sobre la programación orientada a objetos

### Abstracción

> - La abstracción consiste en simplificar y modelar objetos del mundo real en términos de clases y objetos en un programa.
> - Permite representar solo los aspectos esenciales de un objeto, ocultando los detalles innecesarios.
> - Ayuda a crear una representación más clara y comprensible de la realidad, facilitando el diseño y la implementación de sistemas de software.



### Encapsulamiento 

> `CAJA NEGRA`

> - El encapsulamiento es el principio de ocultar los detalles internos de una clase y exponer una interfaz pública para interactuar con ella.
> - Los atributos se declaran como privados para protegerlos del acceso directo desde fuera de la clase.
> - Los métodos públicos (getters y setters) se utilizan para acceder y modificar los atributos de manera controlada.
> - Proporciona control sobre el acceso y la modificación de datos, mejorando la seguridad y el mantenimiento del código.

La encapsulación es uno de los conceptos fundamentales en la programación orientada a objetos que consiste en ocultar los detalles internos de una clase y exponer solo una interfaz pública para interactuar con los objetos de esa clase. Esto se logra utilizando atributos privados y proporcionando métodos públicos para acceder y modificar esos atributos de manera controlada. Aquí tienes un ejemplo sencillo de encapsulación en Java:

```java
public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método público para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método público para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método público para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método público para establecer la edad
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}
```

En este ejemplo, la clase `Persona` encapsula los atributos `nombre` y `edad`. Estos atributos son privados, lo que significa que no se pueden acceder directamente desde fuera de la clase. En su lugar, la clase proporciona métodos públicos (`getNombre`, `setNombre`, `getEdad` y `setEdad`) para acceder y modificar estos atributos.

Por ejemplo, para obtener el nombre de una persona, se utiliza el método `getNombre`:

```java
Persona persona = new Persona("Juan", 30);
String nombre = persona.getNombre();
```

Y para establecer la edad de una persona, se utiliza el método `setEdad`, que realiza una validación para asegurarse de que la edad no sea negativa:

```java
persona.setEdad(25);  // Establecer la edad a 25
persona.setEdad(-5);  // Esto mostrará un mensaje de error
```

La encapsulación asegura que los datos internos de un objeto estén protegidos y que las operaciones sobre esos datos se realicen de manera controlada, lo que mejora la seguridad y la integridad del código.


Otro ejemplo de encapsulación para ocultar los detalles internos de programación:

La clase `Punto` donde la implementación interna puede ser modificada sin afectar la interfaz pública:

```java
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
```

En este ejemplo, la clase `Punto` tiene dos atributos privados, `x` e `y`, que representan las coordenadas del punto. La interfaz pública de la clase incluye métodos para obtener y establecer las coordenadas (`getX`, `getY`, `setX`, `setY`) y un método `toString` para representar el punto como una cadena.

Ahora, puedes modificar la implementación interna para usar una tupla o cualquier otra estructura de datos que desees, y aún así, la interfaz pública de la clase `Punto` permanecerá inalterada. Por ejemplo, puedes cambiar la implementación interna a una tupla:

```java
public class Punto {
    private Tuple2<Double, Double> coordenadas;

    public Punto(double x, double y) {
        coordenadas = new Tuple2<>(x, y);
    }

    public double getX() {
        return coordenadas.getFirst();
    }

    public double getY() {
        return coordenadas.getSecond();
    }

    public void setX(double x) {
        coordenadas.setFirst(x);
    }

    public void setY(double y) {
        coordenadas.setSecond(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
```

En este segundo ejemplo, hemos cambiado la implementación interna de la clase `Punto` para utilizar una tupla (`Tuple2`) en lugar de variables separadas `x` e `y`. Sin embargo, la interfaz pública de la clase `Punto` sigue siendo la misma, y los métodos públicos para acceder y modificar las coordenadas no han cambiado. Esto demuestra cómo puedes modificar la implementación interna sin afectar la interfaz pública de la clase `Punto`, manteniendo la encapsulación.

O puedes utilizar un array de 2 posiciones para implementar la clase `Punto`. Aquí tienes un ejemplo de cómo podrías hacerlo:

```java
public class Punto {
    private double[] coordenadas;

    public Punto(double x, double y) {
        coordenadas = new double[]{x, y};
    }

    public double getX() {
        return coordenadas[0];
    }

    public double getY() {
        return coordenadas[1];
    }

    public void setX(double x) {
        coordenadas[0] = x;
    }

    public void setY(double y) {
        coordenadas[1] = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
```

En este ejemplo, hemos reemplazado los atributos `x` e `y` con un array `coordenadas` de 2 posiciones. Los métodos públicos `getX`, `getY`, `setX` y `setY` acceden y modifican las posiciones del array correspondientes a las coordenadas `x` e `y`. La interfaz pública de la clase `Punto` permanece igual que en ejemplos anteriores, lo que demuestra cómo puedes cambiar la implementación interna (de variables separadas a un array) sin afectar la interfaz pública de la clase `Punto`.


### Herencia

> - La herencia permite crear nuevas clases (subclases) basadas en clases existentes (superclases).
> - Las subclases heredan atributos y métodos de las superclases, lo que promueve la reutilización de código y la jerarquía de clases.
> - Las subclases pueden agregar nuevos atributos y métodos o modificar el comportamiento heredado.
> - Facilita la creación de relaciones "es un" entre objetos y promueve la coherencia en la estructura del software.

### Polimorfismo

> - El polimorfismo permite tratar objetos de diferentes clases de manera uniforme a través de la abstracción.
> - Diferentes clases pueden implementar una misma interfaz o heredar de una misma superclase, pero tener comportamientos específicos.
> - Se manifiesta en la capacidad de objetos de diferentes clases de responder a una misma llamada de método de manera diferente.
> - Facilita la creación de código más genérico y flexible, ya que permite escribir código que funcione con una variedad de objetos sin conocer sus tipos exactos.