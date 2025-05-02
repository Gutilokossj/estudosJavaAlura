package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula3;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        //Geralmente usa o for quando tem um número fixo
        //While é usado em outros contextos!

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();

            if (nota >= 0) {
                mediaAvaliacao += nota; //Isso seria mediaAvaliacao = mediaAvaliacao + nota também, mesma coisa
                totalDeNotas++;
            }
        }

        System.out.println("Media de avaliacoes: " + mediaAvaliacao / totalDeNotas);
    }
}
