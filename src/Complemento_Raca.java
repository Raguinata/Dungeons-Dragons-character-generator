import java.util.Random;

public class Complemento_Raca {

    public static String sorteioNome (String raca, String genero) {
        Random random = new Random();
        String nome = " ";
        
        switch (raca) {
            case "Anão":
                String nomesMasAnao [] = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor",
                "Dain", "Darrak", "Delg", "Eberk", "Einkil","Fargrim", "Flint", "Gardain", "Harbek", "Kildrak",
                "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek",
                "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"};

                String nomesFemAnao [] = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth",
                "Falkrunn", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa",
                "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"};

                String sobrenomesAnao [] = {"Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge",
                "Frostbeard","Gorunn", "Holderhek","Ironfist", "Loderr", "Lutgehr", "Rumnaheim", "Strakeln",
                "Torunn", "Ungart"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasAnao.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesAnao.length)+1;
                    nome = nomesMasAnao[seletorNome] + " " + sobrenomesAnao[seletorSobre];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemAnao.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesAnao.length)+1;
                    nome = nomesFemAnao[seletorNome] + " " + sobrenomesAnao[seletorSobre];
                }

            break;

            case "Elfo":
                String nomesMasElfo [] = {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric",
                "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios",
                "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior",
                "Tharivol", "Theren", "Varis"};

                String nomesFemElfo [] = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna",
                "Birel","Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth","Keyleth", "Leshanna",
                "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava",
                "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe","Xanaphia"};

                String sobrenomesElfo [] = {"Amakiir", "Amastacia", "Galanodel", "Holimion",
                "Ilphelkiir", "Liadon","Meliamne", "Nailo", "Siannodel", "Xiloscient"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasElfo.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesElfo.length)+1;
                    nome = nomesMasElfo[seletorNome] + " " + sobrenomesElfo[seletorSobre];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemElfo.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesElfo.length)+1;
                    nome = nomesFemElfo[seletorNome] + " " + sobrenomesElfo[seletorSobre];
                }
            break;

            case "Halfling":
                String nomesMasHalf [] = {"Alton", "Ander", "Cade", "Corrin", "Eldon","Errich", "Finnan",
                "Garret", "Lindal", "Lyle", "Merric", "Milo","Osborn", "Perrin", "Reed", "Roscoe", "Wellby"};

                String nomesFemHalf [] = {"Andry", "Bree", "Callie", "Cora", "Euphemia","Jillian", "Kithri", "Lavinia",
                "Lidda", "Merla", "Nedda", "Paela","Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"};

                String sobrenomesHalf [] = {"Cata-Escovas", "Bom-Barril", "Garrafa Verde", "Alta Colina", "Baixa Colina",
                "Prato Cheio", "Folha de Chá", "Espinhudo", "Cinto Frouxo", "Galho Caído"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasHalf.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesHalf.length)+1;
                    nome = nomesMasHalf[seletorNome] + " " + sobrenomesHalf[seletorSobre];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemHalf.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesHalf.length)+1;
                    nome = nomesFemHalf[seletorNome] + " " + sobrenomesHalf[seletorSobre];
                }

            break;

            case "Humano":
                String nomesMasHumano [] = {};

                String nomesFemHumano [] = {};

                String sobrenomesHumano [] = {};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasHumano.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesHumano.length)+1;
                    nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemHumano.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesHumano.length)+1;
                    nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
                }

            break;

            case "Draconato": 
                String nomesMasDraco [] = {"Arjhan", "Balasar", "Bharash", "Donaar","Ghesh", "Heskan",
                "Kriv", "Medrash", "Mehen", "Nadarr","Pandjed", "Patrin", "Rhogar", "Shamash",
                "Shedinn", "Tarhun","Torinn"};

                String nomesFemDraco [] = {"Akra", "Biri", "Daar", "Farideh", "Harann","Flavilar", "Jheri",
                "Kava", "Korinn", "Mishann", "Nala", "Perra","Raiann", "Sora", "Surina", "Thava", "Uadjit"};

                String sobrenomesDraco [] = {"Clethtinthiallor", "Daardendrian","Delmirev", "Drachedandion",
                "Fenkenkabradon","Kepeshkmolik", "Kerrhylon", "Kimbatuul","Linxakasendalor", "Myastan",
                "Nemmonis", "Norixius","Ophinshtalajiir", "Prexijandilin", "Shestendeliath","Turnuroth",
                "Verthisathurgiesh", "Yarjerit"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasDraco.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesDraco.length)+1;
                    nome = nomesMasDraco[seletorNome] + " " + sobrenomesDraco[seletorSobre];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemDraco.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesDraco.length)+1;
                    nome = nomesFemDraco[seletorNome] + " " + sobrenomesDraco[seletorSobre];
                }

                break;

            }

        return nome;
    }
}


