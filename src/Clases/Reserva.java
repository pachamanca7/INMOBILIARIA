/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author CRISTHOFER
 */
public class Reserva {
    private Cliente cliente;
    private Departamento departamento;
    private double montoSeparacion;
    private String fechaReserva;
    private String fechaVencimiento;

    public Reserva(Cliente cliente, Departamento departamento,
            double montoSeparacion,
            String fechaReserva,
            String fechaVencimiento) {

        this.cliente = cliente;
        this.departamento = departamento;
        this.montoSeparacion = montoSeparacion;
        this.fechaReserva = fechaReserva;
        this.fechaVencimiento = fechaVencimiento;

        //departamento.setEstado("Reservado");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getMontoSeparacion() {
        return montoSeparacion;
    }

    public void setMontoSeparacion(double montoSeparacion) {
        this.montoSeparacion = montoSeparacion;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String obtenerDatos() {

        return "Cliente: " + cliente.getNombres()
                + " " + cliente.getApellidos()
                + "\nDepartamento: " + departamento.getCodigo()
                + "\nMonto separación: S/ " + montoSeparacion
                + "\nFecha reserva: " + fechaReserva
                + "\nFecha vencimiento: " + fechaVencimiento;

    }
}
