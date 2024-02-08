package yupanquiSerranoLeonel.Ejercicio2;

public class Caballo extends Pieza {
    public Caballo(Color color, int filaActual, int columnaActual) {
        super(color, filaActual, columnaActual);
    }
    @Override
    public boolean movimiento(int filaDestino, int columnaDestino) {
        int filaDiferencia = filaDestino - getFilaActual();
        int columnaDiferencia = columnaDestino - getColumnaActual();
        boolean movimientoValido = (filaDiferencia == 2 && (columnaDiferencia == 1 || columnaDiferencia == -1))
                || (filaDiferencia == 1 && (columnaDiferencia == 2 || columnaDiferencia == -2));

        if (movimientoValido) {
            setFilaActual(filaDestino);
            setColumnaActual(columnaDestino);
        }

        return movimientoValido;
    }
}