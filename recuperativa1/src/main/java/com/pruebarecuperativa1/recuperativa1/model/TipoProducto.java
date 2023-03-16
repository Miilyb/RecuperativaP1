package com.pruebarecuperativa1.recuperativa1.model;

public class TipoProducto extends Producto{
    public String nombreCategoria;

    public TipoProducto() {
        super();
    }

    public TipoProducto(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public TipoProducto(String nombreProducto, Integer precioVenta, Integer precioCompra, Integer ganancia,
            String nombreCategoria) {
        super(nombreProducto, precioVenta, precioCompra, ganancia);
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return super.toString() +  "TipoProducto [nombreCategoria=" + nombreCategoria + "]";
    }

    






    
    
}
