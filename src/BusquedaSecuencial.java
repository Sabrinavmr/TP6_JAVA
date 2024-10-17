import java.util.ArrayList;

public class BusquedaSecuencial {
    public static void busquedaNumero(int numeroBuscado, ArrayList<Integer> numeros){
        //parametro booleano
        boolean encontrado = false;
        for ( int n:numeros){
            if(numeroBuscado==n){
                System.out.println("numero encontrado, en la posicion del Arraylist: ["+numeros.indexOf(n)+"]");
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("No se encuentra el numero en la lista");
        }
    }
}
