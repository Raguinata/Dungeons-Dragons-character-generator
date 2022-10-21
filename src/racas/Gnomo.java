package racas;

import java.util.Random;

public class Gnomo {

    public static String nomeGnomo(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasGnomo[] = { "Alston", "Alvyn", "Boddynock", "Brocc",
                "Burgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo",
                "Gimble", "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn",
                "Roondar", "Seebo", "Sindri", "Warryn", "Wrenn", "Zook" };

        String nomesFemGnomo[] = { "Bimpnottin", "Breena", "Caramip",
                "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick",
                "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda",
                "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna" };

        String sobrenomesGnomo[] = { "Beren", "Daergel", "Folkor", "Garrick", "Nackle",
                "Murnig", "Ningel", "Raulnor", "Scheppen", "Timbers", "Turen" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasGnomo.length) + 1;
            int seletorSobre = random.nextInt(sobrenomesGnomo.length) + 1;
            nome = nomesMasGnomo[seletorNome] + " " + sobrenomesGnomo[seletorSobre];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemGnomo.length) + 1;
            int seletorSobre = random.nextInt(sobrenomesGnomo.length) + 1;
            nome = nomesFemGnomo[seletorNome] + " " + sobrenomesGnomo[seletorSobre];
        }
        return nome;
    }

    public static String nomeInfanciaGnomo() {
        Random random = new Random();
        String nome = " ";

        String apelidoGnomo[] = { "Beberrão", "Pó de Coração", "Texugo", "Manto",
                "Tranca-Dupla", "Bate-Carteira", "Fnipper", "Ku", "Nim", "Um Sapato",
                "Pústula", "Gema Faiscante", "Pato Desajeitado" };

        int seletornome = random.nextInt(apelidoGnomo.length) + 1;
        nome = "# Apelido: " + apelidoGnomo[seletornome];
        return nome;
    }
}
