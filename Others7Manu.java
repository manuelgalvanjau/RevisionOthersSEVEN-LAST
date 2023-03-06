/**
 *    El programa te pide el nombre del pais y al insertarlo te da su capital
 *  Cuando no se sabe la cap me la pregunta y se agrega al mapa de capitales
 LOS COMENTARIOS DE LO QUE HICE SE ENCUENTRAN DEBAJO 
 */
import java.util.Scanner;
import java.util.HashMap;

public class Codigo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington D.C.");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");

        String pais = "";

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = scanner.nextLine();

            if (!pais.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta, ¿cuál es la capital de " + pais + "?: ");
                    String capital = scanner.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!pais.equalsIgnoreCase("salir"));

        scanner.close();
    }
}
/*Comentarios de lo que hice ()>() */

/*
 * Corregi la clase pa' que agarre
 * Luego corregi los type of data en las capitales y use la clave correcta pa' poner la del Salvador
 * Cambie los datos de entrada y la variable
 * error en los metodos de comprobacion tmb ahi corregi
 * En el output text corregi para que se muestre la cap pero cuando lo ingresa el usuario.
 * Bucle repeat hasta que el usuario le type salir (Estaba mal ahi tmb)
 * y faltaba cerrar el Scanner.
 * 
 * 
 * 
 */
