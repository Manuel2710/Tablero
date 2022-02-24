package Tablero;


public class PruebaTablero {
    
    public static void main (String[] args){

        boolean ganador = false;
        Tablero tablero = new Tablero("Monopoly", 15);

        while (ganador == false){
        ganador = tablero.Turnos_Todos();
        tablero.Orden_Fichas();
        }
        System.out.println("Fin del juego");
    }
}
