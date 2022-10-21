package racas;
import java.util.Random;

public class Anao {

    public static String nomeAnao(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasAnao[] = { "Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor",
                "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak",
                "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek",
                "Traubon", "Travok", "Ulfgar", "Veit", "Vondal" };

        String nomesFemAnao[] = { "Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth",
                "Falkrunn", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa",
                "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra" };

        String sobrenomesAnao[] = { "Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge",
                "Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Loderr", "Lutgehr", "Rumnaheim", "Strakeln",
                "Torunn", "Ungart" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasAnao.length) + 1;
            int seletorSobre = random.nextInt(sobrenomesAnao.length) + 1;
            nome = nomesMasAnao[seletorNome] + " " + sobrenomesAnao[seletorSobre];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemAnao.length) + 1;
            int seletorSobre = random.nextInt(sobrenomesAnao.length) + 1;
            nome = nomesFemAnao[seletorNome] + " " + sobrenomesAnao[seletorSobre];
        }
        return nome;
    }
}
