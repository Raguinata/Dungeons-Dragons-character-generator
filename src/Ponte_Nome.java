
import racas.Anao;
import racas.Draconato;
import racas.Elfo;
import racas.Gnomo;
import racas.Halfling;
import racas.Humano;
import racas.Meio_Elfo;
import racas.Meio_Orc;
import racas.Tiefling;

public class Ponte_Nome {

    public static String sorteioNome (String raca, String genero, String etnia) {
        String nome = " ";

        if (raca == "Anão") {
            nome = Anao.nomeAnao(genero);
        }

        else if (raca == "Draconato") {
            nome = Draconato.nomeDraconato(genero);
        }

        else if (raca == "Elfo") {
            nome = Elfo.nomeElfo(genero);
        }

        else if  (raca == "Gnomo") {
            nome = Gnomo.nomeGnomo(genero);
        }

        else if (raca == "Halfiling") {
            nome = Halfling.nomeHalfling(genero);
        }

        else if (raca == "Humano") {
            nome = Humano.nomeHumano(genero, etnia);
        }

        else if (raca == "Meio-Elfo") {
            nome = Meio_Elfo.nomeMeio_Elfo(genero);
        }

        else if (raca == "Meio-Orc") {
            nome = Meio_Orc.nomeMeio_Orc(genero);
        }

        else if (raca == "Tiefiling") {
            nome = Tiefling.nomeTiefling(genero);
        }
        return nome;
    }

    public static String sorteioNomeInfancia (String raca) {
        String nomeInfancia = " ";

        if (raca == "Elfo") {
            nomeInfancia = Elfo.nomeInfanciaElfo(); 
        }

        else if  (raca == "Gnomo") {
            nomeInfancia = Gnomo.nomeInfanciaGnomo();
        }

        else if (raca == "Tiefiling") {
            nomeInfancia = Tiefling.nomeInfanciaTiefling();
        }

        return nomeInfancia;
    }
}