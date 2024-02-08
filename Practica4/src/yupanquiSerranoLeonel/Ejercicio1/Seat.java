package yupanquiSerranoLeonel.Ejercicio1;

public class Seat extends Vehiculo {

    private String tipoCombustible;

    public Seat(Color color, int anioFabricacion, String modelo, String tipoCombustible) {
        super(color, anioFabricacion, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
}