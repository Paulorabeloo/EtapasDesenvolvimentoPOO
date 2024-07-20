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

