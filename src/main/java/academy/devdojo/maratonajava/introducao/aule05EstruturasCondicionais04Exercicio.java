package academy.devdojo.maratonajava.introducao;

public class aule05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double salarioAnual = 34_712;
        final double PRIMEIRA_FIXA = 9.70 /  100;
        final double SEGUNDA_FAIXA = 37.35 /  100;
        final double TERCEIRA_FAIXA = 49.50 /  100;
        String mensagem = "";

        if (salarioAnual > 0 && salarioAnual <= 34_712) {
            mensagem = String.format("Taxa de 9.70%%: imposto de =  %.2f", salarioAnual * PRIMEIRA_FIXA);
        } else if (salarioAnual >= 34_713 && salarioAnual <= 68_507) {
            mensagem = String.format("Taxa de 37.35%%: imposto de =  %.2f", salarioAnual * SEGUNDA_FAIXA);
        }else if(salarioAnual > 68_507){
            mensagem = String.format("Taxa de 49.50%%: imposto de =  %.2f", salarioAnual * TERCEIRA_FAIXA);
        }else {
            mensagem = "Erro: Numero invalido";
        }
        System.out.println(mensagem);
    }
}
