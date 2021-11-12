package co.com.tcs.retotecnico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearArchivo {

    public void mostrarInformacion(Bebida[][] estanteria) {
        String bebidaAzucarada = "";
        String agua = "";

        for (int fila = 0; fila < estanteria.length; fila++) {
            for (int columna = 0; columna < estanteria[fila].length; columna++) {
                    try{
                        if (estanteria[fila][columna].toString().contains("BebidaAzucarada")) {

                            bebidaAzucarada += "ID: " + estanteria[fila][columna].getId() +
                                    ", Marca: " + estanteria[fila][columna].getMarca() +
                                    ", Precio: $ " + estanteria[fila][columna].getPrecio() +
                                    ", Litros: " + estanteria[fila][columna].getCantidadLitro() +
                                    ", Azúcar(%) : " + ((BebidaAzucarada)estanteria[fila][columna]).getPorcentajeAzucar() +
                                    ", Promoción: " + (((BebidaAzucarada)estanteria[fila][columna]).isTieneDescuento() + "\r\n");
                        }
                        else if (estanteria[fila][columna].toString().contains("Agua")){
                            agua+= "ID: " + estanteria[fila][columna].getId() +
                                    ", Marca: " + estanteria[fila][columna].getMarca() +
                                    ", Precio: $ " + estanteria[fila][columna].getPrecio() +
                                    ", Litros: " + estanteria[fila][columna].getCantidadLitro() +
                                    ", Origen : " + ((Agua)estanteria[fila][columna]).getOrigen() + "\r\n";
                        }
                    }
                    catch(Exception e){

                    }

            }

        }

        try {

            String ruta = "C:\\Users\\jeron\\IdeaProjects\\RetoTecnico\\informacionBebidas.txt" ;
            String contenido = bebidaAzucarada + agua;
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


