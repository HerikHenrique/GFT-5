package Resposta_1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        int I = 1; int V = 5; int X = 10; int L = 50; int C = 100; int D = 500; int M = 1000;

        Scanner leia = new Scanner(System.in);
        int valor, numero;
        int sobra = 0;
        String roma = "";
        String[] r={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] i={1,4,5,9,10,40,50,90,100,400,500,900,1000};

        System.out.print("Digite um Numero entre 1 e 3999:");
        valor = leia.nextInt();

        numero= valor;

        if (valor < 4000) {
            for(int cont=12;cont>-1;cont--){
                while (valor>=i[cont]){
                    roma += r[cont];
                    valor -= i[cont];
                }

            }
            System.out.println("O Algarismo Romano correspondente a " + numero + " é: " + roma);
        } else {
            System.out.print("Valor Inválido!");
        } //fim do else

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    }
}
