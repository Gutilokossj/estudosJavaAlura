package br.com.gustavo.primeiroprojeto.prmeira_aplicacao.Alura_Aula2_primeira_aplicacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano do lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println("Media: " + media);
        String sinopse =
                """
                Filme Top Gun
                Filme de aventura com galâ dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //Fiz a conversão de double para int (int) - CASTING
        int classificacao= (int) (media/2);
        System.out.println(classificacao);
    }
}
