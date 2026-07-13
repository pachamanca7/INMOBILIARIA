/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Administrador;
import Clases.AsesorVenta;
import Clases.Empleado;
import Clases.Gerente;
/**
 *
 * @author CRISTHOFER
 */
public class GestionEmpleado {
    private Empleado empleados[];
    private int cantidad;

    public GestionEmpleado() {

        empleados = new Empleado[100];
        cantidad = 0;

    }
    
    public void cargarEmpleadosIniciales() {

    registrar(new Administrador(
            "12345678",
            "Carlos",
            "Perez",
            "admin",
            "1234"));

    registrar(new AsesorVenta(
            "87654321",
            "Luis",
            "Ramirez",
            "asesor",
            "1234"));

    registrar(new Gerente(
            "11111111",
            "Ana",
            "Gomez",
            "gerente",
            "1234"));

}

    public boolean registrar(Empleado empleado) {

        if (cantidad < empleados.length) {
            
            empleados[cantidad] = empleado;
            cantidad++;
            return true;
        }
        return false;
    }
    public boolean actualizar(Empleado empleado) {

    for (int i = 0; i < cantidad; i++) {

        if (empleados[i].getDni().equals(empleado.getDni())) {

            empleados[i] = empleado;

            return true;

        }

    }

    return false;

    }

    public Empleado buscar(String dni) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(dni)) {
                return empleados[i];
            }
        }

        return null;
    }
    public Empleado buscarUsuario(String usuario, String contraseña) {

    for (int i = 0; i < cantidad; i++) {

        if (empleados[i].getUsuario().equals(usuario)
                && empleados[i].getContraseña().equals(contraseña)) {

            return empleados[i];

        }

    }

    return null;

}

    public boolean eliminar(String dni) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(dni)) {
                for (int j = i; j < cantidad - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                empleados[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    public Empleado[] listar() {
        return empleados;
    }

    public int getCantidad() {
        return cantidad;
    }
}
