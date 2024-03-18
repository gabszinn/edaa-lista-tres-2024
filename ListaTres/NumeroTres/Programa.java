import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String string = scanner.nextLine();

        char[] letras = string.toCharArray();

        for (int i = 0; i < letras.length - 1; i++) {
            
        for (int j = 0; j < letras.length - i - 1; j++) {
            if (letras[j] > letras[j + 1]) {

                    char a = letras[j];
                    letras[j] = letras[j + 1];
                    letras[j + 1] = a;
                    scanner.close();                }
            }
        }

    System.out.println("String(s) ordenada em ordem crescente:");
        String resultado = new String(letras);
        System.out.println(resultado);
    }
}
