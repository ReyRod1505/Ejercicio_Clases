import javax.swing.JOptionPane;
import models.Cliente;
import models.Cuenta;

public class Main {
    public static void main(String[] args) {

        // Datos del cliente
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación:");
        String nombres = JOptionPane.showInputDialog("Ingrese los nombres:");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos:");
        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta:");

        double saldoInicial = 0;
        boolean valido = false;

        // Validación de saldo inicial
        do {
            try {
                saldoInicial = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese saldo inicial:")
                );

                if (saldoInicial >= 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No se permite saldo negativo.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
            }
        } while (!valido);

        Cliente cliente = new Cliente(identificacion, nombres, apellidos);
        Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial, cliente);

        int opcion;

        do {
            String menu = "=== MENÚ ===\n"
                    + "1. Consultar saldo\n"
                    + "2. Depositar dinero\n"
                    + "3. Retirar dinero\n"
                    + "4. Mostrar datos\n"
                    + "5. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Saldo actual: C$ " + cuenta.consultarSaldo());
                    break;

                case 2:
                    try {
                        double deposito = Double.parseDouble(
                                JOptionPane.showInputDialog("Monto a depositar:")
                        );
                        cuenta.depositar(deposito);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                    break;

                case 3:
                    try {
                        double retiro = Double.parseDouble(
                                JOptionPane.showInputDialog("Monto a retirar:")
                        );
                        cuenta.retirar(retiro);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, cuenta.mostrarDatos());
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 5);
    }
}