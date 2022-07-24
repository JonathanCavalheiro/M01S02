package semana02Andre;

import java.util.Scanner;

public class CalculoAreas {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double valor1;
        double valor2;
        double areaTotal;
        int menu;

        System.out.println("--- Escolha de qual opção você deseja calcular a área ---");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Círculo");
        System.out.println("4 - Trapézio");
        menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Informe o tamanho da base do quadrado: ");
                valor1 = input.nextDouble();
                System.out.println("Informe o tamanho da altura do quadrado: ");
                valor2 = input.nextDouble();
                areaTotal = valor1 *  valor2;
                System.out.println("A área total do quadrado é "+areaTotal);
                break;

            case 2:
                System.out.println("Informe o tamanho da base do retângulo: ");
                valor1 = input.nextDouble();
                System.out.println("Informe o tamanho da altura do retângulo: ");
                valor2 = input.nextDouble();
                areaTotal = valor1 *  valor2;
                System.out.println("A área total do retângulo é "+areaTotal);
                break;

            case 3:
                System.out.println("Informe o tamanho do raio do círculo: ");
                valor1 = input.nextDouble();
                double valorPi = 3.14;
                areaTotal = valorPi * (valor1*valor1);
                System.out.println("A área total do círculo é "+areaTotal);
                break;

            case 4:
                System.out.println("Informe o tamanho da base maior do trapézio: ");
                valor1 = input.nextDouble();
                System.out.println("Informe o tamanho da base menor do trapézio: ");
                valor2 = input.nextDouble();
                System.out.println("Informe o tamanho da altura do trapézio: ");
                double alturaTrap = input.nextDouble();
                areaTotal = ((valor1 + valor2)*alturaTrap)/2;
                System.out.println("A área total do retângulo é "+areaTotal);
                break;
        }

    }
}
