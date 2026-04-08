package Sistema_Gestion_Estudiantes;

public class Estudiante {
    private String codigo_estudiante;
    private String nombre_estudiante;
    private float promedio;
    private Carrera carrera;


    public Estudiante() {
    }

    public Estudiante(String codigo_estudiante, String nombre_estudiante, float promedio, Carrera carrera) {
        this.codigo_estudiante = codigo_estudiante;
        this.nombre_estudiante = nombre_estudiante;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public String getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public void setCodigo_estudiante(String codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
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
                "codigo_estudiante='" + codigo_estudiante + '\'' +
                ", nombre_estudiante='" + nombre_estudiante + '\'' +
                ", promedio=" + promedio +
                ", carrera=" + carrera +
                ", aprobar= " + aprobar() +
                '}';
    }
}


