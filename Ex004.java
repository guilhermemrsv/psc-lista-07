package ex04;
import java.util.Scanner;
public class Ex004 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] contadores = new int[9]; // índices 0–7 para faixas, 8 para $1000+
        double comissaoFixa = 200.0;
        double taxaComissao = 0.09;

        System.out.print("Digite o número de vendedores: ");
        int vendedores = sc.nextInt();

        for (int i = 0; i < vendedores; i++) {
            System.out.print("Digite o valor das vendas do vendedor " + (i + 1) + ": $");
            double vendas = sc.nextDouble();

            double salario = comissaoFixa + (vendas * taxaComissao);

            if (salario >= 1000) contadores[8]++;
            else {
                int indice = (int) ((salario - 200) / 100);
                if (indice >= 0 && indice < 8) contadores[indice]++;
            }
        }

        System.out.println("\nDistribuição de salários:");
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 ou mais: " + contadores[8]);

        sc.close();
    }
}