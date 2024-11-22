import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 20;
        salario = 5800.5;
        altura = 1.70;
        genero = 'M';
        nome = "Carlos";

        System.out.println("Idade = " + idade);
        System.out.println("Salario = " + salario);
        System.out.println("Salario = " + altura);
        System.out.println("Genero: " + genero);
        System.out.println("Nome = " + nome);

        String ajuda = sc.nextLine();
        System.out.println(ajuda);

        sc.close();
    }
}