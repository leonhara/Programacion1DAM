package yupanquiSerranoLeonel.Ejercicio3;

import java.util.Arrays;

public abstract class Personaje {
    protected String nombre;
    public int nivel;
    private int vida = 100;
    private int[] estadisticas = {10, 10, 10};

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        setNivel(nivel);
    }

    public abstract void subirNivel();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = Math.max(1, Math.min(99, nivel));
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida);
    }

    public int[] getEstadisticas() {
        return Arrays.copyOf(estadisticas, estadisticas.length);
    }

    public void setEstadisticas(int fuerza, int defensa, int magia) {
        estadisticas[0] = fuerza;
        estadisticas[1] = defensa;
        estadisticas[2] = magia;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Estadísticas: ");
        System.out.println(" Fuerza: " + estadisticas[0]);
        System.out.println(" Defensa: " + estadisticas[1]);
        System.out.println(" Magia: " + estadisticas[2]);
    }

    public void cambioClase(String nuevaClase) {
        int vidaActual = getVida();
        int fuerzaActual = getEstadisticas()[0];
        int defensaActual = getEstadisticas()[1];
        int magiaActual = getEstadisticas()[2];

        if (nuevaClase.equalsIgnoreCase("Guerrero")) {
            vidaActual -= (30 + (getNivel() - 1) * 10);
            fuerzaActual -= 3;
            defensaActual -= 2;
            magiaActual += 3;
        } else if (nuevaClase.equalsIgnoreCase("Mago")) {
            vidaActual -= (20 + (getNivel() - 1) * 10);
            fuerzaActual -= 3;
            defensaActual -= 1;
            magiaActual += 4;
        } else if (nuevaClase.equalsIgnoreCase("Defensor")) {
            vidaActual -= (50 + (getNivel() - 1) * 10);
            fuerzaActual -= 1;
            defensaActual -= 4;
            magiaActual += 3;
        } else {
            System.out.println("Clase no válida");
            return;
        }

        if (nuevaClase.equalsIgnoreCase("Guerrero")) {
            setVida(100 + 30 + (getNivel() - 1) * 10);
            setEstadisticas(10 + 3, 10 + 2, 10 - 3);
        } else if (nuevaClase.equalsIgnoreCase("Mago")) {
            setVida(100 + 20 + (getNivel() - 1) * 10);
            setEstadisticas(10 - 3, 10 + 1, 10 + 4);
        } else if (nuevaClase.equalsIgnoreCase("Defensor")) {
            setVida(100 + 50 + (getNivel() - 1) * 10);
            setEstadisticas(10 + 1, 10 + 4, 10 - 3);
        } else {
            System.out.println("Clase no válida.");
            return;
        }

        System.out.println(getNombre() + " ha cambiado de clase a " + nuevaClase);
        System.out.println("Nuevas estadísticas:");
        imprimirInformacion();
    }

}
