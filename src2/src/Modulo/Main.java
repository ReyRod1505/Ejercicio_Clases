package Modulo;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar datos del cliente
        System.out.print("Ingrese identificación: ");
        String id = sc.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese apellidos: ");
        String apellidos = sc.nextLine();

        // Crear cliente
        Cliente cliente = new Cliente(id, nombres, apellidos);

        // Crear cuenta con saldo inicial 0
        Cuenta cuenta = new Cuenta("001", 0, cliente);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo() + " dólares");
                    break;

                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 4:
                    System.out.println(cuenta.mostrarDatos());
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}