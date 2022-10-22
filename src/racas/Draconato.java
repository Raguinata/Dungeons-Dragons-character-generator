package racas;
import java.util.Random;

public class Draconato {

    public static String nomeDraconato(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasDraco[] = { "Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Heskan",
                "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash",
                "Shedinn", "Tarhun", "Torinn" };

        String nomesFemDraco[] = { "Akra", "Biri", "Daar", "Farideh", "Harann", "Flavilar", "Jheri",
                "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit" };

        String sobrenomesDraco[] = { "Clethtinthiallor", "Daardendrian", "Delmirev", "Drachedandion",
                "Fenkenkabradon", "Kepeshkmolik", "Kerrhylon", "Kimbatuul", "Linxakasendalor", "Myastan",
                "Nemmonis", "Norixius", "Ophinshtalajiir", "Prexijandilin", "Shestendeliath", "Turnuroth",
                "Verthisathurgiesh", "Yarjerit" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasDraco.length);
            int seletorSobre = random.nextInt(sobrenomesDraco.length);
            nome = nomesMasDraco[seletorNome] + " " + sobrenomesDraco[seletorSobre];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemDraco.length);
            int seletorSobre = random.nextInt(sobrenomesDraco.length);
            nome = nomesFemDraco[seletorNome] + " " + sobrenomesDraco[seletorSobre];
        }
        return nome;
    }
}
