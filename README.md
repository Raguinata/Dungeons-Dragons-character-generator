# Projeto de Geração de Personagens para RPG's no Sistema Dungens&Dragons (PGPRSDD)

Olá! É um prazer ajudá-lo a entender melhor esse projeto incrível chamado **PGPRSDD**. Trata-se de um programa especialmente desenvolvido para gerar personagens aleatórios para jogos de RPG que utilizam o sistema de Dungeons & Dragons. Se você é fã de jogos de fantasia, tenho certeza de que vai adorar essa ferramenta!

O objetivo principal do **PGPRSDD** é facilitar a criação de personagens para os jogadores. Ele permite que você defina a quantidade de personagens que deseja gerar e, em seguida, o programa gera informações como gênero, raça, classe e nome para cada um dos personagens de forma completamente aleatória. É uma maneira divertida de adicionar variedade e surpresa aos seus jogos, seguindo as regras estabelecidas no famoso livro Dungeons & Dragons.

Com a ajuda do **PGPRSDD**, você não precisa se preocupar em criar todos os detalhes dos personagens manualmente. Ele automatiza o processo e oferece resultados rápidos e consistentes. Você pode gerar tantos personagens quanto desejar e usar essas informações como ponto de partida para desenvolver histórias envolventes e emocionantes.

Então, se você está procurando uma forma prática e divertida de criar personagens para o seu próximo jogo de RPG, o **PGPRSDD** é exatamente o que você precisa. Divirta-se explorando a variedade de combinações que podem surgir e mergulhe em aventuras épicas com seus novos personagens!

Se você tiver alguma dúvida ou precisar de ajuda durante o uso do programa, estarei aqui para auxiliá-lo.

# Como utilizar o programa

### Para utilizar o programa, siga as seguintes etapas:

1- Execute a classe Main para iniciar o programa.

2- Será exibida uma janela de diálogo para inserir a quantidade de personagens que deseja criar. Digite um valor inteiro e clique em "OK".

3- O programa irá gerar os personagens aleatórios com base nos parâmetros definidos e exibirá as informações na tela.

# Classes

### Classe Main

A classe Main contém o método main que é o ponto de entrada do programa. Nessa classe, é feita a interação com o usuário para obter a quantidade de personagens desejada. Em seguida, o programa chama os métodos de sorteio para gerar as informações dos personagens e exibe os resultados em uma janela de diálogo.

### Classe Ponte_Nome

A classe Ponte_Nome contém os métodos responsáveis por gerar os nomes dos personagens com base na raça, gênero e etnia fornecidos. Os métodos sorteioNome e sorteioNomeInfancia são utilizados para gerar o nome principal e o nome de infância (apenas para algumas raças específicas), respectivamente.

### Classe Sorteios

A classe Sorteios contém métodos para realizar sorteios aleatórios de gênero, raça, classe e etnia para os personagens. Esses métodos são utilizados pela classe Main para obter as informações aleatórias dos personagens.

### Pacote "racas"

O pacote "racas" contém classes específicas para cada raça disponível no programa. Cada classe de raça possui métodos para gerar nomes específicos para essa raça, com base no gênero fornecido.

# Contribuição

Este projeto foi desenvolvido por Raguinata e está disponível no GitHub em https://github.com/Raguinata/Dungeons-Dragons-character-generator.
