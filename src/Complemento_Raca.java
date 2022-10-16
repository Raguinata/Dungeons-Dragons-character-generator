import java.util.Random;

public class Complemento_Raca {

    public static String sorteioNome (String raca, String genero, String etnia) {
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

            if (etnia == "Calishita") {
                String nomesMasHumano [] = {"Aseir", "Bardeid", "Haseid",
                    "Khemed", "Mehmen", "Sudeiman", "Zasheir"};

                String nomesFemHumano [] = {"Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora",
                    "Yasheira", "Zasheida"};

                String sobrenomesHumano [] = {"Basha", "Dumein", "Jassan", "Khalid", "Mostana", "Pashar", "Rein"};

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
            }

            else if (etnia == "Chondathano") {
                String nomesMasHumano [] = {"Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn",
                    "Randal", "Stedd"};

                String nomesFemHumano [] = {"Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan",
                    "Shandri", "Tessele"};

                String sobrenomesHumano [] = {"Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag"};

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
            }

            else if (etnia == "Damarano") {
                String nomesMasHumano [] = {"Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival",
                    "Orel", "Pavel", "Sergor"};

                String nomesFemHumano [] = {"Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora"};

                String sobrenomesHumano [] = {"Bersk", "Chernin", "Dotsk", "Kulenov", "Marsk", "Nemetsk", "Shemov", "Starag"};

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
            }

            else if (etnia == "Illuskano") {
                String nomesMasHumano [] = {"Ander", "Blath", "Bran", "Frath", "Geth", "Lander",
                    "Luth", "Malcer", "Stor", "Taman", "Urth"};

                String nomesFemHumano [] = {"Amafrey", "Betha", "Cefrey", "Kethra",
                    "Mara", "Olga", "Silifrey", "Westra"};

                String sobrenomesHumano [] = {"Brightwood", "Helder", "Hornraven", "Lackman",
                    "Stormwind", "Windrivver"};

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
            }

            else if (etnia == "Mulano") {
                String nomesMasHumano [] = {"Aoth", "Bareris", "Ehput-Ki", "Kethoth", "Mumed", "Ramas",
                    "So-Kehur", "Thazar-De", "Urhur"};

                String nomesFemHumano [] = {"Arizima", "Chathi", "Nephis", "Nulara", "Murithi",
                    "Sefris", "Thola", "Umara", "Zolis"};

                String sobrenomesHumano [] = {"Ankhalab", "Anskuld", "Fezim", "Hahpet", "Nathandem",
                    "Sepret", "Uuthrakt"};

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
            }

            else if (etnia == "Rashemita") {
                String nomesMasHumano [] = {"Borivik", "Faurgar", "Jandar", "Kanithar", "Madislak",
                    "Ralmevik", "Shaumar", "Vladislak"};

                String nomesFemHumano [] = {"Fyevarra", "Hulmarra", "Immith", "Imzel", "Navarra",
                    "Shevarra", "Tammith", "Yuldra"};

                String sobrenomesHumano [] = {"Chergoba", "Dyernina", "Iltazyara", "Murnyethara", "Stayanoga",
                    "Ulmokina"};

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
            }

            else if (etnia == "Shou") {
                String nomesMasHumano [] = {"An", "Chen", "Chi", "Fai", "Jiang",
                    "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen"};

                String nomesFemHumano [] = {"Bai", "Chao", "Jia", "Lei", "Mei", "Qiao", "Shui", "Tai"};

                String sobrenomesHumano [] = {"Chien", "Huang", "Kao", "Kung", "Lao", "Ling",
                    "Mei", "Pin", "Shin", "Sum", "Tan", "Wan"};

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
            }

            else if (etnia == "Tethyriano") {
                String nomesMasHumano [] = {"Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn",
                    "Randal", "Stedd"};

                String nomesFemHumano [] = {"Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan",
                    "Shandri", "Tessele"};

                String sobrenomesHumano [] = {"Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag"};

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
            }

            else if (etnia == "Turami") {
                String nomesMasHumano [] = {"Anton", "Diero", "Marcon", "Pieron", "Rimardo",
                    "Romero", "Salazar", "Umbero"};

                String nomesFemHumano [] = {"Balama", "Dona", "Faila", "Jalana", "Luisa",
                    "Marta", "Quara", "Selise", "Vonda"};

                String sobrenomesHumano [] = {"Agosto", "Astorio", "Calabra", "Domine", "Falone",
                    "Marivaldi", "Pisacar", "Ramondo"};

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

            case "Gnomo":
                String nomesMasGnomo [] = {"Alston", "Alvyn", "Boddynock", "Brocc",
                    "Burgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo",
                    "Gimble", "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn",
                    "Roondar", "Seebo", "Sindri", "Warryn", "Wrenn", "Zook"};

                String nomesFemGnomo [] = {"Bimpnottin", "Breena", "Caramip",
                    "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick",
                    "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda",
                    "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"};

                String sobrenomesGnomo [] = {"Beren", "Daergel", "Folkor", "Garrick", "Nackle",
                    "Murnig", "Ningel", "Raulnor", "Scheppen", "Timbers", "Turen"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasGnomo.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesGnomo.length)+1;
                    nome = nomesMasGnomo[seletorNome] + " " + sobrenomesGnomo[seletorSobre];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemGnomo.length)+1;
                    int seletorSobre = random.nextInt(sobrenomesGnomo.length)+1;
                    nome = nomesFemGnomo[seletorNome] + " " + sobrenomesGnomo[seletorSobre];
                }

