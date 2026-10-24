public class Producto {

    // Atributos privados
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    // Getters y Setters con validaciones y uso de this

    public String getNombre() {
        return this.nombre;
    }

    // Regla: nombre no vacío
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public double getPrecio() {
        return this.precio;
    }

    // Regla: precio no negativo
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo (" + precio + ").");
        }
    }

    public int getStock() {
        return this.stock;
    }

    // Regla: stock no negativo
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo (" + stock + ").");
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para aumentar stock: solo si la cantidad es positiva
    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Se aumentaron " + cantidad + " unidades. Stock actual: " + this.stock);
        } else {
            System.out.println("Error: La cantidad a aumentar debe ser positiva.");
        }
    }
}