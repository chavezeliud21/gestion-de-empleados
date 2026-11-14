// Segunda clase derivada (Subclase) que hereda atributos y métodos de Empleado
public class Desarrollador extends Empleado {
    // Atributo único y exclusivo de la subclase Desarrollador
    private String lenguajePrincipal;

    // Constructor que inicializa los atributos heredados con 'super()' y el propio
    public Desarrollador(String nombre, double salario, String lenguajePrincipal) {
        super(nombre, "Desarrollador de Software", salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    // Método exclusivo de la subclase Desarrollador
    public void desplegarCodigo(String proyecto) {
        System.out.println("[Desarrollo] " + nombre + " desplegó el proyecto '" + proyecto + "' en " + lenguajePrincipal + ".");
    }

    // Sobrescritura de toString() para mostrar también el lenguaje de programación
    @Override
    public String toString() {
        return super.toString() + "\nLenguaje: " + lenguajePrincipal;
    }
}