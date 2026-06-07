package model;

/**
 * Clase principal que representa una agencia
 * Posee atributo: nombre
 * Agencia tiene un/a direccion, proveedorAlojamiento, proveedorTransporte
 * Agencia tiene varios clientes
 */
public class Agencia {
    private String nombreAgencia; /** Nombre de la agencia */
    private Direccion direccion; /** Dirección de la agencia */
    private ProveedorAlojamiento proveedorAlojamiento; /** Proveedor de alojamiento de la agencia */
    private ProveedorTransporte proveedorTransporte; /** Proveedor de transporte de la agencia */
    private Cliente[] clientes; /** Clientes de la agencia */

    /**
     * Constructor para crear instancias de la clase Agencia
     * @param nombreAgencia
     * @param direccion
     * @param proveedorAlojamiento
     * @param proveedorTransporte
     * @param clientes
     */
    public Agencia(String nombreAgencia, Direccion direccion, ProveedorAlojamiento proveedorAlojamiento, ProveedorTransporte proveedorTransporte, Cliente[] clientes) {
        this.nombreAgencia = nombreAgencia;
        this.direccion = direccion;
        this.proveedorAlojamiento = proveedorAlojamiento;
        this.proveedorTransporte = proveedorTransporte;
        this.clientes = clientes;
    }

    /**
     * Métodos Getter and Setter para obtener y modificar los atributos
     * @return
     */
    public String getNombreAgencia() {
        return nombreAgencia;
    }
    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ProveedorAlojamiento getProveedorAlojamiento() {
        return proveedorAlojamiento;
    }
    public void setProveedorAlojamiento(ProveedorAlojamiento proveedorAlojamiento) {
        this.proveedorAlojamiento = proveedorAlojamiento;
    }

    public ProveedorTransporte getProveedorTransporte() {
        return proveedorTransporte;
    }
    public void setProveedorTransporte(ProveedorTransporte proveedorTransporte) {
        this.proveedorTransporte = proveedorTransporte;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    /**
     * Metodo que retorna objeto Agencia convertido a texto
     * Concatena los objetos Direccion, GuiaTuristico, ProveedorAlojamiento, ProveedorTransporte
     * @return
     */
    @Override
    public String toString() {
        String resultado = "Nombre Agencia: "+nombreAgencia+", "+direccion+"\n"+"Proveedor Alojamiento: "
                +proveedorAlojamiento+proveedorTransporte;

        /**
         * For each: se recorre el arreglo clientes y cada elemento del recorrido se guarda en la variable "c" de tipo Cliente
         * A "resultado" se le asigna su valor actual y se concatena el recorrido del arreglo convertido a texto
         */
        for (Cliente c : clientes){
            resultado = resultado+"\n"+c.toString();
        }
        return resultado;
    }
}
