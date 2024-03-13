package fibonacci;

import java.util.Scanner;

public class FiboOrNot {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
    public static boolean verificarFibonacci(int numero) {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        while (primeiroTermo <= numero) {
            if (primeiroTermo == numero) {
                return true;
            }
            
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
        return false;
}
