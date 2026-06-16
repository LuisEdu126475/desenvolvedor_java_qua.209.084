package binomios;
import java.util.Scanner;

public class CalculadoraBinomial {

    // Método para calcular o fatorial de forma manual (atendendo aos requisitos)
    public static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("=== CALCULADORA DE NÚMEROS BINOMIAIS ===");
            System.out.print("Digite o valor de n: ");
            String entradaN = scanner.next();
            System.out.print("Digite o valor de p: ");
            String entradaP = scanner.next();

            // 1. Validação de entradas (Campos vazios / Tipo de dado)
            try {
                int n = Integer.parseInt(entradaN);
                int p = Integer.parseInt(entradaP);

                // 2. Validação das Regras Matemáticas
                if (n < 0 || p < 0) {
                    System.out.println("[ERRO] Os números não podem ser negativos!\n");
                } else if (p > n) {
                    System.out.println("[ERRO] Incompatível! O valor de 'p' não pode ser maior que 'n'.\n");
                } else {
                    // 3. Processamento dos Cálculos
                    long fatN = calcularFatorial(n);
                    long fatP = calcularFatorial(p);
                    long fatNP = calcularFatorial(n - p);

                    // Fórmula: C(n, p) = n! / (p! * (n - p)!)
                    long resultado = fatN / (fatP * fatNP);

                    // 4. Exibição Clara dos Resultados
                    System.out.println("\n--- RESULTADOS ---");
                    System.out.println(n + "! = " + fatN);
                    System.out.println(p + "! = " + fatP);
                    System.out.println("(" + n + " - " + p + ")! = " + fatNP);
                    System.out.println("Coeficiente Binomial (" + n + " sobre " + p + ") = " + resultado);
                    System.out.println("-------------------\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Entrada inválida! Insira apenas números inteiros.\n");
            }

            // Permite realizar diferentes cálculos no mesmo programa
            System.out.print("Deseja realizar outro cálculo? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            System.out.println();

        } while (continuar == 'S');

        System.out.println("Programa encerrado. Bom trabalho!");
        scanner.close();
    }
}