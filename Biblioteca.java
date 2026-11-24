import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MaterialBibliografico> catalogo;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBibliografico m) {
        catalogo.add(m);
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void registrarPrestamo(Usuario usuario, MaterialBibliografico material) {
        if (material.getEstado() == EstadoLibro.PRESTADO) {
            System.out.println("Error: '" + material.getTitulo() + "' ya esta prestado.");
            return;
        }

        long activos = prestamos.stream().filter(p -> p.getUsuario().equals(usuario)).count();

        // APLICANDO POLIMORFISMO: Verifica el limite de 3 o 5 sin usar condicionales if gigantes
        if (activos >= usuario.getLimitePrestamos()) {
            System.out.println("Error: " + usuario.getNombre() + " supero su limite de " + usuario.getLimitePrestamos() + " prestamos.");
            return;
        }

        Prestamo nuevo = new Prestamo(usuario, material);
        prestamos.add(nuevo);
        material.setEstado(EstadoLibro.PRESTADO);
        System.out.println("Exito: '" + material.getTitulo() + "' prestado a " + usuario.getNombre() + ". Devolver antes de: " + nuevo.getFechaMaximaDevolucion());
    }

    public void devolverMaterial(Usuario usuario, MaterialBibliografico material) {
        Prestamo prestamoEncontrado = null;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario) && p.getMaterial().equals(material)) {
                prestamoEncontrado = p;
                break;
            }
        }

        if (prestamoEncontrado != null) {
            prestamos.remove(prestamoEncontrado);
            material.setEstado(EstadoLibro.DISPONIBLE);
            System.out.println("Devolucion exitosa: '" + material.getTitulo() + "' fue devuelto por " + usuario.getNombre() + ".");
        } else {
            System.out.println("Error: No se encontro un prestamo activo de '" + material.getTitulo() + "' para " + usuario.getNombre() + ".");
        }
    }
}