package ejercicio;

public class ValidadorEdades {

    public static void main(String[] args) {
        int edad = obtenerEdad();
        System.out.println("Edad ingresada correctamente: " + edad + " años.");
    }

    public static int obtenerEdad() {
        int edad = -1;
        boolean edadValida = false;
        while (!edadValida) {
            System.out.print("Ingrese su edad entre 0 y 120: ");
            try {
                String input = System.console().readLine();
                edad = Integer.parseInt(input);
                if (edad >= 0 && edad <= 120) {
                    edadValida = true;
                } else {
                    System.out.println("La edad debe estar entre 0 y 120!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número entero válido!!");
            }
        }
        return edad;
    }
}