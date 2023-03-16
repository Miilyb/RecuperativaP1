package com.pruebarecuperativa1.recuperativa1.model;



public class Producto {
    public String nombreProducto;
    public Integer precioVenta;
    public Integer precioCompra;
    public Integer ganancia;

/* Constructores */
    public Producto() {
    }

    public Producto(String nombreProducto, Integer precioVenta, Integer precioCompra, Integer ganancia) {
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.ganancia = ganancia;
    }

     /*Getters y Setters */
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getGanancia() {
        return ganancia;
    }

    public void setGanancia(Integer ganancia) {
        this.ganancia = ganancia;
    }

        /*ToString */
    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", precioVenta=" + precioVenta + ", precioCompra="
                + precioCompra + ", ganancia=" + ganancia + "]";
    }

}
