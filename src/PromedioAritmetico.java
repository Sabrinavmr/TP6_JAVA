import java.util.ArrayList;

public class PromedioAritmetico {
    public static double promedio(ArrayList<Integer> NumPositivos ){
        //suma de elementos
        int sumaNumeros = 0;

        for(int n:NumPositivos){
            sumaNumeros += n;
        }

        //mostramos por consola
        System.out.println("la suma de los numeros pares es: "+sumaNumeros);

        //calculamos el promedio
        double promedio = ((double) sumaNumeros /NumPositivos.size());

        //mostrar por consola
        System.out.println("Promedio aritmetico: "+promedio);
        return promedio;
    }

}
