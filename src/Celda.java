public class Celda {
    //atributos
    int fila;
    int columna;
    String valor;

    //constructor vacio
    public Celda() {
    }

    //constructor
    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna=columna;
        this.valor = valor;
    }


    //get y set
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String toString() {
        return "Celda{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", valor='" + valor + '\'' +
                '}';
    }
}


