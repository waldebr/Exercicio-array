import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] nomes = new String[10];
        

        System.out.println("Digite 10 nomes: ");
            for (int i = 0; i < 10; i++) {
                nomes[i] = sc.nextLine();
        }
        
      
        Arrays.sort(nomes);
        
   
        System.out.println("Nomes em ordem crescente:");
            for (String nome : nomes) {
                System.out.println(nome);
        }
        
        scanner.close();
    }
}
