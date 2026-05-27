package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
    public static void main(String[] args) {
        //Operadores
        // +, -, /, *
        int soma = 10 + 3;

        int subtracao = 10 - 3;

        // Aqui foi utilizado "casting" para evitar a pegadinha da divisão inteira,
        // garantindo que o resultado preserve as casas decimais.
        double divisao = (double) 10 / 3;

        int multiplicacao = 10 * 3;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Multiplicação = " + multiplicacao);

        //Operadores de comparação
        //Pense neles como perguntas que você faz ao código. A resposta para essas perguntas será sempre apenas uma de duas opções: ou é Verdadeiro (true) ou é Falso (false)

        // == (Igual a)
        // != (Diferente de)
        // > (Maior que)
        // < (Menor que)
        // >= (Maior ou igual)
        // <= (Menor ou igual)

        boolean isIgual = 10 == 10; // true(verdadeiro)
        boolean isDiferente = 10 != 10; // false(falso)
        boolean isMaior = 10 > 10; // false(falso)
        boolean isMenor = 10 < 10; // false(falso)
        boolean isMaiorOuIgual = 10 >= 10; // true(verdadeira)
        boolean isMenorOuIgual = 10 <= 10; // true(verdadeira)


        // Operadores logicos
        // && (And) precisa que todas as alternativas sejam verdadeiras
        // || (Or) somente uma precisa ser verdadeira
        // ! (Not) inverte o valor verdadeiro vira falso

        System.out.println(true && false); // false(falso)
        System.out.println(true || false); // true(verdadeiro)
        System.out.println(!false); // valor invertido agora e true
    }
}
