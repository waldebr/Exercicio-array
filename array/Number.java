import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int[] numeros = new int[50];
        
       
        System.out.println("Digite 50 números:");
            for (int i = 0; i < 50; i++) {
                numeros[i] = sc.nextInt();
        }
        
    
        Arrays.sort(numeros);
        
      
        System.out.println("Números em ordem crescente:");
            for (int numero : numeros) {
                System.out.println(numero);
        }
      
        sc.close();
    }
}
