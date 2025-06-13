package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula4.Desafio;

import java.util.Scanner;

public class DesafioGus {
    public static void main(String[] args) {
        String nome = "Léozin brabo";
        String tipoConta = "Corrente";
        double saldo = 10000.50;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;
        Scanner opcaoSelecionada = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);

            // Validação de entrada:
            if (!opcaoSelecionada.hasNextInt()) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                opcaoSelecionada.next(); // Limpa o valor inválido
                continue; // Volta para o começo do laço
            }

            opcao = opcaoSelecionada.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Seu saldo atualizado é: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor você deseja transferir? ");
                    double valorTransferido = opcaoSelecionada.nextDouble();
                    if (valorTransferido > saldo){
                        System.out.println("Saldo insuficiente, você tem apenas: " + saldo);
                    } else {
                        saldo = saldo - valorTransferido;
                        System.out.println("Saldo transferido, seu saldo atualizado é: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Qual valor será depositado/recebido? ");
                    double valorRecebido = opcaoSelecionada.nextDouble();
                    if (valorRecebido <= 0){
                        System.out.println("Não é possível receber valor zerado ou negativo, tente novamente!");
                    } else {
                        saldo += valorRecebido;
                        System.out.println("Saldo recebido, seu saldo atualizado é: " + saldo);
                    }
                    break;
                default:
                    System.out.println("Desculpe, opção inválida, tente novamente por favor!");
                    break;
            }
        }
    }
}
