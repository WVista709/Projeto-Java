import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class Solucao_de_problema_retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);  // Configurando o Locale para usar ponto em decimais
        
        Scanner sc = new Scanner(System.in);

        // Variáveis
        double base, altura, area, perimetro, diagonal;

        // Digite a base e a altura
        System.out.print("Base do retângulo: ");
        base = sc.nextDouble();  // Alterado para nextDouble()

        System.out.print("Altura do retângulo: ");
        altura = sc.nextDouble();  // Alterado para nextDouble()

        // Calculando área
        area = base * altura;

        // Calculando Perímetro
        perimetro = 2 * (base + altura);

        // Calculando Diagonal
        diagonal = Math.sqrt(base * base + altura * altura);

        // Mostrando o resultado
        System.out.printf("area: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        sc.close();
    }
}