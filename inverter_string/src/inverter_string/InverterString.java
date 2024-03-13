package inverter_string;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase para inverter: ");
        String entrada = scanner.nextLine();
        
        String invertida = inverterString(entrada);
        
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }
        
        return new String(caracteres);
    }
}