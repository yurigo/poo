# Interfaces

Colección de métodos abstractos. A diferencia de las clases abstractas, las interfaces solo pueden contener métodos sin implementación y constantes (variables finales).

## Declaración

```java
public interface MiInterfaz {
    void metodoUno();
    int metodoDos(String cadena);
}
```

## Implementación
```java
public class MiClase implements MiInterfaz {
    @Override
    public void metodoUno() {
        // Implementación del métodoUno
    }

    @Override
    public int metodoDos(String cadena) {
        // Implementación del metodoDos
        return cadena.length();
    }
}
```

## "Herencia" múltiple

```java
public class MiClase implements Interfaz1, Interfaz2 {
    // Implementación de métodos de ambas interfaces
}
```

## Clases vs Clases abstractas vs Interfaces

| Clases | Clases abstractas | Interfaces |
| - | - | - |
| Las clases son la base de la programación orientada a objetos en Java. Representan entidades concretas y pueden contener tanto datos (atributos) como comportamientos (métodos). | Las clases abstractas son una extensión de las clases. Pueden contener métodos abstractos (sin implementación) y métodos concretos (con implementación). | Las interfaces proporcionan un nivel más alto de abstracción. Son un conjunto de métodos sin implementación, pero a diferencia de las clases abstractas, no pueden contener datos ni implementaciones. |
| Las instancias de clases se utilizan para modelar objetos del mundo real en tu programa. | Se utilizan para definir una estructura común para las clases derivadas. Las clases que heredan de una clase abstracta deben proporcionar implementaciones para los métodos abstractos. | Las interfaces se utilizan para definir contratos. Un contrato es un conjunto de métodos que una clase que implementa la interfaz debe proporcionar. Esto permite la creación de clases que pueden cumplir múltiples contratos a través de la implementación de varias interfaces. |
| | | Permiten la implementación de herencia múltiple, ya que una clase puede implementar varias interfaces. |


## Ejemplo

Supongamos que estás desarrollando un videojuego. Puedes tener una interfaz `Atacante` que define métodos como `atacar()` y `defender()`. Luego, clases como `Guerrero` y `Arquero` pueden implementar esta interfaz. Ambas clases proporcionarán su propia implementación única para estos métodos, pero ambas serán reconocidas como `Atacantes`. Esto permite que el juego sea más modular y fácil de extender con nuevos tipos de personajes.

Primero, defines una interfaz llamada `Atacante`:

```java
public interface Atacante {
    void atacar();
}
```

Luego, defines otra interfaz llamada `Defensor`:

```java
public interface Defensor {
    void defender();
}
```

Ahora, tus clases concretas, como `Guerrero` y `Arquero`, pueden implementar estas interfaces según sea necesario.

```java
public class Guerrero implements Atacante, Defensor {
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con su espada.");
    }

    @Override
    public void defender() {
        System.out.println("El guerrero levanta su escudo para defenderse.");
    }
}
```

```java
public class Arquero implements Atacante {
    @Override
    public void atacar() {
        System.out.println("El arquero dispara una flecha con su arco.");
    }
}
```

En este ejemplo:

- La clase `Guerrero` implementa tanto la interfaz `Atacante` como la interfaz `Defensor`. Esto significa que un guerrero puede atacar y defender según las implementaciones definidas en esas interfaces.

- La clase `Arquero` implementa solo la interfaz `Atacante`. Esto significa que un arquero solo puede atacar, pero no tiene la capacidad de defender.

Ahora, en el juego, puedes crear instancias de estas clases y tratarlas de manera uniforme si necesitas interactuar con sus comportamientos compartidos. Por ejemplo:

```java
public class Juego {
    public static void main(String[] args) {
        Guerrero miGuerrero = new Guerrero();
        Arquero miArquero = new Arquero();

        // Utilizando la interfaz Atacante
        realizarAccion(miGuerrero); // El guerrero ataca con su espada.
        realizarAccion(miArquero);   // El arquero dispara una flecha con su arco.

        // Utilizando la interfaz Defensor
        if (miGuerrero instanceof Defensor) {
            ((Defensor) miGuerrero).defender(); // El guerrero levanta su escudo para defenderse.
        }
    }

    public static void realizarAccion(Atacante personaje) {
        personaje.atacar();
    }
}
```

En este ejemplo, la función `realizarAccion` acepta cualquier objeto que implemente la interfaz `Atacante`, lo que permite tratar a los guerreros y arqueros de manera uniforme cuando se trata de acciones de ataque.

Este enfoque proporciona flexibilidad y extensibilidad al diseñar sistemas con diferentes tipos de comportamientos compartidos entre clases. Las interfaces permiten que tus clases compartan comportamientos sin preocuparse por la jerarquía de clases, lo que hace que el diseño sea más modular y fácil de mantener.

# Usos

El uso de interfaces en Java es beneficioso en varias situaciones. Aquí hay algunas razones comunes por las cuales querrías hacer uso de interfaces:

1. **Cuando necesitas lograr la herencia múltiple:**
   - Java no permite herencia múltiple de clases, pero sí permite que una clase implemente múltiples interfaces. Si tienes una clase que necesita heredar comportamientos de varias fuentes, las interfaces son la solución.

2. **Para definir contratos:**
   - Las interfaces permiten definir contratos o especificaciones que las clases deben seguir. Si deseas establecer un conjunto de métodos que deben estar presentes en cualquier clase que implemente una interfaz, las interfaces son la forma de hacerlo.

3. **En situaciones de diseño modular:**
   - Si estás trabajando en un proyecto grande o en un entorno donde la modularidad es crucial, las interfaces pueden ayudar a desacoplar componentes. Cada componente puede depender de interfaces en lugar de clases concretas, lo que facilita la expansión y mantenimiento del sistema.

4. **Para proporcionar múltiples implementaciones de un comportamiento:**
   - Puedes tener varias clases que implementan la misma interfaz pero proporcionan implementaciones diferentes para los métodos definidos en esa interfaz. Esto facilita la creación de clases intercambiables que cumplen con un contrato común.

5. **En el diseño de APIs:**
   - Cuando estás diseñando una API (Interfaz de Programación de Aplicaciones), las interfaces te permiten definir cómo los usuarios interactuarán con tu código sin revelar la implementación subyacente. Esto proporciona flexibilidad y permite cambios en la implementación sin afectar a los usuarios de la API.

6. **Para facilitar la prueba unitaria y la inyección de dependencias:**
   - Las interfaces facilitan la creación de clases simuladas (mocks) para las pruebas unitarias, ya que puedes crear implementaciones de interfaz específicas para las pruebas. Además, las interfaces son útiles cuando se practica la inyección de dependencias para lograr un código más limpio y mantenible.

7. **En el desarrollo de bibliotecas y frameworks:**
   - Si estás construyendo una biblioteca o un framework, el uso de interfaces permite a los usuarios extender y personalizar la funcionalidad proporcionada sin cambiar el código fuente original.

En resumen, las interfaces en Java son una herramienta poderosa que te permite diseñar sistemas más flexibles, modulares y extensibles. Siempre que necesites definir un contrato común, desacoplar componentes o permitir que las clases compartan comportamientos sin depender de una jerarquía de clases específica, las interfaces son una opción valiosa.