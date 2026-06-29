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
        // && (And) - precisa que todas as alternativas sejam verdadeiras
        // || (Or) - somente uma precisa ser verdadeira
        // ! (Not) - inverte o valor verdadeiro vira falso
        // ^ (Xor) - Disjunção Exclusiva precisa que os lados sejam DIFERENTES para ser verdadeiro

        System.out.println(true && false); // false(falso)
        System.out.println(true || false); // true(verdadeiro)
        System.out.println(!false); // valor invertido agora e true
        System.out.println(true ^ true); // false(falso, pois são iguais)
        System.out.println(true ^ false); // true(verdadeiro, pois são diferentes)

        // Operadores de atribuição
        // =, +=, -=, *=, /=, %=

        double saldoAtual = 50;
        saldoAtual += 1000;
        System.out.println("Saldo atual: " + saldoAtual); // Saldo atual 1050
        saldoAtual -= 1000;
        System.out.println("Saldo atual: " + saldoAtual); // Saldo atual 50
        saldoAtual *= 1000;
        System.out.println("Saldo atual: " + saldoAtual); // Saldo atual 50000
        saldoAtual /= 1000;
        System.out.println("Saldo atual: " + saldoAtual); // Saldo atual 50
        saldoAtual %= 1000;
        System.out.println("Saldo após %= (Resto de 50 dividido por 1000): " + saldoAtual); // Saldo atual 50

        // Operadores de Incremento
        // ++, --

        int contador = 0;
        System.out.println("Contador: " + contador++); // Vai exibir o valor do contador antes de incrementar 1;
        System.out.println("Contador valor atual: " + contador); // Agora o valor mudou;
        System.out.println("Contador: " + ++contador); // Vai incrementar 1 primeiro e depois exibir o valor;
        System.out.println("Contador: " + contador--); // Vai exibir o valor do contador antes de decrementar 1;
        System.out.println("Contador valor atual: " + contador); // Agora o valor mudou;
        System.out.println("Contador: " + --contador); // Vai decrementar 1 primeiro e depois exibir o valor;
    }
}
