import java.util.Scanner;

public class Solução_de_problema_menor_numero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int n1, n2, n3;

        //Digite os valores
        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        n3 = sc.nextInt();

        //Descobrindo quem é o menor
        if (n1 < n2 && n1 < n3){
            System.out.print("Menor numero: " + n1);
        } else if (n2 < n1 && n2 < n3){
            System.out.print("Menor numero: " + n2);
        } else if (n3 < n1 && n3 < n2){
            System.out.print("Menor numero: " + n3);
        }
        sc.close();
    }
}
