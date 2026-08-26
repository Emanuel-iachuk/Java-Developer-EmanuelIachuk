package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais05Exercicio {
    public static void main(String[] args) {

        //Sistema basico de desconto por dia utilizando switch case;
        String dia = "qua";
        String diaEmMaiusculo = dia.toUpperCase();
        String mensagem = "";
        double desconto = 0;

        switch (diaEmMaiusculo){
            case "SEG", "TER", "SEX":
                mensagem = "Seja bem vindo";
                desconto = 0.10;
                break;
            case "QUA":
                mensagem = "Queima de estoque ";
                desconto = 0.50;
                break;
            case "QUI":
                desconto = 0.15;
                break;
            case "SAB", "DOM":
                mensagem = "Sem desconto hoje ";
                break;
            //default serve como um valor padrao casso alguem digite algo errado, ele é igual ao else
            default:
                mensagem = "Dia invalido";
        }

        System.out.printf("%s: Desconto de %.2f%%", mensagem, desconto * 100);
    }
}
