import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String texto = scanner.nextLine();
        char[] letras = texto.toCharArray();
        quickSort(letras, 0, letras.length - 1);
        System.out.println("String ordenada em ordem crescente:");
        String resultado = new String(letras);
        System.out.println(resultado);
        scanner.close();
    }
    private static void quickSort(char[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivot = particionar(array, inicio, fim);
            quickSort(array, inicio, indicePivot - 1);
            quickSort(array, indicePivot + 1, fim);
        }
    }
private static int particionar(char[] array, int inicio, int fim) {
    char pivot = array[fim];
    int i = inicio - 1;
    for (int j = inicio; j < fim; j++) {
        if (array[j] <= pivot) {
            i++;
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
 }
    char temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;

}
}
