import java.util.Scanner;

public class Solução_de_problema_soma_vetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int N;
        double soma, media;

        //Digite o valor
        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        //Tamanho do vetor
        double[] vet = new double[N];

        //Colocando valores no vetor
        for (int i = 0; i < N; i++){
            System.out.print("Valor: ");
            vet[i] = sc.nextDouble();
        }

        //Mostrando os valores
        System.out.print("Valores: ");
        for (int i = 0; i < N; i++){
            System.out.print(vet[i] + " ");
        }

        //Somando
        soma = 0;
        for (int i = 0; i < N; i++){
            soma += vet[i];
        }
        
        System.out.print("\nSoma: " + soma);

        //Media
        media = soma / N;

        System.out.print("\nMedia: " + media);

        sc.close();
    }
}
