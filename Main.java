// Clase principal para instanciar objetos de las subclases y comprobar la herencia
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS (HERENCIA) ===\n");

        // Instanciación de objetos de las clases derivadas (Subclases)
        Gerente gerente1 = new Gerente("Ana Martínez", 35000.0, 15000.0);
        Desarrollador dev1 = new Desarrollador("Carlos López", 24000.0, "Java");

        // 1. Mostrar estado inicial utilizando métodos heredados y sobrescritos
        System.out.println("--- Personal Registrado ---");
        System.out.println(gerente1);
        System.out.println("--------------------------------");
        System.out.println(dev1);
        System.out.println("--------------------------------\n");

        // 2. Probar métodos heredados directamente de la clase base Empleado
        System.out.println("--- Aplicando Aumentos (Método Heredado) ---");
        gerente1.aplicarAumento(10.0);
        dev1.aplicarAumento(8.0);
        System.out.println();

        // 3. Probar métodos exclusivos de cada subclase
        System.out.println("--- Acciones Específicas por Rol ---");
        gerente1.aprobarPresupuesto(120000.0);
        dev1.desplegarCodigo("Módulo de Nómina");
        System.out.println();

        // 4. Verificar cálculo anual (sobrescrito en Gerente vs heredado en Desarrollador)
        System.out.println("--- Proyección Salarial Anual ---");
        System.out.println(gerente1.getNombre() + " (con bono incluido): $" + gerente1.calcularSalarioAnual());
        System.out.println(dev1.getNombre() + " (salario base anual): $" + dev1.calcularSalarioAnual());
    }
}