package Modulo;
import java.util.Scanner;

public class Cuenta {
    String numeroCuenta;
    double saldo;
    Cliente cliente;
    public Cuenta(String numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("Monto inválido.");
        }
    }

    // Retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Mostrar datos
    public String mostrarDatos() {
        return "Cliente: " + cliente.nombres + " " + cliente.apellidos +
                "\nCuenta: " + numeroCuenta +
                "\nSaldo: " + saldo;
    }
}