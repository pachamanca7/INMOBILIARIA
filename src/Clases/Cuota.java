/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author CRISTHOFER
 */
public class Cuota {
    
    private int numeroCuota;
    private double monto;
    private String fechaVencimiento;
    private double saldoPendiente;

    public Cuota(int numeroCuota,
            double monto,
            String fechaVencimiento) {

        this.numeroCuota = numeroCuota;
        this.monto = monto;
        this.fechaVencimiento = fechaVencimiento;
        this.saldoPendiente = monto;

    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public void registrarPago(double pago) {

        saldoPendiente = saldoPendiente - pago;

        if (saldoPendiente < 0) {
            saldoPendiente = 0;
        }

    }

    public String obtenerDatos() {

        return "Cuota N° " + numeroCuota
                + "\nMonto: S/ " + monto
                + "\nSaldo pendiente: S/ " + saldoPendiente
                + "\nVencimiento: " + fechaVencimiento;

    }
}
