import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {
    public static void matrizCuadrada(Scanner sc) {
        //Array list
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

        while (true) {
            System.out.println("Ingrese un valor para una celda, o 'FIN' para salir: ");
            String valor = sc.nextLine();

            if (valor.equalsIgnoreCase("FIN")) {
                System.out.println("saliendo del bucle...");
                break;
            }

            System.out.println("Ingrese la fila de la celda:");
            int fila = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la columna de la celda");
            int columna = Integer.parseInt(sc.nextLine());

            //creamos instancia de la celda con los valores del usuario
            Celda celda = new Celda(fila, columna, valor);
            //guardamos en clase Matriz
            matrizCuadrada.add(celda);
        }
        //mostrar matriz
        for (Celda celda : matrizCuadrada) {
            System.out.println(celda);
        }
    }
}
