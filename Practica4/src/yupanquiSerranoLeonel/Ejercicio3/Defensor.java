package yupanquiSerranoLeonel.Ejercicio3;

public class Defensor extends Personaje {
    public Defensor(String nombre, int nivel) {
        super(nombre, nivel);
        setVida(getVida() + 50);
        setEstadisticas(getEstadisticas()[0] + 1, getEstadisticas()[1] + 4, getEstadisticas()[2] - 3);
    }
    @Override
    public void subirNivel() {
        int vidaSubir = (int) (Math.random() * 21) + 40;
        int fuerzaSubir = (int) (Math.random() * 3) + 1;
        int defensaSubir = (int) (Math.random() * 3) + 2;
        int magiaSubir = (int) (Math.random() * 2);

        setNivel(getNivel() + 1);

        setVida(getVida() + vidaSubir);
        setEstadisticas(getEstadisticas()[0] + fuerzaSubir, getEstadisticas()[1] + defensaSubir, getEstadisticas()[2] + magiaSubir);

        System.out.println(getNombre() + " ha subido de nivel!");
        System.out.println("Nuevas estadísticas:");
        imprimirInformacion();
    }
}