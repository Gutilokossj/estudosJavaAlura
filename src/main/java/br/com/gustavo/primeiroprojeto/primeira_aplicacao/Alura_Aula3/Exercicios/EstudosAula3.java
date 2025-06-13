package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula3.Exercicios;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class EstudosAula3 {
    public static void main(String[] args) {
        System.out.println("// ANOTACOES DE ESTUDO EM JAVA//");

        // Chamando os métodos dentro do main para que sejam executados
        exercicio1();
        jogoAdvinhacao(); //Professor do alura que fez
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        tabuada();
        exercicio6();
        exercicio7();
        exercicio8();
    }

    //Jogo de advinhação, que deve gerar um número aleatório entre 0 a 100, para o usuário
    //Advinhar e ele tem 5 tentativas, temos que informar se o número digitaro foi maior
    // ou menor que o número gerado!

    public static void exercicio1() {
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
            }
            if (tentativas < 5 && numeroDigitado < numeroAleatorio) {
                System.out.println("Opa, parece que o numero gerado e maior que: " + numeroDigitado + ", Tente novamente, você ainda tem " + tentativasRestantes + " tentativas!");
            }
            if (tentativas < 5 && numeroDigitado > numeroAleatorio) {
                System.out.println("Opa, parece que o numero gerado é menor que: " + numeroDigitado + ", Tente novamente, você ainda tem " + tentativasRestantes + " tentativas!");
            }
            if (tentativas == 5) {
                System.out.println("Você não conseguiu acetar o numero em 5 tentativas, o numero era: " + numeroAleatorio);
            }
        }
    }

    //Com WHILE seria assim (PROFESSOR QUE FEZ ESSA BAGAÇA

    public static void jogoAdvinhacao() {
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

    //IF e ELSE, pra dizer qual é positivo ou negativo!

    public static void exercicio2() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado >= 0) {
            System.out.println("Número positivo: " + numeroDigitado);
        } else {
            System.out.println("Número negativo: " + numeroDigitado);
        }
    }

    //Analisar e comparar dois números, se são iguais ou não e qual é maior no diferente!
    public static void exercicio3() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva dois número inteiros, vou comparar-los, pra ver se são iguais ou não e qual é maior!");
        System.out.println("Escreva o primeiro número inteiro: ");
        int numeroInteiro1 = leitura.nextInt();
        System.out.println("Escreva o segundo número inteiro: ");
        int numeroInteiro2 = leitura.nextInt();

        if (numeroInteiro1 == numeroInteiro2) {
            System.out.println("Eles sao iguais! " + "Primeiro: " + numeroInteiro1 + "| Segundo: " + numeroInteiro2);
        }

        if (numeroInteiro1 != numeroInteiro2) {
            if (numeroInteiro1 > numeroInteiro2) {
                System.out.println("Eles são diferentes e o primeiro: " + numeroInteiro1 + ", é maior que o segundo: " + numeroInteiro2);
            }
            if (numeroInteiro1 < numeroInteiro2) {
                System.out.println("Eles são diferentes e o segundo: " + numeroInteiro2 + ", é maior que o primeiro: " + numeroInteiro1);
            }
        }
    }

    //Sistema de opções, fiz com switch case, mas o professor usou while e if else mesmo

    public static void exercicio4() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("-----Menu-----");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int opcaoSelecionada = leitura.nextInt();

        switch (opcaoSelecionada) {
            case 1:
                System.out.println("Opção: 1 selecionada!");
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;

            case 2:
                System.out.println("Opção: 2 selecionada!");
                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                break;

            case 3:
                System.out.println("Programa encerrado!");
                break;

            default:
                System.out.println("Opção inválida, tente novamente!");
        }

    }

    //Sistema que calcule a tabuada do número de 1 a 10, feito por mim:
    public static void exercicio5() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um número: (vou exibir a tabuada do 10) ");
        int numeroDigitado = leitura.nextInt();

        System.out.println("Tabuada do número: ");
        System.out.println("x1: " + numeroDigitado);
        System.out.println("x2: " + numeroDigitado * 2);
        System.out.println("x3: " + numeroDigitado * 3);
        System.out.println("x4: " + numeroDigitado * 4);
        System.out.println("x5: " + numeroDigitado * 5);
        System.out.println("x6: " + numeroDigitado * 6);
        System.out.println("x7: " + numeroDigitado * 7);
        System.out.println("x8: " + numeroDigitado * 8);
        System.out.println("x9: " + numeroDigitado * 9);
        System.out.println("x10: " + numeroDigitado * 10);
    }

    //Professor fez de um jeito muito mais interessante e reutilizável:
    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void exercicio6() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: (Vou verificar se é par ou impar");
        int numeroDigitado = leitura.nextInt();

        //Verifica se o resto da divisã é = 0
        if (numeroDigitado % 2 == 0) {
            System.out.println("O número digitado: " + numeroDigitado + ", é par!");
        } else {
            System.out.println("O número digitado: " + numeroDigitado + ", é impar!");
        }
    }

    //ESSE AQUI EU COLOQUEI SÓ PRA ANOTAR, MAS NADA DE NOVO, APENAS UM FOR
    //Com alguns cálculos matemáticos que eu acho desnecessário na minha vida!!
    //O mais interessante é o fatorial *=i que seria tipo fatorial = fatorial * i

    public static void exercicio7() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digita um número: (Vou verifica o fatorial dele");
        int numeroDigitado = leitura.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitado; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroDigitado + " é: " + fatorial);
    }

        public static void exercicio8() {
            Scanner input = new Scanner(System.in);
            boolean deve = perguntar("Voce deve fazer isso?", input);
            if(deve) {
                responder(true);
            } else {
                boolean quer = perguntar("Voce quer fazer isso?", input);
                if(quer) {
                    boolean pode = perguntar("Voce pode fazer isso?", input);
                    responder(pode);
                } else {
                    responder(false);
                }
            }
        }

        private static boolean perguntar(String pergunta, Scanner scanner) {
            System.out.printf("%s (1 = SIM | 0 = NÃO)%n", pergunta);
            int resposta = scanner.nextInt();
            return resposta == 1;
        }

        private static void responder(boolean resposta) {
            if(resposta) {
                System.out.println("Sim, pode fazer isso...");
            } else {
                System.out.println("Não, não faça isso!");
            }
        }
    }