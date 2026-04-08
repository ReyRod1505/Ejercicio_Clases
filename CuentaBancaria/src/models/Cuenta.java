package models;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(String numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
        this.cliente = cliente;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito.");
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor que 0.");
        }
    }

    public double retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor que 0.");
            return 0;
        }

        if (monto > saldo) {
            System.out.println("Error: saldo insuficiente.");
            return 0;
        }

        saldo -= monto;
        System.out.println("Retiro realizado con éxito.");
        return monto;
    }

    public String mostrarDatos() {
        return cliente.toString() +
                "\nNúmero de cuenta: " + numeroCuenta +
                "\nSaldo actual: C$ " + saldo;
    }
}