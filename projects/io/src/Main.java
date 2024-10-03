import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> miArrayDeNombres
//                = new ArrayList<String>();
//
//        miArrayDeNombres.add("Yuri");
//        miArrayDeNombres.add("Maria");
//        miArrayDeNombres.add("Jose");
//        miArrayDeNombres.add("Julie");
//        miArrayDeNombres.add("Julie");
//        miArrayDeNombres.add("Julie");
//
//        System.out.println(miArrayDeNombres);

        ArrayList<Point> points = new ArrayList<>();

        Point p =new Point(1,2,"mipunto");
        System.out.println(p);

        points.add(
                new Point(1,2,"mipunto")
        );points.add(
                new Point(3,4,"mipunto2")
        );

        System.out.println(points);

        try{
            // Crear un objeto File que apunte al fichero
            File archivo = new File("ficheros/fichero.txt");

            // Crear un objeto Scanner para leer el fichero
            Scanner scf = new Scanner(archivo);

            ArrayList<Point> pointsNuevo = new ArrayList<>();

            // Leer el fichero línea por línea
            while (scf.hasNextLine()) {
                // ejemplo usando el scanner:
//                int x = scf.nextInt();
//                int y = scf.nextInt();
//                String name = scf.nextLine();
//                //name = name.substring(1);
//                name = name.trim();
//                System.out.println(x +" "+ y +" "+name);

//                pointsNuevo.add(new Point(x, y,name));

                String infoLinea = scf.nextLine();
                pointsNuevo.add(new Point(infoLinea));

            }

            System.out.println(pointsNuevo);

            // Cerrar el scanner
            scf.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }









        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner sc = new Scanner(System.in);

        // Leer una cadena de texto
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        // Leer un número entero
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Dime tu deporte favorito: ");
        String deporte = sc.nextLine();

        // Leer un número decimal
        System.out.print("Introduce tu altura (en metros): ");
        double altura = sc.nextDouble();

        // Mostrar la entrada que el usuario ha proporcionado
        System.out.println(String.format("Nombre: %s", nombre));
        System.out.println("Edad: " + edad + "pepito");
        System.out.println("Deporte: " + deporte);
        System.out.println("Altura: " + altura);

        // Cerrar el scanner
        sc.close();
    }
}
