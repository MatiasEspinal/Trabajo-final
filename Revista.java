public class Revista extends MaterialBibliografico {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    // APLICANDO POLIMORFISMO: La revista se presta por 10 dias
    @Override
    public int getDiasDePrestamo() {
        return 10; 
    }

    public int getNumeroEdicion() { return numeroEdicion; }
}