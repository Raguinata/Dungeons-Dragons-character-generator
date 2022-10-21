import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {

        String genero = Sorteios.sorteioGenero();
        String raca = Sorteios.sorteioRaca();
        String classe = Sorteios.sorteioClasse();
        String etniaHumano = Sorteios.sorteioEtniaHumano();
        String nome = Ponte_Nome.sorteioNome(raca, genero, etniaHumano);

        System.out.printf("##### PERSONAGEM #####\n");
        System.out.println("# Gênero: " + genero);
        System.out.println("# Nome: " + nome);

        if (raca == "Elfo" || raca == "Gnomo" || raca == "Tiefling") {
            System.out.println(Ponte_Nome.sorteioNomeInfancia(raca));
        }
        System.out.println("# Raça: " + raca);

        if (raca == "Humano") {
            System.out.println("# Etnia: " + etniaHumano);
        }
        System.out.println("# Classe: " + classe);
        System.out.println();
    }

        sc.close();
    }
}
