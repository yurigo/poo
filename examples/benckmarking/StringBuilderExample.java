public class Main {
    public static void main(String[] args) {

        int iterations = 1_000_000;
        String result = "";
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();

//        for (int i = 0 ; i < iterations; i++) {
//            result = result + "a";
//        }

        for (int i = 0 ; i < iterations; i++){
            sb.append("a");
            if (i % 100 == 0){
                sb.append(System.lineSeparator());
            }
        }

        result = sb.toString();

        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Ha tardado: " + (endTime - startTime) + "ms");


    }
}