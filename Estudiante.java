public class Estudiante extends Usuario {
    private String carrera;

    public Estudiante(String nombre, String identificacion, String carrera) {
        super(nombre, identificacion);
        this.carrera = carrera;
    }

    // APLICANDO POLIMORFISMO: El estudiante tiene limite de 3
    @Override
    public int getLimitePrestamos() {
        return 3;
    }

    public String getCarrera() { return carrera; }
}