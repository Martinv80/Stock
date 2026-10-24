public class Main {
    public static void main(String[] args) {

        // Creación del objeto (sin constructores propios, usando el constructor por defecto)
        Producto prod = new Producto();

        // 1. Asignación inicial de valores válidos
        prod.setNombre("Mouse Inalámbrico");
        prod.setPrecio(25.50);
        prod.setStock(10);
        prod.setCategoria("Accesorios");

        System.out.println("=== DATOS INICIALES ===");
        System.out.println("Producto: " + prod.getNombre());
        System.out.println("Categoría: " + prod.getCategoria());
        System.out.println("Precio: $" + prod.getPrecio());
        System.out.println("Stock: " + prod.getStock());

        // 2. Pruebas de validación (valores inválidos que no deben guardarse)
        System.out.println("\n=== PRUEBAS DE VALIDACIÓN ===");
        prod.setNombre("");          // No debe aceptarlo
        prod.setPrecio(-15.0);       // No debe aceptarlo
        prod.setStock(-5);           // No debe aceptarlo

        System.out.println("\nValores tras intentar asignar datos erróneos:");
        System.out.println("Nombre actual: " + prod.getNombre());
        System.out.println("Precio actual: $" + prod.getPrecio());
        System.out.println("Stock actual: " + prod.getStock());

        // 3. Prueba del método aumentarStock
        System.out.println("\n=== PRUEBA DE AUMENTAR STOCK ===");
        prod.aumentarStock(-3);  // Cantidad inválida
        prod.aumentarStock(0);   // Cantidad no positiva
        prod.aumentarStock(5);   // Cantidad válida (pasa de 10 a 15)

        System.out.println("Stock final confirmado: " + prod.getStock());
    }
}