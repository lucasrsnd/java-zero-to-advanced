package exercicios;

import java.util.Scanner;

public class AlgRecursivo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        lerInput();
        scanner.close();
    }

    private static void lerInput() {
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int somaPares = somaParesRec(n);
        // int somaPares = somaParesIter(n);

        System.out.println("A soma de todos os pares até " + n + " é: " + somaPares);
    }
    
    private static int somaParesRec(int limite) {
        if (limite == 0) {
            return 0;
        }

        if (limite % 2 == 0) {
            return limite + somaParesRec(limite - 2);
        }
        return somaParesRec(limite - 1);
    }

    /*private static int somaParesRec(int start, int limite) {
    	if(start > limite) {
    		return 0;
    	}
    	
    	if (start % 2 == 0) {
    		return start + somaParesRec(start + 2, limite);
    	}
    	
    	return somaParesRec(start + 2, limite);
    }*/
    

    /*private static int somaParesIter(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        return res;
    }*/
}
