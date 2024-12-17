public class Main {
    public static void main(String[] args) {

        /*
        Para caracteres dentro del BMP (U+0000 a U+FFFF),
         la conversión directa a char funciona: (char)0xXXXX.

        Para caracteres fuera del BMP (como las cartas de juego),
         necesitas usar un par de surrogates, representados con dos
         secuencias de escape uXXXX: "\uD83C\uDCA1".
        */

        /*
        0x1F0A1 -> 🂡    0x1F0A2 -> 🂢    0x1F0A3 -> 🂣 ...
        0x1F0B1 -> 🂱    0x1F0B2 -> 🂲    0x1F0B3 -> 🂳 ...
        ...
        https://en.wikipedia.org/wiki/Template:Unicode_chart_Playing_Cards
         */

        System.out.print((char) 0x1F0A1); // 
        // porque 0x1F0A1 no es un Unicode válido dentro de BMP y se queda con la representación de 0x1F0A1
        System.out.print(" ");
        System.out.print((char) 0xF0A1);  // 
        System.out.println(" ");

        System.out.print((char) 0xD83C);  // high surrogate
        System.out.print((char) 0xDCA1);  // low surrogate
        System.out.println(" ");

        System.out.print(Character.toChars(0x1F0A1));
        System.out.println(" ");

        System.out.println("");

        // Cartas en unicode
        System.out.print("\uD83C\uDCA1");
        System.out.print(" ");
        //U+1F0A2
        System.out.print("\uD83C\uDCA2");
        System.out.print(" ");
        //U+1F0A3 -> 🂣
        System.out.print("\uD83C\uDCA3");
        System.out.print(" ");

        System.out.print("\uD83C\uDCA4");
        System.out.println(" ...");

        System.out.print("\uD83C\uDCB1");
        System.out.print(" ");
        System.out.print("\uD83C\uDCB2");
        System.out.println(" ...");
        System.out.println("...");

        System.out.println("");

        // char[] values = { a, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, C, Q, K };
        char[] values = {/*0,*/0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8, 0x9, 0xA, 0xB,/*0xC,*/0xD, 0xE};
        char[] suits = {'A', 'B', 'C', 'D'};

        int BASE = 0x1F0A0;

        for (char suit : suits) {
            for (char value : values) {
                String unicodeCard = new String(new int[]{BASE + (suit - 'A') * 16 + (value)}, 0, 1);
                System.out.print(unicodeCard + " ");
            }
            System.out.println();
        }


        BaseCard base = new BaseCard();
        Card card1 = new Card("A", "♥");
        Card card2 = new Card("10", "♥");//spades, hearts, diamonds, clubs
        Card card3 = new Card("J", "♠");
        Card card4 = new Card("A", "♦");
        Card card5 = new Card("K", "♣");
        Printer printer = new Printer();

        printer.printCard(base, card1);
        printer.printCard(base, card2);
        printer.printCard(base, card3);
        printer.printCard(base, card4);
        printer.printCard(base, card5);


    }
}