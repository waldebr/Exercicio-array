import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        String[] nomes = new String[20];
        
        
        System.out.println("Digite 20 nomes:");
            for (int i = 0; i < 20; i++) {
                nomes[i] = sc.nextLine();
        }
        
 
        Arrays.sort(nomes, Collections.reverseOrder());
        
      
        System.out.println("Nomes em ordem decrescente:");
            for (String nome : nomes) {
                System.out.println(nome);
        }
        
  
        sc.close();
    }
}
