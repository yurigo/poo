import java.util.ArrayList;
import java.util.UUID;

public class Iterators {
    public static void main(String[] args) {

        int iterations = 1000;

//            int[] integerArray= new int[iterations];
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


//        for (int i = 0 ; i < iterations ; i++){
//            usuarios.add(new Usuario("u"+ i , "John Doe"));
//        }

        for (int i = 0 ; i < iterations ; i++){

            UUID uuid = UUID.randomUUID();
            String uuidAsString = uuid.toString();


//            integerArray[i] = i;
//            integerArrayList.add(new Usuario("u"+ i , "John Doe"));

            Usuario aux = new Usuario(uuidAsString , "John Doe");

            Mensaje m1 = new Mensaje("m_1" + uuidAsString , "Hola");
            Mensaje m2 = new Mensaje("m_2" + uuidAsString , "Adios");

            aux.addMessage(m1);
            aux.addMessage(m2);
            aux.addMessage("m_3" + uuidAsString , "Lorem ipsum dolor sit amet");

//            ArrayList<Mensaje> mensajes = new ArrayList<>();
//            mensajes.add(m1);
//            mensajes.add(m2);
//
//            aux.setMensajes(mensajes);

            usuarios.add(aux);

        }

//        for (int i = 0 ; i < integerArray.length ; i++){
//            System.out.println(integerArray[i]);
//        }

        long startTime = System.currentTimeMillis();

        int arrayListSize = usuarios.size();

//        for (int i = 0 ; i < arrayListSize ; i++){
//            System.out.println(integerArrayList.get(i));
//        }

        for (Usuario usuario: usuarios) {
            System.out.println(usuario.getId() + ": " + usuario.getNombre());
            System.out.println("mensajes: ");
            for (Mensaje mensaje: usuario.getMensajes()){
                System.out.println(mensaje.showMensaje());
            }
            System.out.println("---");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Ha tardado: " + (endTime - startTime) + "ms");


    }
}


