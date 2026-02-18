import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class EscribiryLeerFrases {
    public static void main(String[] args) {


        List<String> frases = Arrays.asList(
                "Hola que tal",
                "estas mejor",
                "me alegro la verdad",
                "espero te recuperes"
        );

        String archivo = "frases.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {

            for (String frase : frases) {
                writer.write(frase);
                writer.newLine();
            }

            System.out.println("Frases escritas correctamente en " + archivo);

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        System.out.println("Leyendo frases desde el archivo: ");

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
