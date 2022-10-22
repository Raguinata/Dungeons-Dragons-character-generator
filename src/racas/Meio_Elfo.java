package racas;

import java.util.Random;

public class Meio_Elfo {

    public static String nomeMeio_Elfo(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasMeioElfo[] = { "Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric",
                "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios",
                "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior",
                "Tharivol", "Theren", "Varis" };

        String nomesFemMeioElfo[] = { "Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna",
                "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna",
                "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava",
                "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasMeioElfo.length);
            ;
            nome = nomesMasMeioElfo[seletorNome];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemMeioElfo.length);
            ;
            nome = nomesFemMeioElfo[seletorNome];
        }
        return nome;
    }
}