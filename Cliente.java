/**
 * Clase que representa los clientes.
 * @author Jesús
 */
public class Cliente {
    private boolean esVip;
    private String nombre;
    private int id;

    public boolean getEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Constructor de la clase cliente
     * @param vip
     * @param nombre
     * @param id
     */
    public Cliente(boolean vip, String nombre, int id) {
        this.esVip = vip;
        this.nombre = nombre;
        this.id = id;
    }
}
