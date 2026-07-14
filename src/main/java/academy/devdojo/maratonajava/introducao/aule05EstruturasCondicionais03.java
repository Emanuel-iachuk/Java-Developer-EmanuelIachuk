package academy.devdojo.maratonajava.introducao;

public class aule05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se o seu saldo for > 5000
        double salario = 5000;
        String mensagemDoar = "Obrigado por doar";
        String mensagemNaoDoar = "Que pena!!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
