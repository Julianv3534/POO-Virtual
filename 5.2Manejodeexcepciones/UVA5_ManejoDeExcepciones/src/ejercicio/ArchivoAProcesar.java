package ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoAProcesar {

    public static void main(String[] args) {
        String input = "data.txt";
        String output = "output.txt";

        lecturaYEscritura(input, output);
    }

    public static void lecturaYEscritura(String input, String output) {
    	
    	
        try (BufferedReader lectura = new BufferedReader(new FileReader(input));
             BufferedWriter escritura = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = lectura.readLine()) != null) {
                String lineaHecha = procesarLinea(line);
                
                escritura.write(lineaHecha);
                escritura.newLine();
            }

        } catch (IOException archivoError) {
            System.err.println("Hubo un error en el siguiente archivo: " + archivoError.getMessage());
        }
    }

    public static String procesarLinea(String linea) {
        return linea;
    }
}