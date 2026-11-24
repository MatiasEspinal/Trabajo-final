public abstract class MaterialBibliografico {
    private String titulo;
    private String autor;
    private EstadoLibro estado;

    public MaterialBibliografico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = EstadoLibro.DISPONIBLE;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; } 
    public EstadoLibro getEstado() { return estado; }
    public void setEstado(EstadoLibro estado) { this.estado = estado; }

    // METODO POLIMORFICO: Las clases hijas deben decidir cuantos dias se presta
    public abstract int getDiasDePrestamo();
}