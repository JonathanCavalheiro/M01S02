package exercicioSwitch;

import java.util.Scanner;

public class ContaBancoPixTed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo;
        int opcaoMenu;

        System.out.println("Informe o saldo atual da conta:  ");
        saldo = input.nextDouble();
        System.out.println("--- Menu ---");
        System.out.println("1 - Saque ");
        System.out.println("2 - Depósito ");
        System.out.println("3 - Transferência ");
        opcaoMenu = input.nextInt();
        switch (opcaoMenu) {
            case 1:
                System.out.println("Informe o valor do saque: ");
                double saque = input.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                    break;
                } else {
                    double saqueEfetuado = saldo - saque;
                    System.out.println("Saque efetuado com sucesso, seu saldo agora é R$" + saqueEfetuado + "");
                    break;
                }
            case 2:
                System.out.println("Informe o valor do depósito: ");
                double deposito = input.nextDouble();
                double saldoMaisDeposito = saldo + deposito;
                System.out.println("Seu saldo era de R$" + saldo + " e agora é R$" + saldoMaisDeposito + "");
                break;
            case 3:
                System.out.println("1 - PIX");
                System.out.println("2 - TED");
                int transf = input.nextInt();
                switch (transf) {
                    case 1:
                        System.out.println("Informe o valor da transferência: ");
                        double valorTransf = input.nextDouble();
                        double taxaPix = 1.50;
                        double valorFinalPix = valorTransf + taxaPix;
                        if (valorFinalPix > saldo) {
                            System.out.println("Saldo insuficiente, valor total da transferencia com a taxa de R$"+taxaPix+" fica R$" +valorFinalPix+" e" +
                                    "seu saldo é de R$"+saldo);
                            break;
                        } else {
                            double valorAposPix = (saldo - valorTransf) - taxaPix;
                            System.out.println("Transfêrencia feita!! Foi descontado do saldo R$" + valorTransf + " mais R$" + taxaPix + " de taxa" +
                                    " e seu saldo atual ficou R$" + valorAposPix + "");
                            break;
                        }
                    case 2:
                        System.out.println("Informe o valor da transferência: ");
                        double valorTed = input.nextDouble();
                        double taxaTed = 9.80;
                        double valorfinal = (valorTed + taxaTed);
                            if (valorfinal > saldo){
                                System.out.println("Saldo insuficiente, valor total da transferencia com a taxa de" +
                                        " R$"+taxaTed+ " fica R$"+valorfinal + " e seu saldo é de R$"+saldo);
                            } else {
                                double valorAposTed = (saldo - valorTed) - taxaTed;
                                System.out.println("Transferencia feita!! Foi descontado do saldo R$"+valorTed+" mais R$"+taxaTed+" de taxa" +
                                        " e seu saldo atual ficou R$"+valorAposTed);
                            }


                }
        }

    }
}

