/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principales;
import Formularios.FrmLogin;
import Datos.DatosSistemas;
/**
 *
 * @author CRISTHOFER
 */
public class Principal {
    public static void main(String[] args) {
        
        DatosSistemas.gestionEmpleado.cargarEmpleadosIniciales();

        FrmLogin login = new FrmLogin();

        login.setLocationRelativeTo(null);

        login.setVisible(true);

    }
}
