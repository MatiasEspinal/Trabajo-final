public class Profesor extends Usuario {
    private String departamento;

    public Profesor(String nombre, String identificacion, String departamento) {
        super(nombre, identificacion);
        this.departamento = departamento;
    }

    // APLICANDO POLIMORFISMO: El profesor tiene limite de 5
    @Override
    public int getLimitePrestamos() {
        return 5;
    }

    public String getDepartamento() { return departamento; }
}