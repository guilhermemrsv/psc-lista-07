package ex02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex002 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (s/n): ");
            respostas.add(sc.next().toLowerCase());
        }

        int contadorSim = 0;
        for (String r : respostas) {
            if (r.equals("s") || r.equals("sim")) contadorSim++;
        }

        System.out.print("\nClassificação: ");
        if (contadorSim == 2) {
            System.out.println("Suspeita");
        } else if (contadorSim >= 3 && contadorSim <= 4) {
            System.out.println("Cúmplice");
        } else if (contadorSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        sc.close();
    }
}