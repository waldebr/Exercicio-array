import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        Integer[] numeros = new Integer[50]; 
        

        System.out.println("Digite 50 números:");
            for (int i = 0; i < 50; i++) {
            numeros[i] = sc.nextInt(); 
        }
        

        Arrays.sort(numeros, Collections.reverseOrder());
        
    
        System.out.println("Números em ordem decrescente:");
            for (int numero : numeros) {
            System.out.println(numero);
        }
        
     
        sc.close();
    }
}
