/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author CRISTHOFER
 */
public class Departamento {
    private String codigo;
    private int piso;
    private String numeroDepartamento;
    private double area;
    private int dormitorios;
    private int baños;
    private String tipo;
    private double precioBase;
    private String estado;
    private Proyecto proyecto;

    public Departamento(String codigo, int piso,
            String numeroDepartamento,
            double area,
            int dormitorios,
            int baños,
            String tipo,
            double precioBase,
            String estado,
            Proyecto proyecto) {

        this.codigo = codigo;
        this.piso = piso;
        this.numeroDepartamento = numeroDepartamento;
        this.area = area;
        this.dormitorios = dormitorios;
        this.baños = baños;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estado = estado;
        this.proyecto = proyecto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String obtenerDatos() {

        return "Código: " + codigo
                + "\nProyecto: " + proyecto.getNombreProyecto()
                + "\nPiso: " + piso
                + "\nDepartamento: " + numeroDepartamento
                + "\nÁrea: " + area + " m²"
                + "\nDormitorios: " + dormitorios
                + "\nBaños: " + baños
                + "\nTipo: " + tipo
                + "\nPrecio: S/ " + precioBase
                + "\nEstado: " + estado;

    }
}
