package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula3.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class EstudosAula3 {
    public static void main(String[] args) {
        System.out.println("// ANOTACOES DE ESTUDO EM JAVA//");

        // Chamando os métodos dentro do main para que sejam executados
        exercicio1();
    }
    //Jogo de advinhação, que deve gerar um número aleatório entre 0 a 100, para o usuário
    //Advinhar e ele tem 5 tentativas, temos que informar se o número digitaro foi maior
    // ou menor que o número gerado!

    public static void exercicio1(){
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDigitado = 0;

        //Com FOR seria assim (fiz sozinho):

        for (int tentativas = 1; tentativas <= 5; tentativas++) {
            System.out.println("Tente a sorte! qual foi o número gerado? entre 0 a 100 ");
            numeroDigitado = leitura.nextInt();
            int tentativasRestantes = 5 - tentativas;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabens, você acertou, o numero digitado foi: " + numeroDigitado + ", Você conseguiu com apenas:" + tentativasRestantes + " tentativas!");
                break;
            } if (numeroDigitado < numeroAleatorio) {
                System.out.println("Opa, parece que o numero digitado e menor que: " + numeroDigitado + ", Tente novamente, você ainda tem " + tentativasRestantes + " tentativas!");
            } if (numeroDigitado > numeroAleatorio) {
                System.out.println("Opa, parece que o numero digitado e maior que: " + numeroDigitado + ", Tente novamente, você ainda tem " + tentativasRestantes + " tentativas!");
            }

            if (tentativas == 5) {
                System.out.println("Você não conseguiu acetar o numero em 5 tentativas, o numero era: " + numeroAleatorio);
            }
        }
    }
}
