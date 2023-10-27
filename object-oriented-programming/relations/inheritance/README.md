# Herencia

La herencia en el diseño de software es un concepto fundamental en la programación orientada a objetos (POO), que permite la creación de jerarquías de clases y la reutilización de código. En esencia, la herencia permite que una clase (llamada clase derivada o subclase) herede las propiedades y comportamientos de otra clase (llamada clase base o superclase). Esta técnica se utiliza para modelar relaciones de "es un tipo de" entre objetos del mundo real en el software.

A continuación, se presentan algunos conceptos clave relacionados con la herencia en el diseño de software:

1. **Clase base (Superclase)**: Es la clase original de la que se heredan propiedades y métodos. La clase base define los atributos y comportamientos comunes que serán compartidos por sus clases derivadas.

2. **Clase derivada (Subclase)**: Es la clase que hereda de la clase base. Puede agregar nuevos atributos o métodos específicos y personalizar o sobrescribir los métodos heredados de la clase base.

3. **Relación "es un tipo de"**: La herencia se utiliza para expresar la relación entre la clase derivada y la clase base. Por ejemplo, si tienes una clase "Animal" como clase base y una clase "Perro" como subclase, se puede decir que "Perro" es un tipo de "Animal".

4. **Métodos y atributos heredados**: Las subclases heredan los métodos y atributos de la superclase. Esto permite la reutilización de código, ya que no es necesario volver a escribir el mismo código en cada subclase.

5. **Sobreescritura (Override)**: Las subclases pueden modificar o extender el comportamiento de los métodos heredados de la superclase. Esto se logra mediante la técnica de sobreescritura, en la que se proporciona una nueva implementación de un método en la subclase.

6. **Llamada a métodos de la superclase**: En algunas situaciones, es necesario acceder a métodos de la superclase desde la subclase. Esto se hace utilizando la palabra clave "super" o el nombre de la superclase.

7. **Jerarquías de herencia**: Es posible crear jerarquías de herencia, donde una clase derivada puede a su vez ser la superclase de otra clase. Esto permite organizar el código de manera más estructurada y facilita la gestión de objetos relacionados.

La herencia es una técnica poderosa en el diseño de software, ya que promueve la reutilización de código y la modelización de relaciones entre objetos de manera eficiente. Sin embargo, es importante usarla con cuidado, ya que un mal diseño de jerarquías de clases puede llevar a problemas de mantenimiento y complicaciones en el código. La herencia debe utilizarse cuando existe una relación clara de "es un tipo de" entre las clases y cuando las clases derivadas realmente comparten características comunes con la clase base.


## Polimorfismo

El polimorfismo es un concepto clave en la programación orientada a objetos que se refiere a la capacidad de objetos de diferentes clases de comportarse de manera similar. Esto permite que un objeto pueda presentar múltiples formas o comportamientos en función del contexto en el que se utiliza. El polimorfismo es fundamental en la POO y se puede lograr de dos maneras principales:

1. **Polimorfismo de tiempo de ejecución (o polimorfismo dinámico):** En este tipo de polimorfismo, se permite que objetos de diferentes clases muestren un comportamiento diferente en función de su tipo en tiempo de ejecución. Se logra a través de la sobreescritura de métodos en clases derivadas (subclases) que heredan de una clase base (superclase). Cuando se llama a un método en un objeto, se ejecuta la implementación del método de la subclase a la que pertenece el objeto en tiempo de ejecución.

   Ejemplo en Java:

   ```java
   class Animal {
       public void hacerSonido() {
           System.out.println("Animal hace un sonido");
       }
   }

   class Perro extends Animal {
       @Override
       public void hacerSonido() {
           System.out.println("El perro ladra");
       }
   }

   class Gato extends Animal {
       @Override
       public void hacerSonido() {
           System.out.println("El gato maulla");
       }
   }

   // Uso del polimorfismo de tiempo de ejecución
   Animal miMascota = new Perro();
   miMascota.hacerSonido(); // Salida: El perro ladra
   ```

2. **Polimorfismo de tiempo de compilación (o sobrecarga de métodos):** En este tipo de polimorfismo, se permite que objetos de diferentes clases se comporten de manera similar, pero no necesariamente de manera diferente. Esto se logra mediante la sobrecarga de métodos, donde se tienen varios métodos con el mismo nombre en una clase, pero con diferentes parámetros.

   Ejemplo en Java:

   ```java
   class Calculadora {
       public int sumar(int a, int b) {
           return a + b;
       }

       public double sumar(double a, double b) {
           return a + b;
       }
   }

   // Uso del polimorfismo de tiempo de compilación
   Calculadora calculadora = new Calculadora();
   int sumaEnteros = calculadora.sumar(5, 3);
   double sumaDobles = calculadora.sumar(5.5, 3.3);
   ```
