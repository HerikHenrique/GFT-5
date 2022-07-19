package Resposta_2;

import java.util.Scanner;

public class DD {
    public static void main(String[] args) {

        Raca raca = new Raca();

        Scanner sc = new Scanner(System.in);
        int escolhaPersonagem = sc.nextInt();
        System.out.println("Escolha a Raça do Seu Personagem?");
        System.out.println("Digite: 1 para o Anão \n Digite: 2 para Elfo \n Digite: 3 para Humanos");

        switch (escolhaPersonagem){
            case 1:
                System.out.println("Anão foi escolhido!");
                break;
            case 2:
                System.out.println("Elfo foi escolhido!");
                break;
            case 3:
                System.out.println("Humano foi escolhido!");
                break;
            default:
                System.out.println("Escolha a Raça de seu personagem");
        }
        System.out.println("Você tem 20 pontos para distribuir entre seus atributos");



    }
}
