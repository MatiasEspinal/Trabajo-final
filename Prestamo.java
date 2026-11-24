import java.time.LocalDate;

public class Prestamo {
    private Usuario usuario;
    private MaterialBibliografico material;
    private LocalDate fechaDePrestamo;
    private LocalDate fechaMaximaDevolucion;

    public Prestamo(Usuario usuario, MaterialBibliografico material) {
        this.usuario = usuario;
        this.material = material;
        this.fechaDePrestamo = LocalDate.now();
        
        // ¡MAGIA DEL POLIMORFISMO! Le sumamos los días dependiendo si es libro(30) o revista(10)
        this.fechaMaximaDevolucion = this.fechaDePrestamo.plusDays(material.getDiasDePrestamo());
    }

    public Usuario getUsuario() { return usuario; }
    public MaterialBibliografico getMaterial() { return material; }
    public LocalDate getFechaMaximaDevolucion() { return fechaMaximaDevolucion; }
}