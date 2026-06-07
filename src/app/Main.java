package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        //Se crean instancias de la clase Direccion
        Direccion direccionAgencia = new Direccion("Los Naranjos 123", "Viña del Mar");
        Direccion direccionProvAlojamiento = new Direccion("El Sauce 099", "Reñaca");
        Direccion direccionProvTransporte = new Direccion("Carrera 321", "Quilpué");

        //Se crea una instancia de la clase ProveedorAlojamiento. Se añade su direccion
        ProveedorAlojamiento proveedorAlojamiento = new ProveedorAlojamiento("Marina Hotel", "m.h@contacto.cl", "955092201",
                179990, direccionProvAlojamiento);

        //Se crea una instancia de la clase ProveedorTransporte. Se añade su direccion
        ProveedorTransporte proveedorTransporte = new ProveedorTransporte("Transportes Omega", "tr.o@gmail.com", "901213344",
                "Bus", direccionProvTransporte);

        //Se crean dos instancias de la clase GuiaTuristico
        GuiaTuristico guiaTuristico1 = new GuiaTuristico("Viviana Rivera", 31, "Español/Inglés");
        GuiaTuristico guiaTuristico2 = new GuiaTuristico("Eduardo López", 25, "Español/Inglés");

        //Se crea un arreglo de objetos de tipo Cliente. A cada Cliente se le añade un GuiaTuristico
        Cliente[] clientes = {
                new Cliente("Anastasia Petrova", 47, "a.r@gmail.com", "Rusa", guiaTuristico1),
                new Cliente("Marco Saéz", 39, "m.s@gmail.com", "Española", guiaTuristico1),
                new Cliente("Elena Sinclair", 25, "e.s@gmail.com", "Francesa", guiaTuristico2),
                new Cliente("Martin Montoya", 27, "m.m@gmail.com", "Española", guiaTuristico2)
        };

        //Se crea una instancia de la clase principal Agencia
        Agencia agencia = new Agencia("Turismo Marina", direccionAgencia, proveedorAlojamiento, proveedorTransporte, clientes);

        //Se imprime Agencia
        System.out.println(agencia);
    }
}
