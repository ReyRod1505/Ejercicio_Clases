package Sistema_Gestion_Estudiantes;

public class Estudiante {
    private String codigo;
    private String nombre;
    private float promedio;
    private Carrera carrera;


    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, float promedio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public boolean aprobar() {
        return this.promedio >= 70;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                ", carrera=" + carrera +
                ", aprobar= " + aprobar() +
                '}';
    }
}

