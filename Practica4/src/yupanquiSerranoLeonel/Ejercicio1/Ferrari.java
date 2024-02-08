package yupanquiSerranoLeonel.Ejercicio1;

public class Ferrari extends Vehiculo {

    private int caballosFuerza;

    public Ferrari(Color color, int anioFabricacion, String modelo, int caballosFuerza) {
        super(color, anioFabricacion, modelo);
        this.caballosFuerza = caballosFuerza;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosDeFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Caballos de Fuerza: " + caballosFuerza);
    }
}