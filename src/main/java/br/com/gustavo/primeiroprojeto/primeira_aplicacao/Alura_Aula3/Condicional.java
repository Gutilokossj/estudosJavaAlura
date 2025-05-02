package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula3;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }
            //Poderia ser apenas if(incluidoNoPLano) no Java ele entende como verdadeiro e falso seria if(!incluidoNoPlano) pra negar
            //Ou seja ! seria o "Não" incluidoNoPçano, o false.
            //Pra string como tipoPlano, tem que usar o .equais primeiro! boa prática!
            //Se fosse o "E" seria &&, mas como é "ou" pode ser ||

            //Uma alternativa ao if/else é o switch case, que é uma estrutura
            // de controle de fluxo que permite executar diferentes ações com base no valor de uma expressão.

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
