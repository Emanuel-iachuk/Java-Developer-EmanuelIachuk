package academy.devdojo.maratonajava.introducao;


public class aula06EstruturasDeRepeticao01 {
    //Principais estruturas de repetção
    // While, Do While, For
    public static void main(String[] args) {
        System.out.println("===For===");
        // O for repetira somente a quantidade de vezes que vc mandar.
        // muito util quando vc ja sabe quantas vezes quer repetir o codigo.
        for (int i = 0; i < 10; i++) {
            // esse for imprime um triangulo retângulo de for
            System.out.println("for".repeat(i));
        }
        System.out.println("===While===");
        //variavel para ficar mais facil a explicação do while
        int value = 0;
        //While sempre vai repitir, ate que determinada ação seja executada
        //util quando vc não sabe quantas vezes vai ter que repetir
        //Cuidado! se não for colocado uma forma de parar ele rodara para sempre fazendo seu computador ficar lento
        //O while rodara enquanto a variavel value for diferente de 10 conseguiria o mesmo resultado com (value < 10)
        while(value != 10){
            value++;
            // esse for imprime um triangulo retângulo de while
            System.out.println("While".repeat(value));
        }

        System.out.println("===Do-While===");

        int count = 0;
        //do-while sempre vai executar uma vez e depois verificar a condição
        do{
            count++;
            System.out.println("do-while".repeat(count));
        }while (count < 10);

    }

}
