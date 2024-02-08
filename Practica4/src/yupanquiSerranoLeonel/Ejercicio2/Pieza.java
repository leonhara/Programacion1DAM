package yupanquiSerranoLeonel.Ejercicio2;

public abstract class Pieza {
    private Color color;
    private int filaActual;
    private int columnaActual;

    public Pieza(Color color, int filaActual, int columnaActual) {
        this.color = color;
        this.filaActual = filaActual;
        this.columnaActual = columnaActual;
    }

    public abstract boolean movimiento(int filaDestino, int columnaDestino);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public void setFilaActual(int filaActual) {
        this.filaActual = filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public void setColumnaActual(int columnaActual) {
        this.columnaActual = columnaActual;
    }

    public void imprimirInformacion() {
        System.out.println("Color: " + color);
        System.out.println("Columna actual: " + columnaActual);
        System.out.println("Fila actual: " + filaActual);
    }
}