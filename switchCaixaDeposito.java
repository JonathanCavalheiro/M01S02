package exercicioSwitch;

import java.util.Scanner;

public class switchCaixaDeposito {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Saque \n2 - Dep�sito");
        int opcaoUsuario = input.nextInt();
        String OPCAO_INVALIDA = "Op��o Inv�lida";

        
        switch (opcaoUsuario) {
            case 1:
                System.out.println("Saque realizado!");
                 break;
            case 2:
                System.out.println("1 - Dep�sito pelo envelope \n2 - Dep�sito por dinheiro");
            int opcaoDeposito = input.nextInt();
        switch (opcaoDeposito) {
            case 1:
                System.out.println("Dep�sito envelope");
                break;
            case 2:
                System.out.println("Dep�sito por dinheiro");
                break;
            default:
                System.out.println(OPCAO_INVALIDA);
                break;


        }
        }
    }
}
