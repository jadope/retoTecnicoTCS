package co.com.tcs.retotecnico;

public class Agua extends Bebida{

    public String origen;

    public Agua(double cantidadLitro, double precio, String marca, String origen) {
        super(cantidadLitro, precio, marca);
        this.origen = origen;
    }
    public Agua(int id, double cantidadLitro, double precio, String marca, String origen) {
        super(id, cantidadLitro, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
