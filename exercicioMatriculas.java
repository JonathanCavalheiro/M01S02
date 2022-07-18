import java.util.Scanner;

public class exercicioMatriculas {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        String turma1 = " turma 1, para maiores de 7 anos.";
        String turma2 = "turma 2, para maiores de 8 anos.";
        String turma3 = "turma 3, para maiores de 9 anos.";
        String turma4 = "turma 4, para maiores de 10 anos.";
        String turma5 = "turma 5, para maiores de 11 anos.";
        String turma6 = "turma 6, para maiores de 12 anos.";
        String turma7 = "turma 7, para maiores de 13 anos.";
        String turma8 = "turma 8, para maiores de 14 anos.";

    System.out.println("Insira o nome do aluno: ");
        nome = input.next();

    System.out.println("Insira a idade do aluno: ");
        idade = input.nextInt();

    if (idade <= 8) {
       System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma1+ "");
    } if (idade == 9) {
        System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma2+ "");
    } if (idade == 10) {
        System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma3+ "");
        }
      if (idade == 11) {
            System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma4+ "");
        }
      if (idade == 12) {
            System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma5+ "");
        }
      if (idade == 13) {
            System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma6+ "");
        }
        if (idade == 14) {
            System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma7+ "");
        }
        if (idade >= 15) {
            System.out.println("Nome do aluno(a) é " + nome + " com idade de " + idade+ " anos e sua turma séra "+ turma8+ "");
        }
    }
}
