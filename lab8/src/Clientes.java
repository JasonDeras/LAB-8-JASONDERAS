
import java.io.Serializable;
import java.util.ArrayList;

public class Clientes implements Serializable {

    private String nombre;
    private String cuenta;
    private String contraseña;
    private String identidad;
    private int saldo;
    private String usuario;
    private static final long serialVersionUID = 79L;
    private ArrayList<Productos> compra = new ArrayList();

    public Clientes(String nombre, String cuenta, String contraseña, String identidad, int saldo, String usuario) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
        this.identidad = identidad;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Productos> getCompra() {
        return compra;
    }

    public void setCompra(ArrayList<Productos> compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
