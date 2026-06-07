package model;

/**
 * Clase que representa a un guía turístico
 * Posee los atributos: nombre, edad, manejoDeIdiomas
 */
public class GuiaTuristico {
    private String nombreGuia; /** Nombre del guía turístico */
    private int edad; /** Edad del guía turístico en años */
    private String manejoDeIdiomas; /** Idiomas que maneja el guía turístico */

    /**
     * Constructor para crear instancias de la clase GuiaTuristico
     * @param nombreGuia
     * @param edad
     * @param manejoDeIdiomas
     */
    public GuiaTuristico(String nombreGuia, int edad, String manejoDeIdiomas) {
        this.nombreGuia = nombreGuia;
        this.edad = edad;
        this.manejoDeIdiomas = manejoDeIdiomas;
    }

    /**
     * Métodos Getter and Setter para obtener y modificar los atributos
     * @return
     */
    public String getNombreGuia() {
        return nombreGuia;
    }
    public void setNombre(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getManejoDeIdiomas() {
        return manejoDeIdiomas;
    }
    public void setManejoDeIdiomas(String manejoDeIdiomas) {
        this.manejoDeIdiomas = manejoDeIdiomas;
    }


    /**
     * Metodo que retorna objeto GuiaTuristico convertido a texto
     * @return
     */
    @Override
    public String toString() {
        return "\n"+"Guía turístico: "+nombreGuia+", Edad: "+edad+", Idioma/s: " +manejoDeIdiomas+"\n";
    }
}
