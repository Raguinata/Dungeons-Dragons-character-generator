package racas;
import java.util.Random;

public class Humano {

    public static String nomeHumano(String genero, String etnia) {
        Random random = new Random();
        String nome = " ";

        if (etnia == "Calishita") {
            String nomesMasHumano[] = { "Aseir", "Bardeid", "Haseid",
                    "Khemed", "Mehmen", "Sudeiman", "Zasheir" };

            String nomesFemHumano[] = { "Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora",
                    "Yasheira", "Zasheida" };

            String sobrenomesHumano[] = { "Basha", "Dumein", "Jassan", "Khalid", "Mostana", "Pashar", "Rein" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Chondathano") {
            String nomesMasHumano[] = { "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn",
                    "Randal", "Stedd" };

            String nomesFemHumano[] = { "Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan",
                    "Shandri", "Tessele" };

            String sobrenomesHumano[] = { "Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Damarano") {
            String nomesMasHumano[] = { "Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival",
                    "Orel", "Pavel", "Sergor" };

            String nomesFemHumano[] = { "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora" };

            String sobrenomesHumano[] = { "Bersk", "Chernin", "Dotsk", "Kulenov", "Marsk", "Nemetsk", "Shemov",
                    "Starag" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Illuskano") {
            String nomesMasHumano[] = { "Ander", "Blath", "Bran", "Frath", "Geth", "Lander",
                    "Luth", "Malcer", "Stor", "Taman", "Urth" };

            String nomesFemHumano[] = { "Amafrey", "Betha", "Cefrey", "Kethra",
                    "Mara", "Olga", "Silifrey", "Westra" };

            String sobrenomesHumano[] = { "Brightwood", "Helder", "Hornraven", "Lackman",
                    "Stormwind", "Windrivver" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Mulano") {
            String nomesMasHumano[] = { "Aoth", "Bareris", "Ehput-Ki", "Kethoth", "Mumed", "Ramas",
                    "So-Kehur", "Thazar-De", "Urhur" };

            String nomesFemHumano[] = { "Arizima", "Chathi", "Nephis", "Nulara", "Murithi",
                    "Sefris", "Thola", "Umara", "Zolis" };

            String sobrenomesHumano[] = { "Ankhalab", "Anskuld", "Fezim", "Hahpet", "Nathandem",
                    "Sepret", "Uuthrakt" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Rashemita") {
            String nomesMasHumano[] = { "Borivik", "Faurgar", "Jandar", "Kanithar", "Madislak",
                    "Ralmevik", "Shaumar", "Vladislak" };

            String nomesFemHumano[] = { "Fyevarra", "Hulmarra", "Immith", "Imzel", "Navarra",
                    "Shevarra", "Tammith", "Yuldra" };

            String sobrenomesHumano[] = { "Chergoba", "Dyernina", "Iltazyara", "Murnyethara", "Stayanoga",
                    "Ulmokina" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Shou") {
            String nomesMasHumano[] = { "An", "Chen", "Chi", "Fai", "Jiang",
                    "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen" };

            String nomesFemHumano[] = { "Bai", "Chao", "Jia", "Lei", "Mei", "Qiao", "Shui", "Tai" };

            String sobrenomesHumano[] = { "Chien", "Huang", "Kao", "Kung", "Lao", "Ling",
                    "Mei", "Pin", "Shin", "Sum", "Tan", "Wan" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Tethyriano") {
            String nomesMasHumano[] = { "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn",
                    "Randal", "Stedd" };

            String nomesFemHumano[] = { "Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan",
                    "Shandri", "Tessele" };

            String sobrenomesHumano[] = { "Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }

        else if (etnia == "Turami") {
            String nomesMasHumano[] = { "Anton", "Diero", "Marcon", "Pieron", "Rimardo",
                    "Romero", "Salazar", "Umbero" };

            String nomesFemHumano[] = { "Balama", "Dona", "Faila", "Jalana", "Luisa",
                    "Marta", "Quara", "Selise", "Vonda" };

            String sobrenomesHumano[] = { "Agosto", "Astorio", "Calabra", "Domine", "Falone",
                    "Marivaldi", "Pisacar", "Ramondo" };

            if (genero == "Masculino") {
                int seletorNome = random.nextInt(nomesMasHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesMasHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }

            if (genero == "Feminino") {
                int seletorNome = random.nextInt(nomesFemHumano.length) + 1;
                int seletorSobre = random.nextInt(sobrenomesHumano.length) + 1;
                nome = nomesFemHumano[seletorNome] + " " + sobrenomesHumano[seletorSobre];
            }
        }
        return nome;
    }
}
