public class pedidos {
    private String productos;
    private int cantidad;
    private int numeroSolicitud;

    public pedidos() {
    }

    public pedidos(String productos, int cantidad, int numeroSolicitud) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }
    
    public void recibirPedido(){
        System.out.println("Su pedido ha sido recibido");
    }
    public void registroPedido(){
        System.out.println("ingres el numero de solicitud de su pedido");
    }
}
