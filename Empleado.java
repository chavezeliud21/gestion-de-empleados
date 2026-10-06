/**
 * Clase Empleado que define atributos, constructor y métodos principales.
 */
public class Empleado {
    // Atributos privados
    private String nombre;
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("-----------------------------------");
        System.out.println("Empleado: " + nombre);
        System.out.println("Puesto:   " + puesto);
        System.out.println("Salario:  $" + salario);
    }

    // Método para aplicar aumento
    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = salario * (porcentaje / 100);
            salario += aumento;
            System.out.println("-> Aumento del " + porcentaje + "% aplicado a " + nombre + ".");
        }
    }

    // Método con retorno para calcular salario anual
    public double calcularSalarioAnual() {
        return salario * 12;
    }
}
