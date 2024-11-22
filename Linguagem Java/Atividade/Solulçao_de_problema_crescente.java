import java.util.Scanner;

public class Solulçao_de_problema_crescente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int x, y;

        //Digite o valor
        System.out.print("Digite o valor X: ");
        x = sc.nextInt();

        System.out.print("Digite o valor Y: ");
        y = sc.nextInt();

        //Descobrindo quem é o menor
        if (x > y){
            System.out.print("Decrescente");
        } else{
            System.out.print("Crescente");
        }

        sc.close();
    }
}
