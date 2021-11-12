package co.com.tcs.retotecnico;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Bebida {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private double cantidadLitro;
    private double precio;
    private String marca;

    public Bebida(double cantidadLitro, double precio, String marca) {
        this.id = count.incrementAndGet();
        this.cantidadLitro = cantidadLitro;
        this.precio = precio;
        this.marca = marca;
    }

    public Bebida(int id, double cantidadLitro, double precio, String marca) {
        this.id = id;
        this.cantidadLitro = cantidadLitro;
        this.precio = precio;
        this.marca = marca;
    }



    public int calcularPrecioTotal(){

        /*Almacen almacen = new Almacen();

        for (int i = 0; i < Almacen.getEstanteria().length; i++) {

        }

         */
        return 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidadLitro() {
        return cantidadLitro;
    }

    public void setCantidadLitro(double cantidadLitro) {
        this.cantidadLitro = cantidadLitro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
