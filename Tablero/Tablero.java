package Tablero;
public class Tablero {
    public String nombre;
    public int Casillas=0;
    public int Turno = 0;
    public int Jugadores=0;
    public int Orden[] = {(0),(0),(0),(0)};
    Ficha Azul = new Ficha("Azul");
    Ficha Verde = new Ficha("Verde");
    Ficha Amarillo = new Ficha("Amarillo");
    Ficha Rojo = new Ficha("Rojo");
    
    public Tablero(String nombrejuego, int Numcasillas) {
        Casillas = Numcasillas;
        Turno = 0;
        nombre = nombrejuego;
        Orden[0] = 0;
        Orden[1] = 0;
        Orden[2] = 0;
        Orden[3] = 0;
        Jugadores = 4;
    }

    public boolean Turnos_Todos(){
        if (Turno == 0){
            System.out.println("Le toca al jugador Azul");
            Azul.avanzar();
            Turno = 1;
            if (Azul.posicion >= Casillas){
                System.out.println("El jugador Azul ha gando");
                return true;}
            else{
                return false;} 

        } else if (Turno == 4){
            System.out.println("Le toca al jugador Azul");
            Azul.avanzar();
            Turno = 1;
            if (Azul.posicion >= Casillas){
                System.out.println("El jugador Azul ha gando");
                return true;}
            else{
                return false;} 


        } else if (Turno == 1){
            System.out.println("Le toca al jugador Verde");
            Verde.avanzar();
            Turno = 2;
            if (Verde.posicion >= Casillas){
                System.out.println("El jugador Verde ha gando");
                return true;}
            else{
                return false;} 


        } else if (Turno == 2){
            System.out.println("Le toca al jugador Amarillo");
            Amarillo.avanzar();
            Turno = 3;
            if (Amarillo.posicion >= Casillas){
                System.out.println("El jugador Amarillo ha gando");
                return true;}
            else{
                return false;} 


        } else if (Turno == 3){
            System.out.println("Le toca al jugador Rojo");
            Rojo.avanzar();
            Turno = 4;
            if (Rojo.posicion >= Casillas){
                System.out.println("El jugador Rojo ha gando");
                return true;}
            else{
                return false;} 
        }
    return false;
    }


    public void Orden_Fichas(){
    Orden[0] = Azul.posicion;
    Orden[1] = Verde.posicion;
    Orden[2] = Amarillo.posicion;
    Orden[3] = Rojo.posicion;
    System.out.println(nombre);
    System.out.println("Cantidad de jugadores " + Jugadores);

    System.out.println("El Azul va en la casilla " + Orden[0]);
    System.out.println("El Verde va en la casilla " + Orden[1]);
    System.out.println("El Amarillo va en la casilla " + Orden[2]);
    System.out.println("El Rojo va en la casilla " + Orden[3]);
    }
}
