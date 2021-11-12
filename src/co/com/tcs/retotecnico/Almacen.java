package co.com.tcs.retotecnico;

import java.util.Scanner;

public class Almacen{
    private Bebida[][] estanteria;

    public Almacen(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }

    public double calcularPrecioTotal(){
        double precioTotal = 0;
        for (int fila = 0; fila <estanteria.length ; fila++) {
            for (int columna = 0; columna < estanteria[fila].length ; columna++) {
                try{
                    precioTotal += estanteria[fila][columna].getPrecio();
                }
                catch(Exception e){
                }
            }
        }
        System.out.println("El precio total de todos los productos es " + precioTotal);
        return precioTotal;
    }

    public double calcularPrecioTotalMarca(String nombreMarca){
        double precioTotalMarca = 0;
        for (int fila = 0; fila <estanteria.length ; fila++) {
            for (int columna = 0; columna < estanteria[fila].length ; columna++) {
                try{
                    if(estanteria[fila][columna].getMarca().equals(nombreMarca)){
                        precioTotalMarca+= estanteria[fila][columna].getPrecio();
                    }
                }
                catch(Exception e){
                }
            }
        }
        System.out.println("El precio total de la marca " +nombreMarca+ " es: "+precioTotalMarca);
        return precioTotalMarca;
    }

    public double calcularPrecioEstanteria(int numeroEstanteria){
        double precioTotalEstanteria = 0;
        for (int i = 0; i < estanteria[numeroEstanteria].length; i++) {
            try{
                precioTotalEstanteria+=estanteria[numeroEstanteria][i].getPrecio();
            }
            catch (Exception e){
            }
        }
        System.out.println("El precio total de la columna #" + numeroEstanteria + " de la estantería es: " + precioTotalEstanteria);
        return precioTotalEstanteria;
    }

    public void agregarBebida(Bebida[][] estanteria){
        System.out.println("¿Qué tipo de bebida desea agregar?");
        System.out.println("Marque 1 para Bebida azucarada, 2 para Agua y cualquier otro valor para salir.");
        Scanner consola = new Scanner(System.in);
        String tipoBebida = consola.nextLine();
        if(tipoBebida.equals("1")){
            agregarBebidaAzucarada(estanteria);
        }else if(tipoBebida.equals("2")) {
            agregarAgua(estanteria);
        }else {
            return;
        }
    }

    private Bebida[][] agregarBebidaAzucarada(Bebida[][] estanteria){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el ID del producto");
        String idString = consola.nextLine();
        int id = Integer.parseInt(idString);
        boolean existeId = verificarSiExisteId(estanteria, id);

        if (existeId){
            System.out.println("El ID que ingresó ya existe, ingrese un ID diferente por favor.");
            existeId = false;
            agregarBebidaAzucarada(estanteria);
            return null;
        }

        System.out.println("Ingrese la cantidad de litros que tiene el producto: ");
        String litroString = consola.nextLine();
        Double litro = Double.parseDouble(litroString);
        System.out.println("Ingrese el precio del producto: ");
        String precioString = consola.nextLine();
        Double precio = Double.parseDouble(precioString);
        System.out.println("Ingrese el nombre de la marca del producto: ");
        String marca = consola.nextLine();
        System.out.println("Ingrese el porcentaje de azúcar del producto: ");
        String porcentajeAzucarString = consola.nextLine();
        Double porcentajeAzucar = Double.parseDouble(porcentajeAzucarString);
        System.out.println("Ingrese 'si' si el producto tiene descuento, cualquier otro valor para no.");
        String tieneDescuentoString = consola.nextLine();
        boolean tieneDescuento = false;
        if (tieneDescuentoString.toLowerCase().equals("si")) tieneDescuento = true;

        BebidaAzucarada nuevaBebida = new BebidaAzucarada(id, litro, precio,marca, porcentajeAzucar,tieneDescuento);

        boolean estanteriaLlena = true;

        for (int fila = 0; fila < estanteria.length; fila++) {
            for (int columna = 0; columna < estanteria[fila].length; columna++) {
                if (estanteria[fila][columna]==null && estanteriaLlena) {
                    estanteria[fila][columna] = nuevaBebida;
                    estanteriaLlena = false;
                }
            }
        }

        if(estanteriaLlena) {
            System.out.println("La estantería está llena, tienes que eliminar un producto antes de ingresar otro.");
        }

        return estanteria;
    }

    private Bebida[][] agregarAgua(Bebida[][] estanteria){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el ID del producto: ");
        String idString = consola.nextLine();
        int id = Integer.parseInt(idString);
        boolean existeId = verificarSiExisteId(estanteria, id);

        if (existeId){
            System.out.println("El ID que ingresó ya existe, ingrese un ID diferente por favor.");
            existeId = false;
            agregarAgua(estanteria);
            return null;
        }
        System.out.println("Ingrese la cantidad de litros que tiene el producto: ");
        String litroString = consola.nextLine();
        Double litro = Double.parseDouble(litroString);
        System.out.println("Ingrese el precio del producto: ");
        String precioString = consola.nextLine();
        Double precio = Double.parseDouble(precioString);
        System.out.println("Ingrese el nombre de la marca del producto: ");
        String marca = consola.nextLine();
        System.out.println("Ingrese el origen del agua mineral (manantial, oasis o reserva): ");
        String origen = consola.nextLine();

        Agua nuevaBebida = new Agua(id, litro, precio,marca, origen);

        boolean estanteriaLlena = true;

        for (int fila = 0; fila < estanteria.length; fila++) {
            for (int columna = 0; columna < estanteria[fila].length; columna++) {
                if (estanteria[fila][columna]==null && estanteriaLlena) {
                    estanteria[fila][columna] = nuevaBebida;
                    estanteriaLlena = false;
                }
            }
        }

        if(estanteriaLlena) {
            System.out.println("La estantería está llena, tienes que eliminar un producto antes de ingresar otro.");
        }

        return estanteria;
    }

    public void eliminarProducto(Bebida[][] estanteria, int id){
        for (int fila = 0; fila < estanteria.length; fila++) {
            for (int columna = 0; columna < estanteria[fila].length; columna++) {
                try{
                    if (estanteria[fila][columna].getId()==id) {
                        estanteria[fila][columna] = null;
                        System.out.println("Se borró exitosamente el producto que tenía la ID: " + id);
                    }
                }
                catch(Exception e){

                }
            }
        }
    }


    private boolean verificarSiExisteId(Bebida[][] estanteria, int id){
        boolean existeId = false;

        for (int fila = 0; fila < estanteria.length; fila++) {
            for (int columna = 0; columna < estanteria[fila].length; columna++) {
                try{
                    if (estanteria[fila][columna].getId() == id) {
                        existeId = true;
                    }
                }
                catch(Exception e){
                }
            }
        }
        return existeId;
    }



    public Bebida[][] getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }

}
