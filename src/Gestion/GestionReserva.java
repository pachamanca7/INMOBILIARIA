/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Reserva;
/**
 *
 * @author CRISTHOFER
 */
public class GestionReserva {
     private Reserva reservas[];
    private int cantidad;

    public GestionReserva() {

        reservas = new Reserva[200];
        cantidad = 0;

    }

    public boolean registrar(Reserva reserva) {

        String estado = reserva.getDepartamento().getEstado();

        if (estado.equalsIgnoreCase("Disponible")) {

            reserva.getDepartamento().setEstado("Reservado");

            reservas[cantidad] = reserva;

            cantidad++;

            return true;

        }

        return false;

    }

    public Reserva buscar(String codigoDepartamento) {

        for (int i = 0; i < cantidad; i++) {

            if (reservas[i].getDepartamento().getCodigo().equalsIgnoreCase(codigoDepartamento)) {

                return reservas[i];

            }

        }

        return null;

    }
    
    public boolean actualizar(Reserva reserva) {

    for (int i = 0; i < cantidad; i++) {

        if (reservas[i].getDepartamento().getCodigo()
                .equals(reserva.getDepartamento().getCodigo())) {

            reservas[i] = reserva;

            return true;

        }

    }

    return false;

}

    public boolean eliminar(String codigoDepartamento) {

        for (int i = 0; i < cantidad; i++) {

            if (reservas[i].getDepartamento().getCodigo().equalsIgnoreCase(codigoDepartamento)) {

                reservas[i].getDepartamento().setEstado("Disponible");

                for (int j = i; j < cantidad - 1; j++) {

                    reservas[j] = reservas[j + 1];

                }

                reservas[cantidad - 1] = null;

                cantidad--;

                return true;

            }

        }

        return false;

    }

    public String listar() {

        String lista = "";

    for (int i = 0; i < cantidad; i++) {

        lista += reservas[i].obtenerDatos() + "\n\n";

    }

    return lista;

    }

    public int getCantidad() {

        return cantidad;

    }
    
    public Reserva getReserva(int posicion) {

    if (posicion >= 0 && posicion < cantidad) {

        return reservas[posicion];

    }

    return null;

}
}
