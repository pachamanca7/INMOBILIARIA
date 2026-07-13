/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Acabado;
/**
 *
 * @author CRISTHOFER
 */
public class GestionAcabado {
   private Acabado acabados[];
    private int cantidad;

    public GestionAcabado() {
        acabados = new Acabado[100];
        cantidad = 0;
    }

    public boolean registrar(Acabado acabado) {

        if (cantidad < acabados.length) {

            acabados[cantidad] = acabado;
            cantidad++;

            return true;

        }

        return false;

    }

    public Acabado buscar(String nombre) {

        for (int i = 0; i < cantidad; i++) {

            if (acabados[i].getNombre().equalsIgnoreCase(nombre)) {

                return acabados[i];

            }

        }

        return null;

    }
    public boolean eliminar(String nombre) {

    for (int i = 0; i < cantidad; i++) {

        if (acabados[i].getNombre().equalsIgnoreCase(nombre)) {

            for (int j = i; j < cantidad - 1; j++) {

                acabados[j] = acabados[j + 1];

            }

            acabados[cantidad - 1] = null;

            cantidad--;

            return true;

        }

    }

        return false;

    }

    public String listarDatos() {

        String lista = "";

    for (int i = 0; i < cantidad; i++) {

        lista += acabados[i].obtenerDatos() + "\n\n";

    }

    return lista;

    }

    public int getCantidad() {

        return cantidad;

    } 
}
