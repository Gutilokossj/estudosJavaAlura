package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula3.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class EstudosAula3 {
    public static void main(String[] args) {
        System.out.println("// ANOTACOES DE ESTUDO EM JAVA//");

        // Chamando os métodos dentro do main para que sejam executados
        //exercicio1();
        //jogoAdvinhacao(); //Professor do alura que fez
        exercicio2();
    }

    //Jogo de advinhação, que deve gerar um número aleatório entre 0 a 100, para o usuário
    //Advinhar e ele tem 5 tentativas, temos que informar se o número digitaro foi maior
    // ou menor que o número gerado!

    public static void exercicio1(){
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println("[DEBUG] Número gerado: " + numeroAleatorio);
        int numeroDigitado;
        System.out.println("Tente a sorte! qual foi o número gerado? entre 0 a 100 ");

        //Com FOR seria assim (fiz sozinho):

        for (int tentativas = 1; tentativas <= 5; tentativas++) {
            numeroDigitado = leitura.nextInt();
            int tentativasRestantes = 5 - tentativas;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabens, você acertou, o numero digitado foi: " + numeroDigitado + ", Você conseguiu com apenas: " + tentativas + " tentativas!");
                break;
            } if (tentativas < 5 && numeroDigitado < numeroAleatorio) {
                System.out.println("Opa, parece que o numero gerado e maior que: " + numeroDigitado + ", Tente novamente, você ainda tem " + tentativasRestantes + " tentativas!");
            } if (tentativas < 5 && numeroDigitado > numeroAleatorio) {
                System.out.println("Opa, parece que o numero gerado é menor que: " + numeroDigitado + ", Tente novamente, você ainda tem " + tentativasRestantes + " tentativas!");
            }

            if (tentativas == 5) {
                System.out.println("Você não conseguiu acetar o numero em 5 tentativas, o numero era: " + numeroAleatorio);
            }
        }
    }

    //Com WHILE seria assim (PROFESSOR QUE FEZ ESSA BAGAÇA

    public static void jogoAdvinhacao(){
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }

    public static void exercicio2(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado >= 0) {
            System.out.println("Número positivo: " + numeroDigitado);
        } else {
            System.out.println("Número negativo: " + numeroDigitado);
        }
    }
}
