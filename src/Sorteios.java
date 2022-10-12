import java.util.Random;

public class Sorteios {

    public static String sorteioGenero () {
        Random random = new Random();
        int seletor = 0;
        String genero = " ";

        seletor = random.nextInt(2)+1;

        if (seletor == 1) {
            genero = "Masculino";
            return genero;
        }
        if (seletor == 2) {
            genero = "Feminino";
            return genero;
        }
        return genero;
    }

    public static String sorteioRaca () {
        Random random = new Random();
        int seletor = 0;
        String raca = " ";
        String racasExistentes [] = {"Anão", "Elfo", "Halfling", "Humano", "Draconato", "Gnomo",
        "Meio-Elfo", "Meio-Orc", "Tiefling"};

        seletor = random.nextInt(racasExistentes.length);

        for (int i = 0; i < racasExistentes.length; i++) {
            if (i == seletor) {
                raca = racasExistentes[i];
            }
        }
        return raca;
    }

    public static String sorteioClasse () {
        Random random = new Random();
        int seletor = 0;
        String classe = " ";
        String classesExistentes [] = {"Bárbaro", "Bardo", "Bruxo", "Clérigo", "Druida", "Feiticeiro",
        "Guerreiro", "Ladino", "Mago", "Monge","Paladino", "Patrulheiro"};
        

        seletor = random.nextInt(classesExistentes.length);

        for (int i = 0; i < classesExistentes.length; i++) {
            if (i == seletor) {
                classe = classesExistentes[i];
            } 
    }

    return classe;
}
    // public static String etiniaHumano() {
    //  return;
    //}
}

