package lista1exercicio4;

import java.util.Scanner;

public class Lista1Exercicio4 {

    public static void main(String[] args) {
        
        System.out.println("Programa para exibir qual o valor final do produto a ser pago.");
        
        float PAG, PR, D, VD;
        
        System.out.println("Digite o valor do produto");
        Scanner teclado = new Scanner(System.in);
        PR = teclado.nextFloat();
        System.out.println("Digite o desconto a ser aplicado em porcentagem. EX: 0,10");
        D = teclado.nextFloat();
        
        VD = (PR * D);
        PAG = (PR - VD);
        
        System.out.println("O valor do desconto foi de: "+VD);
        System.out.println("O valor final a ser pago foi de: "+PAG);
        
        
        
        
        
        
        
        
    }
    
}
