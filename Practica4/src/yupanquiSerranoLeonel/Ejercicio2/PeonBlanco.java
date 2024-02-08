package yupanquiSerranoLeonel.Ejercicio2;

public class PeonBlanco extends Pieza {
    public PeonBlanco(int filaActual, int columnaActual) {
        super(Color.BLANCO, filaActual, columnaActual);
    }

    @Override
    public boolean movimiento(int filaDestino, int columnaDestino) {
        if (columnaDestino == getColumnaActual()) {
            int filaDiferencia = filaDestino - getFilaActual();
            if (filaDiferencia == 1 || (filaDiferencia == 2 && getFilaActual() == 2)) {
                setFilaActual(filaDestino);
                setColumnaActual(columnaDestino);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}