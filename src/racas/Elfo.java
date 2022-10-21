package racas;

import java.util.Random;

public class Elfo {

    public static String nomeElfo(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasElfo[] = { "Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric",
                "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios",
                "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior",
                "Tharivol", "Theren", "Varis" };

        String nomesFemElfo[] = { "Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna",
                "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna",
                "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava",
                "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia" };

        String sobrenomesElfo[] = { "Amakiir", "Amastacia", "Galanodel", "Holimion",
                "Ilphelkiir", "Liadon", "Meliamne", "Nailo", "Siannodel", "Xiloscient" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasElfo.length) + 1;
            int seletorSobre = random.nextInt(sobrenomesElfo.length) + 1;
            nome = nomesMasElfo[seletorNome] + " " + sobrenomesElfo[seletorSobre];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemElfo.length) + 1;
            int seletorSobre = random.nextInt(sobrenomesElfo.length) + 1;
            nome = nomesFemElfo[seletorNome] + " " + sobrenomesElfo[seletorSobre];
        }
        return nome;
    }

    public static String nomeInfanciaElfo() {
        Random random = new Random();
        String nome = " ";

        String nomeInfElfo[] = { "Ara", "Bryn", "Del", "Eryn", "Faen", "Innil", "Lael",
                "Mella", "Naill", "Naeris", "Phann", "Rael", "Rinn", "Sai", "Syllin",
                "Thia", "Vall" };

        int seletornome = random.nextInt(nomeInfElfo.length) + 1;
        nome = "# Nome de Infância: " + nomeInfElfo[seletornome];
        return nome;
    }
}
