import java.util.Scanner;

public class Solução_de_problema_diagonal_negativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int N, soma;

        //Tamanho da matriz
        System.out.print("Digite o tamanho do matriz: ");
        N = sc.nextInt();

        //Criando a matriz
        int[][] Matriz = new int[N][N];

        //Criando a matriz
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print("Elemento [" + i + "," + j +"]: ");
                Matriz[i][j] = sc.nextInt();
            }
        }

        //Diagonal principal
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < N; i++){
            System.out.println(Matriz[i][i]);
        }

        //Quantidade de negativos
        soma = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (Matriz[i][j] < 0){
                    soma++;
                }
            }
        }
        System.out.print("Quantidade de negativos: " + soma);

        sc.close();
    }
}
