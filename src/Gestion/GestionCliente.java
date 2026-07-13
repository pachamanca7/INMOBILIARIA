/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Cliente;
/**
 *
 * @author CRISTHOFER
 */
public class GestionCliente {
    private Cliente clientes[];
    private int cantidad;

    public GestionCliente() {

        clientes = new Cliente[100];
        cantidad = 0;

    }

    public boolean registrar(Cliente cliente) {

        if (cantidad < clientes.length) {

            clientes[cantidad] = cliente;
            cantidad++;

            return true;

        }

        return false;

    }

    public Cliente buscar(String dni) {

        for (int i = 0; i < cantidad; i++) {

            if (clientes[i].getDni().equals(dni)) {

                return clientes[i];

            }

        }

        return null;

    }
    
    public boolean actualizar(Cliente cliente) {

    for (int i = 0; i < cantidad; i++) {

        if (clientes[i].getDni().equals(cliente.getDni())) {

            clientes[i] = cliente;

            return true;

        }

    }

    return false;

}

    public boolean eliminar(String dni) {

        for (int i = 0; i < cantidad; i++) {

            if (clientes[i].getDni().equals(dni)) {

                for (int j = i; j < cantidad - 1; j++) {

                    clientes[j] = clientes[j + 1];

                }

                clientes[cantidad - 1] = null;

                cantidad--;

                return true;

            }

        }

        return false;

    }

    public String listar() {

        String lista = "";

    for (int i = 0; i < cantidad; i++) {

        lista += clientes[i].obtenerDatos() + "\n\n";

    }

    return lista;

    }

    public int getCantidad() {

        return cantidad;

    }
    
    public Cliente getCliente(int posicion) {
        if (posicion >= 0 && posicion < cantidad) {
            return clientes[posicion];
        }
        return null;
    }
}
