[descrição original do exercício](https://github.com/rflima11/exercicios-poo2-letscode/tree/main/03%20-%20Sistema%20Livraria)

Este programa pode ser executado diretamente no navegador, [confira](https://replit.com/@MarcosTorres7/module3)!

----

# Exercício de Sistema de Livraria
Com este exercício busca-se implementar um sistema de livraria. Há duas etapas, com a segunda acrescentando duas mudanças de escopo ao projeto, tentando simular uma situação real.

## Escopo inicial
O sistema consegue cadastrar **livros**, **jogos**, **filmes**, **álbuns de música**, e **brinquedos**.

Para os gêneros dos produtos foram utilizados enums, para que as classificações ficassem restritas às pré-existentes.

## Primeira mudança de escopo
Já com o sistema funcionando, foi realizada a implantação da seguinte funcionalidade:

> Um produto pode ser adicionado com um rótulo: **destinado ao público adulto**. Neste caso para que a compra do produto seja realizada será necessária a apresentação dos documentos do comprador (**Nome**, **RG**, **CPF** e **Data de Nascimento**) se o comprador tiver menos de 18 anos a compra deve ser bloqueada.

Para implantar essa mudança, tentou-se ao máximo seguir as boas práticas de programação, especialmente os princípios de Responsabilidade Única, e Aberto-Fechado.

Em relação ao princípio Aberto-Fechado, estas foram as mudanças no programa que se fizeram necessárias:

O programa foi expandido, o que já funcionava não foi modificado.

- criou-se uma classe Buyer, para comportar os dados do comprador
- criou-se uma interface ProductForAdultAudience, que serve de "rotulador" aos produtos destinados ao público adulto
- criou-se uma classe para cada tipo de produto (livro, jogo, filme, álbum de música, brinquedo, totalizando 5 classes) que implementa a interface ProductForAdultAudience; estas serão as classes a que pertencerão os produtos destinados ao público adulto
- a classe Bookstore foi expandida com 1 novo método, executePurchaseWithRestrictions(); os métodos pré-existentes não foram alterados
- a classe Inventory contém um menu para que o usuário escolha que tipo de produto será cadastrado; tal menu não seria necessário, por exemplo, caso os produtos a ser adicionados viessem externamente de outra aplicação; como este programa é completo (minus persistência de dados, e provavelmente outras coisas também), permitindo a inserção manual de dados por parte do usuário, há menus que fazem as vezes de "frontend"; esses menus foram alterados quando se aumentou o número de opções ao usuário; não é realmente uma mudança de lógica de programação, sim uma inclusão de novas linhas de código referentes às novas opções
- assim como a classe Inventory, a classe Main também contém um menu (mostrando as opções inicias ao usuário, funcionando como "frontend" para a aplicação); uma mudança também foi realizada

## Segunda mudança de escopo
> toda compra que passar de **R$200,00** em livros deve receber um desconto de **15%**

Para implementar esta segunda mudança de escopo:
- foi criada uma classe Purchase, para melhor organizar as compras.
- foi criada a interface DiscountRule para regras de descontos, assim o programa fica expansível para outras regras de desconto diferentes
- foi criada a classe DiscountForBuyingBooks com a implementação efetiva da regra de desconto pedida

## Melhorias
- menus poderiam ser construídos a partir de enums, o que facilitaria futuras expansões
- a classe Inventory precisa ser dividida; isto será feito em breve
- usar streams em vez de for
- tratar possíveis exceções
- mostrar ao usuário os gêneros possíveis ao cadastrar um produto
- usar Set em vez de List para coleções de elementos que não possam se repetir
- implementar persistência de dados
- validar dados de entrada
- incluir mais valores para os gêneros

### Observações
- foi tentado sempre deixar o grau de visibilidade/acesso mais restrito possível às classes e aos seus membros; note-se que, em geral, para classes e seus campos, a ausência de uma keyword modificadora de visibilidade (default) é mais restritiva do que o uso do controlador de visibilidade protected, ou seja, a visibilidade dada por protected é maior (menos restritiva) do que a dada por default (sem modificador de acesso); isso pode ser contraintuitivo por isso achou-se melhor destacar
- para os gêneros dos produtos, deve-se entrar com uma das opções contidas nos enums correspondentes ao tipo do produto em questão
- ** no decorrer do desenvolvimento, melhorias foram feitas independentes das mudanças de escopo, ou seja, foram melhorias decorrentes da programação normal do código, pois sempre há o que melhorar, não devido a mudanças do escopo **
- o enunciado do exercício diz `toda compra que passar de R$200,00 em livros deve receber um desconto de 15%`; foi considerado que a compra (e não uma parte da compra) recebe o desconto em questão
- as mensagens de commit também podem ser lidas para melhor compreensão do desenvolvimento do programa
- cada mudança de escopo foi desenvolvida em uma branch separada, e depois o merge foi realizado
- a classe Inventory inicialmente estava muito grande; ela foi dividida, tentando assim seguir o SRP; tal mudança não decorreu das mudanças de escopo, foi uma refatoração que provavelmente ocorreria eventualmente
