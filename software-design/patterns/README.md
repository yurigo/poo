# Patrones

## Controller

El controller es un patrón de diseño de software que se utiliza para controlar el flujo de datos entre la capa de presentación y la capa de datos. El controller es responsable de recibir las entradas del usuario, validar los datos y llamar a los métodos apropiados en la capa de datos para procesar los datos.

**Ejemplos de controller:**

* **Un controlador de un sitio web que recibe las entradas del usuario a través de un formulario y llama a los métodos apropiados en la base de datos para guardar los datos.**
* **Un controlador de una aplicación móvil que recibe las entradas del usuario a través de una pantalla táctil y llama a los métodos apropiados en un servidor para procesar los datos.**
* **Un controlador de un sistema de automatización industrial que recibe las entradas de sensores y llama a los métodos apropiados para controlar los actuadores.**
* **En una aplicación web, el controlador se encargaría de recibir las solicitudes del usuario, determinar qué acción debe realizarse y coordinar la respuesta adecuada. Esto puede involucrar la actualización de la vista o la manipulación de datos a través del modelo.**

## Information expert

El information expert es un patrón de diseño de software que se utiliza para agrupar el código relacionado con una misma entidad. El information expert es responsable de almacenar los datos de la entidad, proporcionar métodos para acceder a los datos y realizar operaciones sobre los datos.

**Ejemplos de information expert:**

* **Una clase que representa un cliente en un sistema de gestión de clientes.**
* **Una clase que representa un producto en un sistema de comercio electrónico.**
* **Una clase que representa un dispositivo físico en un sistema de automatización industrial.**
* **En un sistema de gestión de usuarios, la clase de usuario debería ser el "Experto en Información" en lo que respecta a la información del usuario, como el nombre, la dirección de correo electrónico y la contraseña. Por lo tanto, esta clase debería ser responsable de la autenticación y el manejo de la información del usuario.**