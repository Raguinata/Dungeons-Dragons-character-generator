package racas;
import java.util.Random;

public class Halfling {

    public static String nomeHalfling(String genero) {
        Random random = new Random();
        String nome = " ";

        String nomesMasHalf[] = { "Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich", "Finnan",
                "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby" };

        String nomesFemHalf[] = { "Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia",
                "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna" };

        String sobrenomesHalf[] = { "Cata-Escovas", "Bom-Barril", "Garrafa Verde", "Alta Colina", "Baixa Colina",
                "Prato Cheio", "Folha de Chá", "Espinhudo", "Cinto Frouxo", "Galho Caído" };

        if (genero == "Masculino") {
            int seletorNome = random.nextInt(nomesMasHalf.length);
            int seletorSobre = random.nextInt(sobrenomesHalf.length);
            nome = nomesMasHalf[seletorNome] + " " + sobrenomesHalf[seletorSobre];
        }

        if (genero == "Feminino") {
            int seletorNome = random.nextInt(nomesFemHalf.length);
            int seletorSobre = random.nextInt(sobrenomesHalf.length);
            nome = nomesFemHalf[seletorNome] + " " + sobrenomesHalf[seletorSobre];
        }
        return nome;
    }
}
