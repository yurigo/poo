# Ejemplos

## Gestión de usuarios. 

> `controller` `information expert`

Implementar un controlador que permita registrar nuevos usuarios y un componente que maneje la información del usuario.

**Controlador (Controller):**

El controlador es responsable de recibir las solicitudes del usuario y coordinar las acciones apropiadas. En este caso, vamos a crear un `UserController` para gestionar el registro de usuarios:

```java
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registrarUsuario(String nombre, String correo) {
        User newUser = new User(nombre, correo);
        userService.registrarUsuario(newUser);
        System.out.println("Usuario registrado con éxito: " + newUser.getNombre());
    }
}
```

**Experto en Información (Information Expert):**

El Information Expert es la clase que tiene la información necesaria para realizar una tarea específica. En este caso, la clase `User` contiene la información del usuario y es experta en administrar los datos de usuario:

```java
public class User {
    private String nombre;
    private String correo;

    public User(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
}
```

**Servicio de Usuarios:**

Además, puedes tener un servicio que actúe como intermediario entre el controlador y la capa de almacenamiento de datos (por ejemplo, una base de datos o un repositorio en memoria):

```java
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registrarUsuario(User user) {
        userRepository.guardarUsuario(user);
    }
}
```

**Repositorio de Usuarios:**

El repositorio es responsable de guardar y recuperar usuarios, lo que sería una capa de acceso a datos en un sistema real:

```java
public interface UserRepository {
    void guardarUsuario(User user);
    User obtenerUsuarioPorId(int userId);
}
```

Este ejemplo demuestra cómo se aplican los patrones Controller e Information Expert en Java. El controlador `UserController` coordina la acción de registrar usuarios y utiliza el Information Expert, que es la clase `User`, para manipular los datos del usuario. El servicio de usuarios y el repositorio también son ejemplos de capas intermedias que podrían utilizarse en un sistema más complejo.