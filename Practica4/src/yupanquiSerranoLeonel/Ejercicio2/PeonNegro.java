package yupanquiSerranoLeonel.Ejercicio2;

public class PeonNegro extends Pieza {

    public PeonNegro(int filaActual, int columnaActual) {
        super(Color.NEGRO, filaActual, columnaActual);
    }

    @Override
    public boolean movimiento(int filaDestino, int columnaDestino) {
        int filaDiferencia = filaDestino - getFilaActual();
        int columnaDiferencia = columnaDestino - getColumnaActual();

        if (columnaDiferencia == 0 && (filaDiferencia == -1 || (filaDiferencia == -2 && getFilaActual() == 7))) {
            setFilaActual(filaDestino);
            setColumnaActual(columnaDestino);
            return true;
        } else {
            return false;
        }
    }
}