import java.util.ArrayList;
import java.util.Collections;


public class MostrarArray {
    public static void formaAsc(ArrayList<Integer> numeros){
        ArrayList<Integer> ListaB = new ArrayList<>(numeros);
        //ordenamos de forma ascendente
        Collections.sort(ListaB);

        //mostramos por consola
        System.out.println("Lista B ordenada de forma Ascendente:"+ListaB);
    }

    public static void formaDesc(ArrayList<Integer>numeros){
        ArrayList<Integer>ListaC = new ArrayList<>(numeros);

        //ordenamos de forma descendente
        ListaC.sort(Collections.reverseOrder());
        //mostramos por consola
        System.out.println("Lista C ordenada en forma descendente: "+ListaC);

    }
}
