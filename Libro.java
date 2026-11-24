public class Libro extends MaterialBibliografico {
    private String genero;

    public Libro(String titulo, String autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    // APLICANDO POLIMORFISMO: El libro se presta por 30 dias
    @Override
    public int getDiasDePrestamo() {
        return 30; 
    }

    public String getGenero() { return genero; }
}