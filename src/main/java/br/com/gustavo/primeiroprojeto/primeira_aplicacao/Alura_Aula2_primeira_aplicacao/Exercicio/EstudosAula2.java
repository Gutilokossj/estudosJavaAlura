package br.com.gustavo.primeiroprojeto.primeira_aplicacao.Alura_Aula2_primeira_aplicacao.Exercicio;

public class EstudosAula2 {
    public static void main(String[] args) {
        System.out.println("// ANOTACOES DE ESTUDO EM JAVA//");

        // Chamando os métodos dentro do main para que sejam executados
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
    }
    //Aprendendo e praticando concatenação
    public static void exercicio1(){
        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
    }

    //CONSIDERAR QUE FIZ COM CONCATENAÇÃO no texto + CASTING na conversão ali (int) por causa
   // do valor em double 1.8, mas não precisa ser assim sempre.
    public static void exercicio2(){
        int temperaturaCelsius = 25;
        int temperaturaFahrenheit =  (int) (temperaturaCelsius * 1.8) + 32;

        String resultadoTemperatura = """
                A temperatura em Graus Celsius e:  """ + temperaturaCelsius + """
                
                A tempratura em Fahrenheit sera de:  """ + temperaturaFahrenheit + """
                """;

        System.out.println(resultadoTemperatura);
    }

    //Prática e estudos de cálculo
    public static void exercicio3(){
        double nota1 = 7.5, nota2 = 9.75;
        double media = (nota1 + nota2)/2;

        System.out.println("A media das notas sera de: " + media);
    }
    //Fazer casting double para int
    public static void exercicio4(){
        double teste1 = 7.5;
        int teste2;

        teste2 = (int) teste1;
        System.out.println(teste2);
    }
    //Tipo char e String concatenado em uma mensagem
    public static void exercicio5(){
        char sexo = 'M';
        String nome = "Gustavo Fernandes";

        System.out.println("Nome: " + nome + "do sexo: " + sexo);
    }
    //Cálculo de multiplicação
    public static void exercicio6(){
        double precoProduto = 5.75;
        int quantidade = 20;

        double precoTotal = precoProduto * quantidade;

        System.out.println("O preco total do item: " + precoTotal);
    }
    //Terinando conversão e multiplicação + casting
    public static void exercicio7(){
        double valorEmDolares = 150.00;
        int valorEmReal = (int) (valorEmDolares * 4.94);

        System.out.println("O valor em real sera: " + valorEmReal);
    }

    public static void exercicio8(){
        double precoOriginal = 15.00;
        double percentualDesconto = 50;

        double precoDesconto = precoOriginal * percentualDesconto/100;
        double precoTotal = precoOriginal - precoDesconto;

        System.out.println("O preco total do item com desconto sera: " + precoTotal);
    }
}
