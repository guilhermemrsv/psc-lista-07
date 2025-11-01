package ex01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex001 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Double> temperaturas = new ArrayList<>();
	        String[] meses = {
	            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
	            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
	        };

	        for (int i = 0; i < 12; i++) {
	            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
	            temperaturas.add(sc.nextDouble());
	        }

	        double soma = 0;
	        for (double t : temperaturas) soma += t;
	        double mediaAnual = soma / 12;

	        System.out.printf("\nMédia anual das temperaturas: %.2f°C\n", mediaAnual);
	        System.out.println("\nMeses com temperatura acima da média:");
	        for (int i = 0; i < 12; i++) {
	            if (temperaturas.get(i) > mediaAnual) {
	                System.out.printf("%s - %.2f°C\n", meses[i], temperaturas.get(i));
	            }
	        }

	        sc.close();
	    }
	}