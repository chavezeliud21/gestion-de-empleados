// Clase Base (Superclase) que define los atributos y comportamientos generales de cualquier empleado
public class Empleado {
    // Atributos protegidos (protected) para que las clases derivadas puedan reutilizarlos directamente
    protected String nombre;
    protected String puesto;
    protected double salario;

    // Constructor de la clase base
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Métodos Getters para consultar la información de manera segura
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    // Método heredable para incrementar el salario según un porcentaje
    public void aplicarAumento(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
        System.out.println("-> Aumento del " + porcentaje + "% aplicado a " + this.nombre + ".");
    }

    // Método heredable que calcula el salario anual base (será sobrescrito en subclases si aplica)
    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    // Método para mostrar la información formateada del empleado
    @Override
    public String toString() {
        return "Empleado: " + nombre + "\nPuesto:   " + puesto + "\nSalario:  $" + salario;
    }
}