import java.util.Scanner;

public class Solução_de_problema_soma_impares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variavel
        int n1, n2, soma;


        //Digite os valores
        System.out.print("Digite o valor X: ");
        n1 = sc.nextInt();

        System.out.print("Digite o valor Y: ");
        n2 = sc.nextInt();

        //Calculando
        soma = 0;
        if (n1 < n2){
            for (int i = n1; i < n2; i++){
                if (i % 2 != 0){soma += i;}
            }
        } else if (n2 < n1){
            for (int i = n2; i < n1; i++){
                if (i % 2 != 0){soma += i;}
            }
        }

        System.out.print("Soma dos valores: " + soma);

        sc.close();
    }
}
