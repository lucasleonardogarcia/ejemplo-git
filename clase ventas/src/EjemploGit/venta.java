package EjemploGit;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class venta implements Serializable {

    @Id
    private long idProducto;
    private String producto;
    private double precio;
    private int cantidad;
    @ManyToOne
    private Almacen almacen;

    public venta() {
    }

    public venta(String producto, double precio, int cantidad, Almacen almacen) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.almacen = almacen;
        
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public venta(long idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public void venta() {

    }

    public void registroVenta() {

    }

}
