/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Proyecto;
/**
 *
 * @author CRISTHOFER
 */
public class GestionProyecto {
    private Proyecto proyectos[];
    private int cantidad;

    public GestionProyecto() {

        proyectos = new Proyecto[50];
        cantidad = 0;

    }

    public boolean registrar(Proyecto proyecto) {

        if (cantidad < proyectos.length) {

            proyectos[cantidad] = proyecto;
            cantidad++;

            return true;

        }

        return false;

    }

    public Proyecto buscar(String nombre) {

        for (int i = 0; i < cantidad; i++) {

            if (proyectos[i].getNombreProyecto().equalsIgnoreCase(nombre)) {

                return proyectos[i];

            }

        }

        return null;

    }
    
    public boolean actualizar(Proyecto proyecto) {

    for (int i = 0; i < cantidad; i++) {

        if (proyectos[i].getNombreProyecto().equalsIgnoreCase(proyecto.getNombreProyecto())) {

            proyectos[i] = proyecto;

            return true;

        }

    }

    return false;

}

    public boolean eliminar(String nombre) {

        for (int i = 0; i < cantidad; i++) {

            if (proyectos[i].getNombreProyecto().equalsIgnoreCase(nombre)) {

                for (int j = i; j < cantidad - 1; j++) {

                    proyectos[j] = proyectos[j + 1];

                }

                proyectos[cantidad - 1] = null;

                cantidad--;

                return true;

            }

        }

        return false;

    }

    public String listar() {

        String lista = "";

    for (int i = 0; i < cantidad; i++) {

        lista += proyectos[i].obtenerDatos() + "\n\n";

    }

    return lista;

    }

    public int getCantidad() {

        return cantidad;

    }
    
    public Proyecto[] getProyectos() {

        return proyectos;

    }
    
    public Proyecto getProyecto(int posicion) {

        if (posicion >= 0 && posicion < cantidad) {

            return proyectos[posicion];

        }

        return null;
    }
    
   
}
