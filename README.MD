# Sistema de Gestión de Bibliotecas en Java (POO)

Proyecto integrador (EA4) desarrollado para la asignatura **Programación Orientada a Objetos Básica** de la Institución Universitaria Digital de Antioquia (IU Digital).

## Descripción del Proyecto
El sistema modela la operación de una biblioteca aplicando los principios fundamentales de la Programación Orientada a Objetos: **Encapsulamiento**, **Herencia** y **Polimorfismo**. Permite gestionar préstamos y devoluciones aplicando reglas de negocio dinámicas según el tipo de usuario y el tipo de material bibliográfico.

### Reglas de Negocio Implementadas
* **Jerarquía de Usuarios:**
  * `Estudiante`: límite máximo de **3** préstamos simultáneos.
  * `Profesor`: límite máximo de **5** préstamos simultáneos.
* **Jerarquía de Materiales:**
  * `Libro`: plazo máximo de devolución de **30 días**.
  * `Revista`: plazo máximo de devolución de **10 días**.

## Estructura del Repositorio
* `src/` o carpeta raíz: Código fuente completo en Java (10 archivos `.java`).
* `diagrama_clases.png`: Diagrama de clases UML actualizado con los conceptos de las 3 unidades.
* `EA4_ProyectoIntegrador.pdf`: Documentación formal en normas APA.

## Requisitos e Instrucciones de Ejecución
1. Tener instalado **Java JDK 17 o superior** y **Visual Studio Code** (con el Extension Pack for Java) o una terminal del sistema.
2. Clonar este repositorio:
   ```bash
   git clone https://github.com/MatiasEspinal/Trabajo-final