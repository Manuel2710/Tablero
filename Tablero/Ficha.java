package Tablero;
public class Ficha {
    String color;
    int posicion = 0;
    Dado dado = new Dado(6);
    int pasos = 0;
    
    public Ficha(String Color){
        color = Color;
        posicion = 0;
        pasos = 0;
    }

    public void avanzar(){
        pasos = dado.lanzar();
        posicion += pasos;
        pasos = 0;
        System.out.println("Avanzo a la posicion " + posicion);
    }
}
    