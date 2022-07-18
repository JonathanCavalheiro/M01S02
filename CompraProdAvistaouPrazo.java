package exercicioSwitch;

import java.util.Scanner;

public class CompraProdAvistaouPrazo {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

    double precoProd;
    int quantComprada;
    double desconto = 1.05;
    // desconto de 5% a compras acimda de 6 quantidades
    double descontoAvista = 1.03;
    // desconto aplicado a compra a vista 3%

    System.out.println("Informe a quantidade comprada do produto: ");
        quantComprada = input.nextInt();
    System.out.println("Informe o preço do produto: ");
      double precoFinal =  precoProd = input.nextDouble();
    if (quantComprada > 6) {
        precoFinal = (precoProd *  quantComprada) / desconto;
    } else if (quantComprada < 6){
        precoFinal = (precoProd * quantComprada);
    }
    System.out.println("1 - Á prazo\n2 - Á vista");
        int opcaoSelecionada = input.nextInt();

    switch (opcaoSelecionada){
        case 1:
            System.out.println("Em quantas parcelas você deseja dividir?");
            int quantidadeParcela = input.nextInt();
            double valorComParcela = precoFinal/ quantidadeParcela;
            System.out.println(String.format("Valor total da compra é R$"+ "%.2f", precoFinal)+"");
            System.out.println(String.format("Em "+quantidadeParcela+" parcelas de R$"+"%.2f",valorComParcela)+"");
            break;
        case 2:
            double precoAvista = precoFinal / descontoAvista;
            System.out.println(String.format("Valor total da compra á vista é R$" +"%.2f", +precoAvista)+"");
            break;

    }



    }
}
