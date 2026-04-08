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

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombres + " " + apellidos +
                "\nIdentificación: " + identificacion;
    }
}