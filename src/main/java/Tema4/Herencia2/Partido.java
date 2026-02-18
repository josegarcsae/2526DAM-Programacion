package Tema4.Herencia2;

public class Partido {
    public static void main(String[] args) {

        Portero p = new Portero();
        p.cobrarNomina();
        p.sacarDePuerta();

        Jugador j = p;
        j.cobrarNomina();
        ((Portero) j).sacarDePuerta();

        Delantero d = new Delantero();
        d.cobrarNomina();
        d.meterGol();

        Jugador j2 = d;
        j2.cobrarNomina();
//        ((Portero) j2).sacarDePuerta();



    }

    public static void hazLoTuyo(Jugador j) {
        j.cobrarNomina();

        if (j instanceof Delantero){
            ((Delantero) j).meterGol();
        } else if (j instanceof Portero){
            ((Portero) j).sacarDePuerta();
        }
    }

}
