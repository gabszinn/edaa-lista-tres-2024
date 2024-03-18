import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

    System.out.println("Digite a quantidade de nomes que serão inseridos:");
    int n = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        Collections.sort(nomes);
        System.out.println("Nomes em ordenação:");
        for (String nome : nomes) {

            System.out.println(nome);
            scanner.close();
    }
} 
  }
