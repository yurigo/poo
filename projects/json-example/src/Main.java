import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();
        String FILENAME = "./files/personas.json";

        try {
            JsonReader reader = new JsonReader(new FileReader(FILENAME));
            // ArrayList<Persona> personas = // new ArrayList<Persona>();
            Clinica clinica = gson.fromJson(reader, Clinica.class);

            System.out.println(clinica.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}