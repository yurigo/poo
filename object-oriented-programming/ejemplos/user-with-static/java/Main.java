public class Main {
    public static void main(String[] args) {
//   WRAPPER:
//        int numero = 3;
//        Integer wNumero = 3;
//        Double d = 4.6;
//        Float f = d.floatValue();
//        Float m = 5.6f;
//        Double n = m.doubleValue();
//
//
//        System.out.println(wNumero.getClass());
//        System.out.println(wNumero.intValue() + 4);
//        System.out.println(wNumero.toString() + 4);

//        int i = 10;
//
//        Integer a = i; // new Integer(i): <--- Obsoleto desde la version 9.
//
//        String name = "hola";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.charAt(2));
//        System.out.println(name.compareTo("hola"));

        // STATIC

        System.out.println(User.getContador());
        System.out.println(User.getContador());

        // User u = new User(1, "John");
        User uJohn = User.createUser("John");
        User uDoe = User.createUser("Doe");
        User uJohnII = User.createUser("John");

        System.out.println(User.funcionGlobalDeUser());
        System.out.println(User.funcionGlobalDeUser());


        System.out.println("el usuario es: " + uJohn.serialize());
        System.out.println("el usuario es: " + uDoe.serialize());
        System.out.println("el usuario es: " + uJohnII.serialize());

        System.out.println(User.isEqual(uJohn , uJohnII));
        System.out.println(User.nameEqual(uJohn , uJohnII));

        User u = User.deserialize("99,Pepito,Menganito");

        System.out.println("hello: " + u.serialize());
        System.out.println("hello: " + u);

//        Integer.compare(3,4);
//        Integer aInteger = 3;
//        aInteger.compareTo(4);

    }
}
