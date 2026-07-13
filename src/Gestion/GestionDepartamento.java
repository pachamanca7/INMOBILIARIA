/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Departamento;
/**
 *
 * @author CRISTHOFER
 */
public class GestionDepartamento {
    private Departamento departamentos[];
    private int cantidad;

    public GestionDepartamento() {

        departamentos = new Departamento[300];
        cantidad = 0;

    }

    public boolean registrar(Departamento departamento) {

        if (cantidad < departamentos.length) {

            departamentos[cantidad] = departamento;
            cantidad++;

            return true;

        }

        return false;

    }

    public Departamento buscar(String codigo) {

        for (int i = 0; i < cantidad; i++) {

            if (departamentos[i].getCodigo().equalsIgnoreCase(codigo)) {

                return departamentos[i];

            }

        }

        return null;

    }
    
    public boolean actualizar(Departamento departamento) {

    for (int i = 0; i < cantidad; i++) {

        if (departamentos[i].getCodigo().equals(departamento.getCodigo())) {

            departamentos[i] = departamento;

            return true;

        }

    }

    return false;

}

    public boolean eliminar(String codigo) {

        for (int i = 0; i < cantidad; i++) {

            if (departamentos[i].getCodigo().equalsIgnoreCase(codigo)) {

                for (int j = i; j < cantidad - 1; j++) {

                    departamentos[j] = departamentos[j + 1];

                }

                departamentos[cantidad - 1] = null;

                cantidad--;

                return true;

            }

        }

        return false;

    }

    public String listar() {

        String lista = "";

    for (int i = 0; i < cantidad; i++) {

        lista += departamentos[i].obtenerDatos() + "\n\n";

    }

    return lista;

    }

    public int getCantidad() {

        return cantidad;

    }
    public Departamento getDepartamento(int posicion) {
        if (posicion >= 0 && posicion < cantidad) {
            return departamentos[posicion];
        }
        return null;
    }
}
