package racas;

import java.util.Random;

public class Meio_Orc {

    public static String nomeMeio_Orc(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasMeioOrc[] = { "Dench", "Feng", "Gell", "Henk",
                "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump",
                "Thokk" };

        String nomesFemMeioOrc[] = { "Baggi", "Emen", "Engong", "Kansif",
                "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola",
                "Volen", "Yevelda" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasMeioOrc.length) + 1;
            nome = nomesMasMeioOrc[seletorNome];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemMeioOrc.length) + 1;
            nome = nomesFemMeioOrc[seletorNome];
        }
        return nome;
    }
}