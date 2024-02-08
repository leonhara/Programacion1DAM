package yupanquiSerranoLeonel.Ejercicio3;

public class Mago extends Personaje {
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
        setVida(getVida() + 20);
        setEstadisticas(getEstadisticas()[0] - 3, getEstadisticas()[1] + 1, getEstadisticas()[2] + 4);
    }
    @Override
    public void subirNivel() {
        int vidaSubir = (int) (Math.random() * 21) + 10;
        int fuerzaSubir = (int) (Math.random() * 2);
        int defensaSubir = (int) (Math.random() * 2);
        int magiaSubir = (int) (Math.random() * 5) + 2;

        setNivel(getNivel() + 1);

        setVida(getVida() + vidaSubir);
        setEstadisticas(getEstadisticas()[0] + fuerzaSubir, getEstadisticas()[1] + defensaSubir, getEstadisticas()[2] + magiaSubir);

        System.out.println(getNombre() + " ha subido de nivel!");
        System.out.println("Nuevas estadísticas:");
        imprimirInformacion();
    }
}
