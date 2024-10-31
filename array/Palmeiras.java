import java.util.Scanner;

public class TabelaClassificacao {
    public static void main(String[] args) {
        
        String[] times = {
            "Flamengo", "Palmeiras", "São Paulo", "Atlético Mineiro",
            "Corinthians", "Internacional", "Grêmio", "Santos",
            "Athletico-PR", "Fortaleza", "Ceará", "Bahia",
            "Vasco", "Botafogo", "Atlético Goianiense", "Sport",
            "Chapecoense", "Juventude", "Bragantino", "Cuiabá"
        };
        
       
        int[] pontos = new int[20];

       
        for (int i = 0; i < pontos.length; i++) {
            pontos[i] = 0; 
        }

    
        System.out.println("Tabela de Classificação do Campeonato Brasileiro:");
        System.out.println("Posição | Time                    | Pontos");
        System.out.println("--------------------------------------------");
            for (int i = 0; i < times.length; i++) {
                System.out.printf("%-8d| %-22s | %d%n", (i + 1), times[i], pontos[i]);
        }
    }
}
