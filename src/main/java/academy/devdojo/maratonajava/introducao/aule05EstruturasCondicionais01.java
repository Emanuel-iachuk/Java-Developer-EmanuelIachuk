package academy.devdojo.maratonajava.introducao;

public class aule05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 17;

        boolean isMaiorDeIdade = age >= 18;

        if (isMaiorDeIdade){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("aule05EstruturasCondicionais.main");
        }
        if (!isMaiorDeIdade) {
            System.out.println("Você não pode entrar");
        }

        System.out.println("Fora dos IFs");
    }
}

