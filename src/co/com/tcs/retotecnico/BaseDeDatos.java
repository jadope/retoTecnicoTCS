package co.com.tcs.retotecnico;

public class BaseDeDatos {
    public static Bebida[][] poblarBaseDeDatos(){ // para que pueda ser accedido sin instanciarse. No tiene atributos. Buscarlo en
        BebidaAzucarada fanta1 = new BebidaAzucarada(3.5, 7000, "Fanta", 0.3, true);
        BebidaAzucarada fanta2 = new BebidaAzucarada(3.5, 7000, "Fanta", 0.3, true);
        BebidaAzucarada cocaCola1 = new BebidaAzucarada( 0.75, 2000, "Coca-Cola", 0.18, true );
        BebidaAzucarada cocaCola2 = new BebidaAzucarada( 0.75, 2000, "Coca-Cola", 0.18, true );
        BebidaAzucarada cocaCola3 = new BebidaAzucarada( 0.75, 2000, "Coca-Cola", 0.18, true );
        BebidaAzucarada cocaColaLight1 = new BebidaAzucarada( 0.75, 2000, "Coca-Cola", 0, false );
        BebidaAzucarada cocaColaLight2 = new BebidaAzucarada( 0.75, 2000, "Coca-Cola", 0, false );
        BebidaAzucarada sevenUp1 = new BebidaAzucarada( 1.5, 3500, "Seven Up", 0.1, false);
        BebidaAzucarada sevenUp2 = new BebidaAzucarada( 1.5, 3500, "Seven Up", 0.1, false);
        BebidaAzucarada canadaDry1 = new BebidaAzucarada( 1.5, 3200, "CandaDry", 0.2, true);
        BebidaAzucarada canadaDry2 = new BebidaAzucarada( 1.5, 3200, "CandaDry", 0.2, true);
        BebidaAzucarada pepsi1 = new BebidaAzucarada(2, 4000, "Pepsi", 0.15, true);
        BebidaAzucarada pepsi2 = new BebidaAzucarada(2, 4000, "Pepsi", 0.15, true);
        BebidaAzucarada mrTea1 = new BebidaAzucarada( 0.6, 2000, "Mr Tea", 0.3, false);
        BebidaAzucarada mrTea2 = new BebidaAzucarada( 0.6, 2000, "Mr Tea", 0.3, false);


        //Agua

        Agua cristal1 = new Agua( 1, 1500, "Cristal", "Oasis");
        Agua cristal2 = new Agua( 1, 1500, "Cristal", "Oasis");
        Agua brisa1 = new Agua(1, 1500, "Brisa", "Reserva");
        Agua brisa2 = new Agua(1, 1500, "Brisa", "Reserva");
        Agua manantial1 = new Agua( 1, 1500, "Manantial", "Manantial");
        Agua manantial2 = new Agua( 1, 1500, "Manantial", "Manantial");
        Agua oasis1 = new Agua( 1, 1500, "Oasis", "Reserva");
        Agua oasis2 = new Agua( 1, 1500, "Oasis", "Reserva");

        Bebida[][] estanteria = new Bebida[3][9];
        estanteria[0][0] = fanta1;
        estanteria[0][1] = pepsi1;
        estanteria[0][2] = cocaCola1;
        estanteria[0][3] = sevenUp1;
        estanteria[0][4] = cocaCola3;
        estanteria[0][5] = cocaColaLight1;
        estanteria[0][6] = mrTea1;
        estanteria[0][7] = sevenUp2;
        estanteria[0][8] = cristal1;
        estanteria[1][0] = canadaDry1;
        estanteria[1][1] = fanta2;
        estanteria[1][2] = cocaCola2;
        estanteria[1][3] = cocaColaLight2;
        estanteria[1][4] = mrTea2;
        estanteria[1][5] = oasis1;
        estanteria[1][6] = manantial2;
        estanteria[1][7] = cristal2;
        estanteria[1][8] = pepsi2;
        estanteria[2][0] = brisa1;
        estanteria[2][1] = canadaDry2;
        estanteria[2][2] = manantial1;
        estanteria[2][3] = oasis2;
        estanteria[2][4] = brisa2;

        return estanteria;

    }
}
