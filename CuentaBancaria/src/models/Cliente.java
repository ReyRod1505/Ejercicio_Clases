package models;

public class Cliente {
    private String identificacion;
    private String nombres;
    private String apellidos;

    public Cliente(String identificacion, String nombres, String apellidos) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombres + " " + apellidos +
                "\nIdentificación: " + identificacion;
    }
}