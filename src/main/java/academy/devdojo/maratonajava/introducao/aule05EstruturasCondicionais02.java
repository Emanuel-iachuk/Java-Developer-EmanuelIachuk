package academy.devdojo.maratonajava.introducao;

public class aule05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = -1;

        if (idade < 15) {
            System.out.println("Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Juvenil");
        }else{
            System.out.println("Adulto");
        }

    }
}
