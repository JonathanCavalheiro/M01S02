package exercicioSwitch;

import java.util.Scanner;

public class switchCaixaDeposito {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Saque \n2 - Depósito");
        int opcaoUsuario = input.nextInt();
        String OPCAO_INVALIDA = "Opção Inválida";

        
        switch (opcaoUsuario) {
            case 1:
                System.out.println("Saque realizado!");
                 break;
            case 2:
                System.out.println("1 - Depósito pelo envelope \n2 - Depósito por dinheiro");
            int opcaoDeposito = input.nextInt();
        switch (opcaoDeposito) {
            case 1:
                System.out.println("Depósito envelope");
                break;
            case 2:
                System.out.println("Depósito por dinheiro");
                break;
            default:
                System.out.println(OPCAO_INVALIDA);
                break;


        }
        }
    }
}
