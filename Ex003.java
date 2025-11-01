package ex03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Ex003 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Double> notas = new ArrayList<>();
	        double soma = 0;

	        System.out.println("Digite as notas (-1 para encerrar):");
	        while (true) {
	            double n = sc.nextDouble();
	            if (n == -1) break;
	            notas.add(n);
	            soma += n;
	        }

	        int qtd = notas.size();
	        double media = soma / qtd;

	        System.out.println("\nQuantidade de notas lidas: " + qtd);

	        System.out.println("Notas na ordem informada:");
	        for (double n : notas) System.out.print(n + " ");

	        System.out.println("\n\nNotas na ordem inversa:");
	        Collections.reverse(notas);
	        for (double n : notas) System.out.println(n);

	        System.out.println("\nSoma das notas: " + soma);
	        System.out.printf("Média das notas: %.2f\n", media);

	        int acimaMedia = 0, abaixoSete = 0;
	        for (double n : notas) {
	            if (n > media) acimaMedia++;
	            if (n < 7) abaixoSete++;
	        }

	        System.out.println("Notas acima da média: " + acimaMedia);
	        System.out.println("Notas abaixo de 7: " + abaixoSete);

	        System.out.println("\nPrograma encerrado.");
	        sc.close();
	    }
	}