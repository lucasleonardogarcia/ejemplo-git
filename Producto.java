public class Producto {

    
private String idProducto;
private String nombre;
private int precio;
private String proveedor;
private int Cantidad; 

    public Producto() {
    }

    public Producto(String idProducto, String nombre, int precio, String proveedor, int Cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.Cantidad = Cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public void Asignacion(){
        System.out.println("Producto" + 1);
        
        
    }
    public void Retorno(){
        System.out.println("El producto ha retornado");
    }
}
