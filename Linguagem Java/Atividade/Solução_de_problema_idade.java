import java.util.Scanner;

public class Solução_de_problema_idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variaveis
        String nome1, nome2;
        int idade1, idade2;
        double media;

        //Digite os dados
        System.out.print("Digite o primeiro nome: ");
        nome1 = sc.nextLine();

        System.out.print("Digite a primeira idade: ");
        idade1 = sc.nextInt();

        //Limpando o buffer
        sc.nextLine();

        System.out.print("Digite o segundo nome: ");
        nome2 = sc.nextLine();

        System.out.print("Digite a segunda idade: ");
        idade2 = sc.nextInt();

        //Descobrindo a media
        media = (double)(idade1 + idade2) / 2;

        //Exibindo
        System.out.print("A idade media de " + nome1 + " e " + nome2 + "eh de " + media + " anos");

        sc.close();
    }
}