            break;

            case "Meio-Elfo":
                String nomesMasMeioElfo [] = {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric",
                "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios",
                "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior",
                "Tharivol", "Theren", "Varis"};

                String nomesFemMeioElfo [] = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna",
                "Birel","Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth","Keyleth", "Leshanna",
                "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava",
                "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe","Xanaphia"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasMeioElfo.length)+1;;
                    nome = nomesMasMeioElfo[seletorNome];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemMeioElfo.length)+1;;
                    nome = nomesFemMeioElfo[seletorNome];
                }

            break;

            case "Meio-Orc": 
            String nomesMasMeioOrc [] = {"Dench", "Feng", "Gell", "Henk",
                "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump",
                "Thokk"};

                String nomesFemMeioOrc [] = {"Baggi", "Emen", "Engong", "Kansif",
                    "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola",
                    "Volen", "Yevelda"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasMeioOrc.length)+1;
                    nome = nomesMasMeioOrc[seletorNome];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemMeioOrc.length)+1;
                    nome = nomesFemMeioOrc[seletorNome];
                }

            break;

            case "Tiefling":
            String nomesMasTief [] = { "Akmenos", "Amnon",
                "Barakas", "Damakos", "Ekemon", "Iados", "Kairon", "Leucis",
                "Melech", "Mordai", "Morthos", "Pelaios", "Skamos", "Therai"};

                String nomesFemTief [] = { "Akta", "Anakis", "Bryseis",
                    "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria",
                    "Nemeia", "Orianna", "Phelaia", "Rieta"};

                if (genero == "Masculino") {
                    int seletorNome = random.nextInt(nomesMasTief.length)+1;
                    nome = nomesMasTief[seletorNome];
                }

                if (genero == "Feminino") {
                    int seletorNome = random.nextInt(nomesFemTief.length)+1;
                    nome = nomesFemTief[seletorNome];
                }

            break;
            }
        return nome;
    }

    public static String nomeInfancia(String raca) {
        Random random = new Random();
        String nome = " ";

        switch (raca) {

            case "Elfo":
                String nomeInfElfo[] = { "Ara", "Bryn", "Del", "Eryn", "Faen", "Innil", "Lael",
                        "Mella", "Naill", "Naeris", "Phann", "Rael", "Rinn", "Sai", "Syllin",
                        "Thia", "Vall" };

                int seletornome = random.nextInt(nomeInfElfo.length) + 1;
                nome = "# Nome de Infância: " + nomeInfElfo[seletornome];

                break;

            case "Gnomo":
                String apelidoGnomo[] = { "Beberrão", "Pó de Coração", "Texugo", "Manto",
                        "Tranca-Dupla", "Bate-Carteira", "Fnipper", "Ku", "Nim", "Um Sapato",
                        "Pústula", "Gema Faiscante", "Pato Desajeitado" };

                seletornome = random.nextInt(apelidoGnomo.length) + 1;
                nome = "# Apelido: " + apelidoGnomo[seletornome];

                break;

            case "Tiefling":
                String nomeHonradoTiefling[] = { "Abertura", "Arte", "Carniça", "Canção",
                        "Crença", "Desespero", "Excelência", "Esperança", "Gloria",
                        "Ideal", "Ímpeto", "Música", "Nada", "Poesia", "Medo", "Missão",
                        "Penoso", "Reverencia", "Mágoa", "Temeridade", "Tormenta" };

                seletornome = random.nextInt(nomeHonradoTiefling.length) + 1;
                nome = "# Nome Honrado: " + nomeHonradoTiefling[seletornome];
                break;
        }
        return nome;
    }
}
