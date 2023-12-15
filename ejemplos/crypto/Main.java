public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String password = "password1234.";
        String hashEstatico = "$2a$10$jEHf6JMtBR5N7AoM9m3FpurRGLbqbur1gDkMNza1AMLi20qVIWd1i";

        Bcrypt bc = new Bcrypt(10);

        String hashDinamico = bc.hashPassword(password);

        System.out.println("El password es: " + password);
        System.out.println("El hash es: " + hashDinamico);

        String passwordDelUsuario = "password1234.";

        //  comparo un nuevo hash con el que ha introducido el usuario...
        String hashNuevoAPartirDelLogin = bc.hashPassword(passwordDelUsuario);

        // No funciona porque cada vez se hace un hash nuevo...
        System.out.println("comparando: " + hashDinamico + " vs " + hashNuevoAPartirDelLogin );
        System.out.println("comparando: " + hashDinamico.equals(hashNuevoAPartirDelLogin)); // false


        // hay que comparar
        System.out.println("comparando: " + hashDinamico);
        System.out.println("comparando: " + bc.matchesPassword(password, hashDinamico)); // true

        System.out.println("comparando: " + hashEstatico);
        System.out.println("comparando: " + bc.matchesPassword(password, hashEstatico)); // true



    }
}