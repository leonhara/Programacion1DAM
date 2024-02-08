package yupanquiSerranoLeonel;

import java.util.Scanner;

import yupanquiSerranoLeonel.Ejercicio1.Ferrari;
import yupanquiSerranoLeonel.Ejercicio1.Seat;
import yupanquiSerranoLeonel.Ejercicio1.Vehiculo;
import yupanquiSerranoLeonel.Ejercicio2.Caballo;
import yupanquiSerranoLeonel.Ejercicio2.PeonBlanco;
import yupanquiSerranoLeonel.Ejercicio2.PeonNegro;
import yupanquiSerranoLeonel.Ejercicio2.Color;
import yupanquiSerranoLeonel.Ejercicio2.Torre;
import yupanquiSerranoLeonel.Ejercicio3.Defensor;
import yupanquiSerranoLeonel.Ejercicio3.Guerrero;
import yupanquiSerranoLeonel.Ejercicio3.Mago;
import yupanquiSerranoLeonel.Ejercicio3.Personaje;

//Del ejercicio 3 solo me queda el cambio de clase
class Main {

    static void ejercicio1() {
        Vehiculo miVehiculo = new Vehiculo(Vehiculo.Color.VERDE, 2020, "SUV");
        int opcion = 1;

        while (opcion != 0) {
            Scanner sc = new Scanner(System.in);

            System.out.println("---------------------------------------------------------");
            System.out.println("Elige tu acción sobre el vehículo:");
            System.out.println("1 Mostrar información del vehículo");
            System.out.println("2 Repintar el vehiculo");
            System.out.println("3 Mostrar información de Ferrari");
            System.out.println("4 Mostrar información de Seat");
            System.out.println("0 Salir");
            System.out.println("---------------------------------------------------------");

            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Volviendo al menú principal");
                    return;
                case 1: miVehiculo.mostrarInformacion();
                case 2:
                    System.out.println("Selecciona el nuevo color (0 ROJO, 1 AZUL, 2 VERDE, 3 AMARILLO):");
                    int newColor = sc.nextInt();
                    Vehiculo.Color nuevoColor = Vehiculo.Color.values()[newColor];
                    miVehiculo.repintarVehiculo(nuevoColor);
                case 3:
                    Ferrari ferrari = new Ferrari(miVehiculo.getColor(), miVehiculo.getAnioFabricacion(), miVehiculo.getModelo(), 800);
                    ferrari.mostrarInformacion();

                case 4:
                    Seat seat = new Seat(miVehiculo.getColor(), miVehiculo.getAnioFabricacion(), miVehiculo.getModelo(), "Gasolina");
                    seat.mostrarInformacion();
                default: System.out.println("Opción no válida. Prueba de nuevo");
            }
        }
    }
    static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        PeonBlanco peonBlanco = new PeonBlanco(2, 1);
        Torre torreBlanca = new Torre(Color.BLANCO, 1, 1);
        Caballo caballoBlanco = new Caballo(Color.BLANCO, 1, 2);
        PeonNegro peonNegro = new PeonNegro(7, 1);

        System.out.println("La partida está avanzada.");

        System.out.println("Elige una pieza:");
        System.out.println("1 Peón Blanco en (1, 2)");
        System.out.println("2 Torre Blanca en (1, 1)");
        System.out.println("3 Caballo Blanco en (2, 1)");
        System.out.println("4 Peón Negro en (1, 7)");

        int opcion = scanner.nextInt();

        System.out.print("Introduce la columna de destino (1-8): ");
        int columnaDestino = scanner.nextInt();
        System.out.print("Introduce la fila de destino (1-8): ");
        int filaDestino = scanner.nextInt();

        boolean movimientoValido = false;
        switch (opcion) {
            case 1:
                System.out.println("Movimiento del Peón Blanco:");
                movimientoValido = peonBlanco.movimiento(filaDestino, columnaDestino);
                break;
            case 2:
                System.out.println("Movimiento de la Torre Blanca:");
                movimientoValido = torreBlanca.movimiento(filaDestino, columnaDestino);
                break;
            case 3:
                System.out.println("Movimiento del Caballo Blanco:");
                movimientoValido = caballoBlanco.movimiento(filaDestino, columnaDestino);
                break;
            case 4:
                System.out.println("Movimiento del Peón Negro:");
                movimientoValido = peonNegro.movimiento(filaDestino, columnaDestino);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("Información después del movimiento:");
        switch (opcion) {
            case 1:
                if (movimientoValido) {
                    System.out.println("Movimiento válido");
                } else {
                    System.out.println("Movimiento inválido");
                }
                peonBlanco.imprimirInformacion();
                break;
            case 2:
                if (movimientoValido) {
                    System.out.println("Movimiento válido");
                } else {
                    System.out.println("Movimiento inválido");
                }
                torreBlanca.imprimirInformacion();
                break;
            case 3:
                if (movimientoValido) {
                    System.out.println("Movimiento válido");
                } else {
                    System.out.println("Movimiento inválido");
                }
                caballoBlanco.imprimirInformacion();
                break;
            case 4:
                if (movimientoValido) {
                    System.out.println("Movimiento válido");
                } else {
                    System.out.println("Movimiento inválido");
                }
                peonNegro.imprimirInformacion();
                break;
        }
    }

    static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        Personaje personaje = null;
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("\n----------------Menú----------------");
            System.out.println("1 Crear nuevo personaje");
            System.out.println("2 Subir de nivel");
            System.out.println("3 Cambiar de clase");
            System.out.println("4 Mostrar información del personaje");
            System.out.println("0 Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del personaje: ");
                    nombre = scanner.nextLine();

                    System.out.println("Seleccione la clase del personaje (Guerrero, Mago, Defensor):");
                    String nombreClase = scanner.nextLine().toLowerCase();

                    switch (nombreClase) {
                        case "guerrero":
                            personaje = new Guerrero(nombre, 1);
                            break;
                        case "mago":
                            personaje = new Mago(nombre, 1);
                            break;
                        case "defensor":
                            personaje = new Defensor(nombre, 1);
                            break;
                        default:
                            System.out.println("Clase no válida");
                            break;
                    }

                    if (personaje != null) {
                        System.out.println("Personaje creado: " + personaje.getClass().getSimpleName());
                        personaje.imprimirInformacion();
                    }
                    break;
                case 2:
                    if (personaje != null) {
                        personaje.subirNivel();
                    } else {
                        System.out.println("Crea un personaje primero!");
                    }
                    break;
                case 3:
                    if (personaje != null) {
                        System.out.print("Ingrese la nueva clase (Guerrero, Mago, Defensor): ");
                        String nuevaClase = scanner.nextLine();
                        personaje.cambioClase(nuevaClase);
                    } else {
                        System.out.println("Crea un personaje primero!");
                    }
                    break;
                case 4:
                    if (personaje != null) {
                        personaje.imprimirInformacion();
                    } else {
                        System.out.println("Crea un personaje primero!");
                    }
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }

    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default ->
                        System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }


        }


    }

}