package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ParametrosInvalidosException;

public class Program {
    public static void main (String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        sc.close();
    }    

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois){
           throw new ParametrosInvalidosException(" O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++ ){
            System.out.println("Imprimindo número " + (i+1));
        }
    }
}
