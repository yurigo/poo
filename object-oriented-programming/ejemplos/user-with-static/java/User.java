public class User{

    final String ERROR_MESSAGE = "Ha ocurrido un error";
    static int CONTADOR = 0;
    private int id;
    private String name;
    private String lastname;
    //...

    private User(int id, String name){
        this.id = id;
        this.name = name;
    }

    int getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }

    static int funcionGlobalDeUser(){
        return 100;
    }

    static int getContador(){
        CONTADOR++;
        return CONTADOR;
    }

    // ENCAPSULACIÓN DE EL CONSTRUCTOR DE UN USER:
    static User createUser(String name){
        // dame un identificador nuevo:
        int id = getContador();

        // intancia un user:
        User u = new User(id, name);

        //devuelve el usuario creado:
        return u;
    }

    static boolean isEqual(User u1, User u2){
        if (u1.id == u2.id){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean nameEqual(User u1, User u2){
        if (u1.name == u2.name){
            return true;
        }
        else{
            return false;
        }
    }

    String serialize(){
        return this.id + "," + this.name + "," + this.lastname;
    }





    static User deserialize(String userSerialized){
        String[] chunks = userSerialized.split(",");
        User toReturn = new User(Integer.parseInt(chunks[0]) , chunks[1]);

         int[] i = {1,2,3};

        for(int w = 0 ; w< 100; w++){
            i[w] = 100;
        }

        return toReturn;
    }
}
