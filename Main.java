/**
 * Clase principal para probar la instanciación de objetos y llamadas a métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");

        // Instanciación de objetos
        Empleado emp1 = new Empleado("Ana Martínez", "Desarrolladora Java", 25000.0);
        Empleado emp2 = new Empleado("Carlos López", "Analista de Datos", 22000.0);

        System.out.println("\n--- Estado Inicial ---");
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        System.out.println("\n--- Aplicando Aumentos ---");
        emp1.aplicarAumento(10);
        emp2.aplicarAumento(5);

        System.out.println("\n--- Estado Actualizado y Salario Anual ---");
        emp1.mostrarInformacion();
        System.out.println("Salario Anual: $" + emp1.calcularSalarioAnual());

        emp2.mostrarInformacion();
        System.out.println("Salario Anual: $" + emp2.calcularSalarioAnual());
    }
}
