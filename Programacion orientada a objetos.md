# Programación orientada a objetos

- Abstracción

> - La abstracción consiste en simplificar y modelar objetos del mundo real en términos de clases y objetos en un programa.
> - Permite representar solo los aspectos esenciales de un objeto, ocultando los detalles innecesarios.
> - Ayuda a crear una representación más clara y comprensible de la realidad, facilitando el diseño y la implementación de sistemas de software.

- Encapsulamiento

> - El encapsulamiento es el principio de ocultar los detalles internos de una clase y exponer una interfaz pública para interactuar con ella.
> - Los atributos se declaran como privados para protegerlos del acceso directo desde fuera de la clase.
> - Los métodos públicos (getters y setters) se utilizan para acceder y modificar los atributos de manera controlada.
> - Proporciona control sobre el acceso y la modificación de datos, mejorando la seguridad y el mantenimiento del código.

- Herencia

> - La herencia permite crear nuevas clases (subclases) basadas en clases existentes (superclases).
> - Las subclases heredan atributos y métodos de las superclases, lo que promueve la reutilización de código y la jerarquía de clases.
> - Las subclases pueden agregar nuevos atributos y métodos o modificar el comportamiento heredado.
> - Facilita la creación de relaciones "es un" entre objetos y promueve la coherencia en la estructura del software.

- Polimorfismo

> - El polimorfismo permite tratar objetos de diferentes clases de manera uniforme a través de la abstracción.
> - Diferentes clases pueden implementar una misma interfaz o heredar de una misma superclase, pero tener comportamientos específicos.
> - Se manifiesta en la capacidad de objetos de diferentes clases de responder a una misma llamada de método de manera diferente.
> - Facilita la creación de código más genérico y flexible, ya que permite escribir código que funcione con una variedad de objetos sin conocer sus tipos exactos.


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

test