import java.util.Scanner;

public class Criar_Personagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero = Sorteios.sorteioGenero();
        String raca = Sorteios.sorteioRaca();
        String classe = Sorteios.sorteioClasse();
        String nome = Complemento_Raca.sorteioNome(raca, genero);

        System.out.printf("##### PERSONAGEM #####\n");
        System.out.println("# Gênero: " + genero + " #");
        System.out.println("# Nome: " + nome + " #");
        System.out.println("# Raça: " + raca + " #");
        System.out.println("# Classe: " + classe + " #");
        System.out.println("Obrigado!!!");
        

        sc.close();
    }
}

