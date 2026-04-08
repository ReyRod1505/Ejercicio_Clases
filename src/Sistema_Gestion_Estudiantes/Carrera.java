package Sistema_Gestion_Estudiantes;

public class Carrera {
    private String nombre_categoria;
    private int duracion_carrera;

    public Carrera() {
    }

    public Carrera(String nombre_categoria, int duracion_carrera) {
        this.nombre_categoria = nombre_categoria;
        this.duracion_carrera = duracion_carrera;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public int getDuracion_carrera() {
        return duracion_carrera;
    }

    public void setDuracion_carrera(int duracion_carrera) {
        this.duracion_carrera = duracion_carrera;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre_categoria='" + nombre_categoria + '\'' +
                ", duracion_carrera=" + duracion_carrera +
                '}';
    }
}