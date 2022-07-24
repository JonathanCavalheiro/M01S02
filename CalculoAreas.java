package semana02Andre;

import java.util.Scanner;

public class CalculoAreas {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double valor1;
        double valor2;
        double areaTotal;
        int menu;

        System.out.println("--- Escolha de qual op��o voc� deseja calcular a �rea ---");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Ret�ngulo");
        System.out.println("3 - C�rculo");
        System.out.println("4 - Trap�zio");
        menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Informe o tamanho da base do quadrado: ");
                valor1 = input.nextDouble();
                System.out.println("Informe o tamanho da altura do quadrado: ");
                valor2 = input.nextDouble();
                areaTotal = valor1 *  valor2;
                System.out.println("A �rea total do quadrado � "+areaTotal);
                break;

            case 2:
                System.out.println("Informe o tamanho da base do ret�ngulo: ");
                valor1 = input.nextDouble();
                System.out.println("Informe o tamanho da altura do ret�ngulo: ");
                valor2 = input.nextDouble();
                areaTotal = valor1 *  valor2;
                System.out.println("A �rea total do ret�ngulo � "+areaTotal);
                break;

            case 3:
                System.out.println("Informe o tamanho do raio do c�rculo: ");
                valor1 = input.nextDouble();
                double valorPi = 3.14;
                areaTotal = valorPi * (valor1*valor1);
                System.out.println("A �rea total do c�rculo � "+areaTotal);
                break;

            case 4:
                System.out.println("Informe o tamanho da base maior do trap�zio: ");
                valor1 = input.nextDouble();
                System.out.println("Informe o tamanho da base menor do trap�zio: ");
                valor2 = input.nextDouble();
                System.out.println("Informe o tamanho da altura do trap�zio: ");
                double alturaTrap = input.nextDouble();
                areaTotal = ((valor1 + valor2)*alturaTrap)/2;
                System.out.println("A �rea total do ret�ngulo � "+areaTotal);
                break;
        }

    }
}
