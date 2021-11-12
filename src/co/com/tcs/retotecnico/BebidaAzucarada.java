package co.com.tcs.retotecnico;

public class BebidaAzucarada extends Bebida{

    private double porcentajeAzucar;
    private boolean tieneDescuento;

    public BebidaAzucarada(double cantidadLitro, double precio, String marca, double porcentajeAzucar, boolean tieneDescuento) {
        super(cantidadLitro, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.tieneDescuento = tieneDescuento;
        descuento();
    }
    public BebidaAzucarada(int id, double cantidadLitro, double precio, String marca, double porcentajeAzucar, boolean tieneDescuento) {
        super(id, cantidadLitro, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.tieneDescuento = tieneDescuento;
        descuento();
    }


    public void descuento(){
        if(tieneDescuento){
            super.setPrecio(getPrecio()*0.9);
        }
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }
}
