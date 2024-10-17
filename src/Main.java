import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LlenarArrayList_Manual_Scanner(sc);
        //Aplicacion20NumPorArrayList(sc);
        //App20NumParesArrayList(sc);
        //BusquedaSecuencialArrayList(sc);
        //ArrayListAscDesc(sc);
        ProgramaEj6(sc);
 



    }

    //Crea un ArrayList<Integer>, asignar los valores numéricos manualmente
    //(los que tú quieras) hasta ingresar un valor menor a 0, mostrar los
    //números por pantalla. Solicite los números mediante un bucle.

    public static void LlenarArrayList_Manual_Scanner(Scanner sc){

        //creamos un array list
        ArrayList<Integer> numeros = new ArrayList<>();

        //agregamos valores manualmente
        numeros.add(-1);
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        //mostramos los valores en un bucle for-each
        for (Integer n:numeros){
            System.out.println("valores agregados manualmente");
            System.out.println("nro: "+n);
        }

        int num;

        //pedimos al usuario que ingrese numeros mediante un bucle do while
        do {
            System.out.println("Ingrese numeros, para salir ingrese un numero negativo:");
            num = sc.nextInt();
            if (num>=0){
                numeros.add(num);
            }else {
                System.out.println("ingresaste numero negativo, saliendo del bucle");
            }

        }while (num>=0);

        //mostramos por consola mediante un for - each
        for (Integer n:numeros){
            System.out.println("valores ingresados:");
            System.out.println("nro: "+n);
        }


    }

    public static void Aplicacion20NumPorArrayList(Scanner sc){
        System.out.println("-----------------------------------");
//        Escriba una aplicación que:
//        a) lea 20 números decimales ingresados por teclado por el usuario y los
//        coloque en un ArrayList<Integer>.
//        b) determine y muestre el mayor de los números en el arreglo
//        c) determine y muestre el menor de los números del arreglo calcule y
//        muestre el rango (diferencia entre el mayor y el menor) de los
//        elementos en el arreglo

        ArrayList<Integer> NumerosDecimales = new ArrayList<>();

        //pedimos valores al usuario
        for (int i = 0; i <20 ; i++) {
            System.out.println("Ingrese 20 numeros decimales, nro:"+(i+1));
            double num = sc.nextDouble();
            NumerosDecimales.add((int) num);

        }
        //mostrar por consola
//        System.out.println("Numeros ingresados por el usuario:");
//        for (Integer n:NumerosDecimales){
//            System.out.println("Nro:"+n);
//        }

        //mostramos el mayor y menor del arreglo
        double NumMayor = NumerosDecimales.get(0);
        double NumMenor = NumerosDecimales.get(0);

        for (int n:NumerosDecimales){
            if (n>NumMayor){
                NumMayor= n;

            }else if (n<NumMenor){
                NumMenor= n;
            }
        }

        //mostramos por consola
        System.out.println("Numero mayor: "+NumMayor);
        System.out.println("Numero menor: "+NumMenor);

        //rango de diferencia entre el menor y mayor
        double rango = NumMayor - NumMenor;

        //mostrar por consola
        System.out.println("El rango entre el numero menor y mayor es: "+rango);
    }

    public static void App20NumParesArrayList(){

//        Escriba una aplicación para almacenar en un ArrayList<Integer>
//                aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
//        cuales se desea saber:
//        a) su promedio aritmético
//        b) cuántos de los números son iguales al promedio aritmético
//        c) cuántos de los números son mayores que el promedio aritmético
//        d) cuántos de los números son menores que el promedio aritmético

        //crear array list
        ArrayList<Integer> NumerosPositivos = new ArrayList<>();
        //crear el objeto ramdom
        Random random = new Random();

        //agregamos valores ramdoms
        System.out.println("agregando numeros aleatorios....");

        while (NumerosPositivos.size() < 20) {
            int num = random.nextInt(101); // Generar entre 0 y 100
            if (num % 2 == 0) {
                NumerosPositivos.add(num);
            }
        }

        //mostrar por consola
        int i = 1;
        for (int n : NumerosPositivos){

            System.out.println("nro "+i+": "+(n));
            i++;
        }

        //promedio aritmetico
        double promedio = PromedioAritmetico.promedio(NumerosPositivos);

        //contador numeros mayores que el promedio
        int contMayor = 0;

        //contador numeros menores que el promedio
        int contMenor = 0;

        for (int n : NumerosPositivos){
            if (n>promedio){
                contMayor++;
            } else if (n<promedio) {
                contMenor++;
            }
        }
        //mostrar por consola
        System.out.println("cantidad de numeros mayores que el promedio: "+contMayor);
        System.out.println("cantidad de numeros menores que el promedio: "+contMenor);

    }

    public static void BusquedaSecuencialArrayList(Scanner sc){
//        Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
//        50 elementos generados aleatoriamente mediante la función java random.
//        Realice una búsqueda secuencial de la siguiente forma:
//        - se lee el valor que se desea buscar,
//                - se compara la primera posición;
//        - si son iguales,
//        - fin de la búsqueda.
//                - De lo contrario, compararlo con la segunda posición, y así
//        sucesivamente.
//                - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
//        con un mensaje apropiado.
//        - Si se encuentra, se debe especificar la posición que ese valor ocupa en
//        la lista por primera vez.

        ArrayList<Integer> NumerosRamdoms = new ArrayList<>();
        Random r = new Random();

        //creamos valores aleatorios
        while (NumerosRamdoms.size()<50){
                int numero = r.nextInt(51);

                //agregamos al listarray
                NumerosRamdoms.add(numero);

        }
        //mostramos por consola
        int i = 0;
        for (int n:NumerosRamdoms){
            System.out.println("nro "+i+": "+n);
            i++;
        }

        //pedimos el valor que desea buscar
        System.out.println("Ïngrese el valor que desea buscar dentro de la lista:");
        int numeroBuscado = sc.nextInt();

        //metodo Busqueda secuencial
        BusquedaSecuencial.busquedaNumero(numeroBuscado,NumerosRamdoms);

    }

    public static void ArrayListAscDesc(Scanner sc){
//        Escriba una aplicación que solicite y cargue en una ArrayList<Integer> 10
//        dígitos enteros, luego cree dos nuevas ArrayList<Integer> y asigne a la
//        primera los números ingresados por el usuario de forma ascendente y en la
//        segunda de forma descendente. Muestre las 2 listas por pantalla.
//                Investigue como ordenar una Lista(List<>)
        //forma ASC: Collections.sort()
        //forma DESC: Collections.reverseOrder()

        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        //llenamos valores con scanner
        int i = 1;
        while (ListaNumeros.size()<10){
                System.out.println("Ingrese un numero de tipo entero, nro: "+i);
                int numero = sc.nextInt();
                ListaNumeros.add(numero);
                i++;
        }

        //mostramos por consola
        System.out.println("lista A: "+ListaNumeros);
        //forma ASC
        MostrarArray.formaAsc(ListaNumeros);
        //forma DESC
        MostrarArray.formaDesc(ListaNumeros);
    }

    public static void ProgramaEj6(Scanner sc){
//        Codifique un programa que solicite al usuario un valor para la
//        celda y que solicite la posición donde se desea almacenar el valor,
//        cree una instancia de la clase Celda, asigne los valores cargados
//        por el usuario y agregue la instancia a la lista matrizCuadrada;
//        repita este proceso hasta que el usuario ingrese como valor la
//        cadena “FIN

        //llamamos metodo matriz
        Matriz.matrizCuadrada(sc);
    }


}