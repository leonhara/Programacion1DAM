package yupanquiSerranoLeonel.Ejercicio3;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
        setVida(getVida() + 30);
        setEstadisticas(getEstadisticas()[0] + 3, getEstadisticas()[1] + 2, getEstadisticas()[2] - 3);
    }
    @Override
    public void subirNivel() {
        int vidaSubir = (int) (Math.random() * 21) + 20;
        int fuerzaSubir = (int) (Math.random() * 3) + 1;
        int defensaSubir = (int) (Math.random() * 2) + 1;
        int magiaSubir = (int) (Math.random() * 2);

        setNivel(getNivel() + 1);

        setVida(getVida() + vidaSubir);
        setEstadisticas(getEstadisticas()[0] + fuerzaSubir, getEstadisticas()[1] + defensaSubir, getEstadisticas()[2] + magiaSubir);

        System.out.println(getNombre() + " ha subido de nivel!");
        System.out.println("Nuevas estadísticas:");
        imprimirInformacion();
    }
}