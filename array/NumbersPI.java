import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] pares = new int[100];
        int[] impares = new int[100];
        
        int countPares = 0;
        int countImpares = 0;

        
        System.out.println("Digite 100 números:");
            for (int i = 0; i < 100; i++) {
                int numero = sc.nextInt();
            
          
            if (numero % 2 == 0) {
                if (countPares < 100) {
                    pares[countPares] = numero;
                    countPares++;
                }
            } else {
                if (countImpares < 100) {
                    impares[countImpares] = numero;
                    countImpares++;
                }
            }
        }

      
        System.out.println("Números pares:");
        for (int i = 0; i < countPares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Números ímpares:");
        for (int i = 0; i < countImpares; i++) {
            System.out.println(impares[i]);
        }

        sc.close();
    }
}
