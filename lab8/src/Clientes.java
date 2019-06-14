
import java.io.Serializable;
import java.util.ArrayList;

public class Clientes implements Serializable {

    private String nombre;
    private String cuenta;
    private String contraseña;
    private String identidad;
    private String saldo;
    private String usuario;
    private static final long serialVersionUID = 79L;

    public Clientes(String nombre, String cuenta, String contraseña, String identidad, String saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
        this.identidad = identidad;
        this.saldo = saldo;
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

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
