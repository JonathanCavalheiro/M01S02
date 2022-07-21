import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double dolar = 5.24;
        double euro = 5.53;
        double libra = 6.42;
        double pesoArg = 0.04;

    System.out.println("Informe o valor em reais que será levado para a viagem: ");
         double dinheiroViagem = input.nextDouble();

         System.out.print("---- Escolha o tipo de moeda para conversão----\n");
         System.out.print("1 - Dólar\n");
         System.out.print("2 - Euro\n");
         System.out.print("3 - Libra\n");
         System.out.print("4 - Peso Argentino\n");

         int opcao = input.nextInt();

         switch (opcao){
             case 1:
                 double realxdolar = dinheiroViagem / dolar;
                 System.out.println(String.format("Os seus " + dinheiroViagem + " reais convertidos em dólares será "+"%.2f", realxdolar) + "$");
                 break;

             case 2:
                 double realxeuro = dinheiroViagem / euro;
                 System.out.println(String.format("Os seus " + dinheiroViagem + " reais convertidos em euros será "+"%.2f", realxeuro) + "£");
                 break;

             case 3:
                 double realxlibra = dinheiroViagem / libra;
                 System.out.println(String.format("Os seus " + dinheiroViagem + " reais convertidos em libras será "+"%.2f", realxlibra) + "£");
                 break;

             case 4:
                 double realxpesoArgen = dinheiroViagem / pesoArg;
                 System.out.println(String.format("Os seus " + dinheiroViagem + " reais convertidos em pesos será "+"%.2f",realxpesoArgen) + " pesos");
                 break;

         }

    }

}