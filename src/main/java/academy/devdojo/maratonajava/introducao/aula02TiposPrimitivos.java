package academy.devdojo.maratonajava.introducao;

public class aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos

        //Tipos inteiros

        byte numeroPequeno = 127; // byte tamanho 8 bits vai de -128 a 127

        short numeroMedio = 32_767; // short tamanho 16 bits vai de -32.768 a 32.767

        int numeroGrande = 2_100_000_000; // int tamanho 32 bits vai de -2,1 bilhões a 2,1 bilhões (Padrão utilizado)

        long numeroGigante = 9_000_000_000_000_000_000L; // long tamanho 64 bits vai de -9 quintilhões a 9 quintilhões (requer sufixo L)

        //Tipos de Ponto Flutuante

        float numeroFloat = 100.00f; // float tamanho 32 bits vai ate 7 dígitos decimais (requer sufixo f)

        double numeroDouble = 1000.000; // double tamanho 64 bits vai ate 15 dígitos decimais (Padrão para decimais)

        //Tipo de Caractere
        //Armazena um único caractere Unicode.

        char letra = 'A'; //Tem 16 bits. Utiliza aspas simples (ex: 'A', '\u0041').

        //Tipo Lógico (Booleano)

        boolean isTrue = true; //boolean: Pode assumir apenas true ou false. O tamanho exato depende da Máquina Virtual Java (JVM), mas conceitualmente representa 1 bit de informação.

    }
}
