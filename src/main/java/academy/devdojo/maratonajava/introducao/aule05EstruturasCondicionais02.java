package academy.devdojo.maratonajava.introducao;

public class aule05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        String categoria;
        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
