package Resposta_2;

import java.util.Random;

public class Humano extends Raca{
    public static void main(String[] args) {
        int forca =+1, destreza=+1, constituicao=+1, inteligencia=+1, sabedoria=+1, carisma=+1;

        Random aleatorio = new Random();

        forca = aleatorio.nextInt(18 + 3);
        System.out.println(forca);
//        System.out.println(aleatorio.nextInt(18 + 3));
    }
}
