package yupanquiSerranoLeonel.Ejercicio1;

public class Vehiculo {

    public enum Color {ROJO, AZUL, VERDE, AMARILLO}

    public Color color;
    private final int anioFabricacion;
    private String modelo;

    public Vehiculo(Color color, int anioFabricacion, String modelo) {
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Color: " + color);
    }

    public void repintarVehiculo(Color nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El vehículo ha sido repintado. Nuevo color: " + nuevoColor);
    }
}