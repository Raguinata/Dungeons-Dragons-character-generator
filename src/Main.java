import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdPersonagens;
        StringBuilder mensagem = new StringBuilder();

        qtdPersonagens = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a quantidade de personagens para criar?", "Qustionario", 3));

        for (int i = 0; i < qtdPersonagens; i++) {
            String genero = Sorteios.sorteioGenero();
            String raca = Sorteios.sorteioRaca();
            String classe = Sorteios.sorteioClasse();
            String etniaHumano = Sorteios.sorteioEtniaHumano();
            String nome = Ponte_Nome.sorteioNome(raca, genero, etniaHumano);

            mensagem.append("##### PERSONAGEM #####\n");
            mensagem.append("# Gênero: ").append(genero).append("\n");
            mensagem.append("# Nome: ").append(nome).append("\n");

            if (raca.equals("Elfo") || raca.equals("Gnomo") || raca.equals("Tiefling")) {
                mensagem.append(Ponte_Nome.sorteioNomeInfancia(raca)).append("\n");
            }

            mensagem.append("# Raça: ").append(raca).append("\n");

            if (raca.equals("Humano")) {
                mensagem.append("# Etnia: ").append(etniaHumano).append("\n");
            }

            mensagem.append("# Classe: ").append(classe).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString(), "Personagens", JOptionPane.INFORMATION_MESSAGE);
    

    JOptionPane.showMessageDialog(null, "Obrigado por usar meu programa!!!\nGitHub: Raguinata", "final", 1);

        sc.close();
    }
}

