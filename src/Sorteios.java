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

        seletor = random.nextInt(9)+1;

        switch (seletor) {
            case 1:
                raca = "Anão";
                break;

            case 2:
                raca = "Elfo";
                break;

            case 3:
                raca = "Halfling";
                break;

            case 4:
                raca = "Humano";
                break;

            case 5:
                raca = "Draconato";
                break;

            case 6:
                raca = "Gnomo";
                break;

            case 7:
                raca = "Meio-Elfo";
                break;

            case 8:
                raca = "Meio-Orc";
                break;

            case 9:
                raca = "Tiefling";
                break;
        }
        return raca;
    }

    public static String sorteioClasse () {
        Random random = new Random();
        int seletor = 0;
        String raca = " ";

        seletor = random.nextInt(12)+1;

        switch (seletor) {
            case 1:
                raca = "Bárbaro";
                break;

            case 2:
                raca = "Bardo";
                break;

            case 3:
                raca = "Bruxo";
                break;

            case 4:
                raca = "Clérigo";
                break;

            case 5:
                raca = "Druida";
                break;

            case 6:
                raca = "Feiticeiro";
                break;

            case 7:
                raca = "Guerreiro";
                break;

            case 8:
                raca = "Ladino";
                break;

            case 9:
                raca = "Mago";
                break;

            case 10:
                raca = "Monge";
                break;

            case 11:
                raca = "Paladino";
                break;

            case 12:
                raca = "Patrulheiro";
                break;
        }
        return raca;
    }
}

