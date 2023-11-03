import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String filepath = "./file.json";

        // File jsonfile = new File(filepath);
        //
        //        // Crear un objeto FileReader para abrir el archivo
        //        FileReader archivo = new FileReader(filepath);
        //
        //        // Crear un objeto BufferedReader para leer el archivo de manera eficiente
        //        BufferedReader lector = new BufferedReader(archivo);
        //
        //        String linea;
        //
        //        while ((linea = lector.readLine()) != null) {
        //            System.out.println(linea);
        //            String answer = linea?????;
        //            Boolean forced = linea????;
        //            String image = linea???;
        //            YesNoObject yno = new YesNoObject(answer, forced, image);
        //        }

        File jsonfile = new File(filepath);
        //String json = """
        //        {
        //          "answer":"yes",
        //          "forced":false,
        //          "image":"https://yesno.wtf/assets/yes/12-e4f57c8f172c51fdd983c2837349f853.gif"
        //        }
        //        """;
        ObjectMapper objectMapper = new ObjectMapper();

        YesNoObject yno = objectMapper.readValue(jsonfile, YesNoObject.class);
        //        YesNoObject yno = objectMapper.readValue(json, YesNoObject.class);

        System.out.println(yno.getAnswer());

    }
}


public class YesNoObject {

    private String answer;

    public YesNoObject(){}

    public String getAnswer() {
        return answer;
    }

}