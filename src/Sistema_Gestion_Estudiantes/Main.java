package Sistema_Gestion_Estudiantes;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    scanner.nextLine();

                    System.out.println("Ingrese el codigo del estudiante:");
                    String codigoEstudiante = scanner.nextLine();

                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombreEstudiante = scanner.nextLine();

                    System.out.println("Ingrese el promedio del estudiante:");
                    float promedioEstudiante = scanner.nextFloat();

                    scanner.nextLine();

                    System.out.println("Ingrese el nombre de la carrera:");
                    String nombreCarrera = scanner.nextLine();

                    System.out.println("Ingrese la duracion de la carrera:");
                    int duracionCarrera = scanner.nextInt();


                    Carrera carrera = new Carrera(nombreCarrera, duracionCarrera);

                    Estudiante estudiante = new Estudiante(
                            codigoEstudiante,
                            nombreEstudiante,
                            promedioEstudiante,
                            carrera
                    );

                    listaEstudiantes.add(estudiante);

                    System.out.println("Estudiante registrado correctamente");
                    break;

                case 2:
                    System.out.println("===== LISTA DE ESTUDIANTES =====");

                    if (listaEstudiantes.size() == 0) {
                        System.out.println("No hay estudiantes registrados");
                    } else {
                        for (int i = 0; i < listaEstudiantes.size(); i++) {
                            System.out.println(listaEstudiantes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 3);

        scanner.close();
    }
}