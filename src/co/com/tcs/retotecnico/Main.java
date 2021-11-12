package co.com.tcs.retotecnico;

import static co.com.tcs.retotecnico.BaseDeDatos.poblarBaseDeDatos;

public class Main {

    public static void main(String[] args) {

        Bebida[][] estanteria = poblarBaseDeDatos();

        Almacen almacen = new Almacen(estanteria);
        CrearArchivo archivo = new CrearArchivo();

        /*almacen.calcularPrecioTotal();
        almacen.calcularPrecioTotalMarca("Fanta");
        almacen.calcularPrecioEstanteria(2);
        almacen.agregarBebida(estanteria);


         */

        for (int fila = 0; fila <estanteria.length ; fila++) {
            for (int columna = 0; columna < estanteria[fila].length ; columna++) {
                try{
                    System.out.println(estanteria[fila][columna]);
                }
                catch(Exception e){

                }
            }
        }


        //almacen.eliminarProducto(estanteria, 222);

        archivo.mostrarInformacion(estanteria);



    }

}
