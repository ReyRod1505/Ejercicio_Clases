package models;

import javax.swing.JOptionPane;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(String numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = (saldo >= 0) ? saldo : 0;
        this.cliente = cliente;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            JOptionPane.showMessageDialog(null, "Depósito realizado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: monto inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "Error: monto inválido.");
        } else if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Error: saldo insuficiente.");
        } else {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiro realizado con éxito.");
        }
    }

    public String mostrarDatos() {
        return cliente.toString() +
                "\nNúmero de cuenta: " + numeroCuenta +
                "\nSaldo actual: C$ " + saldo;
    }
}