package Sistema_Gestion_Estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Estudiante> listaEstudiante = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            opcion = sc.nextInt();


            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el codigo del estudiante:");
                    String codigo = sc.next();

                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombre = sc.next();

                    System.out.println("Ingrese el promedio del estudiante:");
                    float promedio = sc.nextFloat();


                    Estudiante e = new Estudiante (codigo, nombre, promedio);
                    listaEstudiante.add(e);

            }
        } while (opcion != 3);
        sc.close();

    }
}
