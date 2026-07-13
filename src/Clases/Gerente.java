/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author CRISTHOFER
 */
public class Gerente extends Empleado {
    public Gerente(String dni,
            String nombres,
            String apellidos,
            String usuario,
            String contraseña) {

        super(dni, nombres, apellidos,
                usuario, contraseña,
                "Gerente");

    }

    @Override
    public String obtenerDatos() {

        return super.obtenerDatos() +
                "\nCargo: Gerente";

    }
}
