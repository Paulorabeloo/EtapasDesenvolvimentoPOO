## Conceito de POO
Você já ouviu falar a expressão, linguagem de baixo e de alto nível?

À medida que a tecnologia vem evoluindo, as linguagens de programação também, e é esta transição natural, que determina, quando estamos nos referindo a linguagem de baixo e alto nível.

Baixo nível: São linguagens que estão mais próximas, da interpretação da máquina, diante do algoritmo desenvolvido. Exemplo: Linguagem Assembly e C.

Alto nível: São linguagens que disponibilizam, uma proposta de sintaxe (forma de escrever processos para serem executados pelo computador) mais próxima de interpretação humana. Exemplo: Java, JavaScript, Python e C++.

## Programação estruturada
A programação estruturada é um paradigma de programação, que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um programa de computador, fazendo uso extensivo, das construções de fluxo de controle estruturado de seleção ( if / then / else ) e repetição (while e for ), estruturas de bloco e sub - rotinas .

O que devemos ter em mente, é que na programação estruturada, implementamos algoritmos com estruturas sequenciais denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo local ou global em uma aplicação.

## Programação orientada a objetos
POO é um paradigma de programação, baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

O que precisamos entender, é que cada vez mais as linguagens se adequam ao cenário real, proporcionando assim, que o programador desenvolva algoritmos mais próximo de fluxos comportamentais, logo, tudo ao nosso redor é representado como Objeto.

## Classes
Toda a estrutura de código, na linguagem Java é distribuído em arquivos, com extensão .java denominados de classe.

As classes existentes em nosso projeto, serão composta por:

Identificador, Características e Comportamentos.

Classe (class): A estrutura e/ou representação que direciona a criação dos objetos de mesmo tipo.

Identificador (identity): Propósito existencial aos objetos que serão criados.

Características (states): Também conhecido como atributos ou propriedades, é toda informação que representa o estado do objeto.

Comportamentos (behavior): Também conhecido como ações ou métodos, é toda parte comportamental que um objeto dispõe.

Instanciar (new): É o ato de criar um objeto a partir de estrutura, definida em uma classe.

### Para ilustrar as etapas de desenvolvimento, orientada a objetos em Java, iremos reproduzir a imagem acima em forma de código, para explicar que primeiro criamos a estrutura correspondente, para assim podermos criá-los com as características e a possibilidade de realização de ações (comportamentos), como se fosse no "mundo real".

![image](https://github.com/user-attachments/assets/eae099b3-c962-44e3-81a9-89bf688e9345)

Seguindo algumas convenções, as nossas classes são classificadas como:

Classe de modelo (model): classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.

Classe de serviço (service): classes que contém regras de negócio e validação de nosso sistema.

Classe de repositório (repository): classes que contém uma integração com banco de dados.

Classe de controle (controller): classes que possuem a finalidade de disponibilizar alguma comunicação externa, à nossa aplicação, como http web ou webservices.

Classe utilitária (util): classe que contém recursos comuns, à toda nossa aplicação.

![image](https://github.com/user-attachments/assets/bd8bb6be-8d50-48be-a43c-d4c6717612d6)

## Pacotes

A linguagem Java, é composta por milhares de classes, com as finalidades de por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão com banco de dados, entre outras. Imagina todas estas classes, existindo em um único nível de documentos? E as classes desenvolvidas por nós, meros desenvolvedores, de aplicações de vários os gêneros? Imagina como ficaria este diretório hein!?

![image](https://github.com/user-attachments/assets/feb10465-f8cb-4ff5-aba0-8c8d77b6912c)

Para prevenir este acontecimento, a linguagem dispõe de um recurso, que organiza as classes padrões criadas por nós, que conhecemos como pacote (package). Os pacotes são subdiretórios, a partir da pasta src do nosso projeto, onde estão localizadas, as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizadas no mercado.

![image](https://github.com/user-attachments/assets/b909524d-2976-4619-9808-89b619fb7a49)

## Nomenclatura
Vamos imaginar, que sua empresa se chama Power Soft e ela está desenvolvendo software comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

Comercial : com.powersoft;

Governamental : gov.powersoft;

Código aberto: org.powersoft.

Bem, acima já podemos perceber que existe uma definição, para o uso do nome dos pacotes, porém, podemos organizar ainda mais um pouco as nossas classes, mediante a proposta de sua existência:

model : Classes que representam a camada e modelo da aplicação : Cliente, Pedido, NotaFiscal, Usuario;

repository: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;

service: Classes que contém regras de negócio do sistema : ClienteService possui o método validar o CPF, do cliente cadastrado;

controller: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicação, para outras aplicações via padrão HTTP;

view: Classes que possuem alguma interação, com a interface gráfica acessada pelo usuário;

util: Pacote que contém, classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.

## Identificação
Uma das características de uma classe é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (próprio nome) e agora o nome qualificado (endereçamento do pacote + nome), exemplo: Considere a classe Usuario, que está endereçada no pacote com.controle.acesso.model, o nome qualificado desta classe é 
com.controle.acesso.model.Usuario
.

## Package versus Import
A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém, uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:

package

import ... 
import ...

public class MinhaClasse {
}

## Por que é tão importante compreender de pacotes?
A linguagem Java, é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.

É nesta hora, que nós desenvolvedores precisamos detectar, qual classe iremos importar em nosso projeto.

Um exemplo clássico é, a existência das classes 
java.sql.Date
 e 
java.util.Date
 da própria linguagem, recomendo você leitor, pesquisar sobre a diferença das duas classes.




