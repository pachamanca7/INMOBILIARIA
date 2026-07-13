/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author CRISTHOFER
 */
public class Venta {
    private Reserva reserva;
    private String modalidadPago;
    private double precioTotal;

    private double cuotaInicial;
    private int numeroCuotas;
    private double montoCuota;

    public Venta(Reserva reserva,
            String modalidadPago,
            double precioTotal) {

        this.reserva = reserva;
        this.modalidadPago = modalidadPago;
        this.precioTotal = precioTotal;

        //reserva.getDepartamento().setEstado("Vendido");

    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getModalidadPago() {
        return modalidadPago;
    }

    public void setModalidadPago(String modalidadPago) {
        this.modalidadPago = modalidadPago;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getCuotaInicial() {
        return cuotaInicial;
    }

    public void setCuotaInicial(double cuotaInicial) {
        this.cuotaInicial = cuotaInicial;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public String obtenerDatos() {

        return "Cliente: "
                + reserva.getCliente().getNombres()
                + " "
                + reserva.getCliente().getApellidos()
                + "\nDepartamento: "
                + reserva.getDepartamento().getCodigo()
                + "\nModalidad: "
                + modalidadPago
                + "\nPrecio total: S/ "
                + precioTotal;

    }
}
