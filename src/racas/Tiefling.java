package racas;

import java.util.Random;

public class Tiefling {

    public static String nomeTiefling(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasTief[] = { "Akmenos", "Amnon",
                "Barakas", "Damakos", "Ekemon", "Iados", "Kairon", "Leucis",
                "Melech", "Mordai", "Morthos", "Pelaios", "Skamos", "Therai" };

        String nomesFemTief[] = { "Akta", "Anakis", "Bryseis",
                "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria",
                "Nemeia", "Orianna", "Phelaia", "Rieta" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasTief.length) + 1;
            nome = nomesMasTief[seletorNome];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemTief.length) + 1;
            nome = nomesFemTief[seletorNome];
        }
        return nome;
    }

    public static String nomeInfanciaTiefling() {
        Random random = new Random();
        String nome = " ";

        String nomeHonradoTiefling[] = { "Abertura", "Arte", "Carniça", "Canção",
                "Crença", "Desespero", "Excelência", "Esperança", "Gloria",
                "Ideal", "Ímpeto", "Música", "Nada", "Poesia", "Medo", "Missão",
                "Penoso", "Reverencia", "Mágoa", "Temeridade", "Tormenta" };

        int seletornome = random.nextInt(nomeHonradoTiefling.length) + 1;
        nome = "# Nome Honrado: " + nomeHonradoTiefling[seletornome];
        return nome;
    }
}
