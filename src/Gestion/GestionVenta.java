/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Clases.Venta;
/**
 *
 * @author CRISTHOFER
 */
public class GestionVenta {
    private Venta ventas[];
    private int cantidad;

    public GestionVenta() {

        ventas = new Venta[300];
        cantidad = 0;

    }

    public boolean registrar(Venta venta) {

        if (cantidad < ventas.length &&
        venta.getReserva().getDepartamento().getEstado().equalsIgnoreCase("Reservado")) {

        venta.getReserva().getDepartamento().setEstado("Vendido");

        ventas[cantidad] = venta;

        cantidad++;

        return true;

    }

    return false;

    }

    public Venta buscar(String codigoDepartamento) {

        for (int i = 0; i < cantidad; i++) {

            if (ventas[i].getReserva().getDepartamento().getCodigo().equalsIgnoreCase(codigoDepartamento)) {

                return ventas[i];

            }

        }

        return null;

    }
    
    public boolean actualizar(Venta venta) {

    for (int i = 0; i < cantidad; i++) {

        if (ventas[i].getReserva().getDepartamento().getCodigo()
                .equals(venta.getReserva().getDepartamento().getCodigo())) {

            ventas[i] = venta;

            return true;

        }

    }

    return false;

}

    public String listar() {

        String lista = "";

    for (int i = 0; i < cantidad; i++) {

        lista += ventas[i].obtenerDatos() + "\n\n";

    }

    return lista;

    }
    
    public double calcularIngresosTotales() {

    double total = 0;

    for (int i = 0; i < cantidad; i++) {

        total += ventas[i].getPrecioTotal();

    }

    return total;

}

    public int getCantidad() {

        return cantidad;

    }
}
