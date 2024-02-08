package yupanquiSerranoLeonel.Ejercicio2;

public class Torre extends Pieza {
    public Torre(Color color, int filaActual, int columnaActual) {
        super(color, filaActual, columnaActual);
    }

    @Override
    public boolean movimiento(int filaDestino, int columnaDestino) {
        if (filaDestino == getFilaActual() || columnaDestino == getColumnaActual()) {
            setFilaActual(filaDestino);
            setColumnaActual(columnaDestino);
            return true;
        } else {
            return false;
        }
    }
}