import java.util.Scanner;
import models.Cliente;
import models.Cuenta;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CUENTA BANCARIA ===");

        System.out.print("Ingrese la identificación del cliente: ");
        String identificacion = sc.nextLine();

        System.out.print("Ingrese los nombres del cliente: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = sc.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        double saldoInicial;
        do {
            System.out.print("Ingrese el saldo inicial: ");
            saldoInicial = sc.nextDouble();

            if (saldoInicial < 0) {
                System.out.println("Error: no se permite saldo negativo.");
            }
        } while (saldoInicial < 0);

        Cliente cliente = new Cliente(identificacion, nombres, apellidos);
        Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial, cliente);

        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar datos de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: C$ " + cuenta.consultarSaldo());
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 4:
                    System.out.println("\n=== DATOS DE LA CUENTA ===");
                    System.out.println(cuenta.mostrarDatos());
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }
}