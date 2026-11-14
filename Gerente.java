// Clase derivada (Subclase) que hereda de Empleado mediante la palabra clave 'extends'
public class Gerente extends Empleado {
    // Atributo único y exclusivo de la subclase Gerente
    private double bonoAnual;

    // Constructor que llama al constructor de la clase base usando 'super()'
    public Gerente(String nombre, double salario, double bonoAnual) {
        super(nombre, "Gerente de Área", salario);
        this.bonoAnual = bonoAnual;
    }

    // Método exclusivo de la subclase Gerente
    public void aprobarPresupuesto(double monto) {
        System.out.println("[Gerencia] " + nombre + " ha aprobado un presupuesto de $" + monto);
    }

    // Sobrescritura (@Override) del método de la clase base para incluir el bono anual
    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + bonoAnual;
    }

    // Sobrescritura de toString() reutilizando el formato base y agregando el bono
    @Override
    public String toString() {
        return super.toString() + "\nBono Anual: $" + bonoAnual;
    }
}