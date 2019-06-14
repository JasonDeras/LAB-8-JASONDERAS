
import java.io.Serializable;
import java.util.Date;

public class Productos implements Serializable {

    private String nombre;
    private int cantidad;
    private int precio;
    private Date caducidad;
    private static final long serialVersionUID = 77L;

    public Productos(String nombre, int cantidad, int precio, Date caducidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.caducidad = caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
