public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();

        // Creamos usuarios usando las subclases
        Estudiante matias = new Estudiante("Matias Espinal", "1001", "Desarrollo de Software");
        Profesor santiago = new Profesor("Prof. Santiago", "2001", "Ingenieria");

        biblio.agregarUsuario(matias);
        biblio.agregarUsuario(santiago);

        // Creamos materiales usando las subclases
        Libro libro1 = new Libro("Java Basico", "Autor X", "Tecnologia");
        Libro libro2 = new Libro("Bases de Datos", "Autor Y", "Tecnologia");
        Libro libro3 = new Libro("Redes", "Autor Z", "Tecnologia");
        Libro libro4 = new Libro("Seguridad", "Autor W", "Tecnologia");
        Revista revista1 = new Revista("Tech Monthly", "Varios", 45);

        biblio.agregarMaterial(libro1);
        biblio.agregarMaterial(libro2);
        biblio.agregarMaterial(libro3);
        biblio.agregarMaterial(libro4);
        biblio.agregarMaterial(revista1);

        System.out.println("--- PRUEBA ESTUDIANTE (Limite 3, Libros 30 dias, Revistas 10 dias) ---");
        biblio.registrarPrestamo(matias, libro1);
        biblio.registrarPrestamo(matias, libro2);
        biblio.registrarPrestamo(matias, revista1);
        biblio.registrarPrestamo(matias, libro4); // Debe dar error por pasar de 3

        System.out.println("\n--- PRUEBA PROFESOR (Limite 5) ---");
        biblio.registrarPrestamo(santiago, libro3); // Dejara prestarlo sin problema

        System.out.println("\n--- PRUEBA DEVOLUCION ---");
        biblio.devolverMaterial(matias, libro1);
        biblio.registrarPrestamo(matias, libro4); // Ahora si deja prestarlo porque libero 1 cupo
    }
}