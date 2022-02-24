package Tablero;

import java.util.Random;

public class Dado {
    int caras = 0;
    int valor = 0;
    Random rand = new Random();

    public Dado(int numCaras){
        caras = numCaras;
        valor = 0;
    }
    public int lanzar(){
        valor = rand.nextInt(caras+1);
        if (valor == 0){
            return 1;
        }
        else{
            return valor;
        }
    }
}
