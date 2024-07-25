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

## Visibilidade dos recursos

### Modificadores
Em Java, utilizamos três palavras reservadas e um conceito default (sem nehuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes. Iremos ilustrar do mais visível, ao mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos, através do contexto em uma lanchonete, que vende lanche natural e suco.

### Modificador public
Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.

![image](https://github.com/user-attachments/assets/42b3bff3-a20d-44cd-b96b-61d9f6910b17)

código exemplos: https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/visibilidade-dos-recursos

### Modificador default

O modificador default, está fortemente associado a organização das classes por pacotes, algumas implementações, não precisam estar disponíveis por todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.

Dentro do pacote lanchonete, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

lanchonete.atendimento.cozinha: Pacote que contém classes, da parte da cozinha da lanchonete e atendimentos.

lanchonete.area.cliente: Pacote que contém classes, relacionadas ao espaço do cliente.

![image](https://github.com/user-attachments/assets/cfd2608e-ad13-4948-857e-56ee7865dbb8)

### Modificador private

Depois de reestruturar nosso estabelecimento (projeto), onde temos as divisões (pacotes), espaço do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

Conhecemos as ações disponíveis nas classes Cozinheiro, Almoxarife, Atendente e Cliente, mesmo com a organização da visibilidade por pacote, será que realmente estas classes precisam ser tão explícitas?

- Será que o Cozinheiro precisa saber que\como o Almoxarife controla as entradas e saídas ?

- Que o Cliente precisa saber como o Atendente recebe o pedido, para servir sua mesa ?

- Que o Atendente precisa saber que antes de pagar, o Cliente consulta o saldo no App ?

Diante destes questionamentos, é que nossas classes precisam continuar mantendo suas ações (métodos), mas nem todas precisam ser vistas por ninguém.

A visibilidade de recursos da linguagem não está associada a interface gráfica, mas sim, o que as classes conseguem acessar, umas das outras.😏

### Modificador protected

Iremos explorar mais sobre este tipo de modificador de acesso, quando formos abordar a competência Pilares de POO com ênfase em Herança, OK!?

## Getters e Setters
Seguindo a convenção Java Beans:

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos, de instâncias de classes.

O método Getter, retorna o valor do atributo especificado.

O método Setter, define outro novo valor para o atributo especificado.


Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:

Os atributos precisam ter o modificador de acesso private. Ex.: private String nome;

Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos getX e setX, Ex.: getNome() e setNome(String novoNome);

O método get, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, Ex.: public String getNome() {};

O método set, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. Ex.: public void setNome(String newNome);

Uso do this no método set.

## Construtores
Sabemos que, para criar um objeto na linguagem Java, utilizamos a seguinte estrutura de código:

Classe novoObjeto = new Classe();
Desta forma, será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas vezes, já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto, defina algumas propriedades essenciais. Abaixo, iremos ilustrar uma classe Pessoa, onde a mesma terá os atributos: Nome, CPF e Endereço.


public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}

Criaremos uma Pessoa, mas como não temos o setter para nome e cpf, este objeto não tem como receber estes valores:


public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa();
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}

}
Entrando em cena o construtor, para criar nossos objetos, já com valores requeridos na momento da criação\instanciação (new):


public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;

	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//...
	//getters
	//setters
}

Alterando o nosso sistema, para agora criar o objeto com informações já requeridas, conforme definição da ordem dos parâmetros do construtor:

Copy
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//continua ...
		
	}
}

## Construtores
Sabemos que, para criar um objeto na linguagem Java, utilizamos a seguinte estrutura de código:


Classe novoObjeto = new Classe();
Desta forma, será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas vezes, já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto, defina algumas propriedades essenciais. Abaixo, iremos ilustrar uma classe Pessoa, onde a mesma terá os atributos: Nome, CPF e Endereço.


public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
Criaremos uma Pessoa, mas como não temos o setter para nome e cpf, este objeto não tem como receber estes valores:

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa();
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
Entrando em cena o construtor, para criar nossos objetos, já com valores requeridos na momento da criação\instanciação (new):

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//...
	//getters
	//setters
}
Alterando o nosso sistema, para agora criar o objeto com informações já requeridas, conforme definição da ordem dos parâmetros do construtor:


public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//continua ...
		
	}
}


## Enums
Enum, é um tipo especial de classe, onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum, quando o nosso modelo de negócio contém objetos de mesmo contexto, que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.

Exemplos:
Grau de Escolaridade: Analfabeto, Fundamental, Médio, Superior;

Estado Civil: Solteiro, Casado, Divorciado, Viúvo;

Estados Brasileiros: São Paulo, Rio de Janeiro, Piauí, Maranhão.

Não confunda uma lista de constantes com enum.

Enquanto que uma constante é uma variável de tipo com valor imutável, enum é um conjunto de objetos já pre-definidos na aplicação.

Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum, para disponibilizar os quatro estados brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega o nome do de cada estado e já retorna para todo maiúsculo.

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
Boas práticas para criar objetos Enum
As opções (objetos), devem ser descritos em caixa alta separados por underline (_), ex.: OPCAO_UM, OPCAO_DOIS;

Após as opções, deve-se encerrar com ponto e vírgula ";" ;

Um enum é como uma classe, logo, poderá ter atributos e métodos tranquilamente;

Os valores dos atributos, devem já ser definidos após cada opção, dentro de parênteses como se fosse um new;

O construtor deve ser privado;

Não é comum um enum possuir o recurso setter(alteração de propriedade), somente os métodos getters correspondentes.

Agora NÃO precisaremos, criar objetos que representam cada estado, toda vez que precisarmos destas informações, basta usar o enum acima e escolher a opção (objeto), já pré-definido em qualquer parte do nosso sistema.


// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	}
}

## UML
Linguagem de Modelagem Unificada ou UML, é uma notação, que possibilita a representação gráfica do projeto.

![image](https://github.com/user-attachments/assets/96b3e3d0-8f85-476e-8cf2-860521b5c18f)

Na UML, temos três conceitos necessários para compreendermos inicialmente:

Diagramas, elementos e relacionamentos.

![image](https://github.com/user-attachments/assets/273acaab-9c60-47e9-9a23-ca272d79f4ca)

As notações UML, são distribuídas em duas categorias de diagramas, a estrutural e comportamental conforme listagem abaixo:

### Diagramas estruturais
Diagrama de classe: O Diagrama de Classes é utilizado para fazer a representação de, estruturas de classes de negócio, interfaces e outros componentes do sistema. Por esta característica, este diagrama é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.

Diagrama de objetos: Este diagrama, representa os objetos existentes em um determinado instante ou fato na aplicação. Assim, conseguimos ter uma perspectiva do estado de nossos objetos, mediante a interação dos usuários no sistema.

Existem outras categorias de diagramas estruturais e comportamentais, porém iremos focar nos citados acima.


### Diagrama de classe
O diagrama de classes, ilustra **graficamente ** como classes serão estruturadas e interligadas entre si, diante da proposta do nosso software.

Em diagrama, a estrutura das classes é constituída por:

Identificação: Nome e/ou finalidade da classe;

Atributos: Propriedades e/ou características;

Operações: Ações e/ou métodos.


### Relacionamentos
Em um diagrama, as classes podem existir de forma independente, mas obviamente haverá, em alguma etapa da aplicação a necessidade de algumas se relacionarem, o que devemos compreender é, o nível de dependência entre elas:

Associação
Uma associação, define um relacionamento entre duas classes, permitindo que, um objeto tenha acesso a estrutura de um outro objeto.

![image](https://github.com/user-attachments/assets/3ebbfccb-d7f9-45f1-b82a-9b31a4d19799)

Agregação: Em uma agregação, a classe principal contém uma relação com outra classe, mas ela pode existir, sem a classe agregadora. Imagina um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam uma profissão:

![image](https://github.com/user-attachments/assets/826fc906-899e-497a-874b-b85ddcf33ea1)
Candidato é classe principal e a Profissão, agregação.


Composição: A composição já caracteriza uma dependência existencial, entre a classe principal e a classe associada. Imaginamos que uma admissão só poderá existir, contendo suas informações básicas e a composição do candidato selecionado.

![image](https://github.com/user-attachments/assets/9bd45c6a-9d5a-4421-a4ce-69a6c545a204)
Admissão é a classe principal e Candidato compõe a Admissão, logo este SURGIRA uma composição entre Admissão e Colaborador - ver DDD


Multiplicidade
Nem sempre o relacionamento entre as classes, será de um para um, em um determinado cenário poderá exigir multiplicidades específicas, conforme opções abaixo:

1. -> Representa uma associação, contendo um elemento;

*. -> Representa uma associação, contendo uma lista de elementos;

0..1 -> Representa uma associação, contendo zero ou um elemento;

0..* -> Representa uma associação, contendo zero ou uma lista de elementos;

1..* -> Representa uma associação. contendo um ou uma lista de elementos.

Visibilidade

Os atributos e métodos de uma classe, podem receber níveis de visibilidade, e na UML existem símbolos que representam cada um deles.

(+) Visibilidade pública;

(#) Visibilidade protegida (muito associada com herança);

(-) Visibilidade privada.

Representação

![image](https://github.com/user-attachments/assets/b188b8e9-880a-4463-af73-73d04a97f4c7)

Ilustração utilizando a ferramenta Astah Community.

Ferramentas
Existem inúmeras ferramentas de diagramação, tanto online, como pagas e gratuitas.

![image](https://github.com/user-attachments/assets/b35c7de3-c382-4bce-ad84-0c15ab7912a0)

## Pilares do POO
Programação orientada a objetos (POO, ou OOP segundo as suas siglas em inglês), é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos e códigos, na forma de procedimentos, também conhecidos como métodos.

Como se trata de, um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária, Aluno, Veículo, Transferência etc.

A programação orientada a objetos, é bem requisitada no contexto das aplicações mais atuais no mercado, devido a possibilidade de reutilização de código e a capacidade de representação do sistema, ser muito mais próximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como Os quatro pilares da orientação a objetos:

Encapsulamento: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos, com finalidades específicas que complementam uma ação em nossa aplicação.

Exemplo: Ligar um veículo, exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, dar a partida e a “magia” acontece.

Herança: Características e comportamentos comuns, podem ser elevados e compartilhados através de uma hierarquia de objetos.

Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar e frear. Logo, para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe Veículo para que seja herdada por Carro e Motocicleta.

Abstração: É a indisponibilidade, para determinar a lógica de um ou vários comportamentos, em um objeto.

Exemplo: Veículo** ** determina duas ações como acelerar e frear, logo, estes comportamentos deverão ser abstratos, pois existem mais de uma maneira de se realizar a mesma operação. ver Polimorfismo.

Polimorfismo: São as inúmeras maneiras de se realizar uma mesma ação.

Exemplo: Veículo determina duas ações como acelerar e frear, primeiramente, precisamos identificar se estaremos nos referindo a Carro** ** ou Motocicleta, para determinar a lógica de aceleração e frenagem dos respectivos veículos.

Em prática
Para ilustrar a proposta dos Princípios de POO, no nosso cotidiano, vamos simular algumas funcionalidades dos aplicativos de mensagens instantâneas pela internet.

MSN Messenger foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O serviço nasceu a 22 de julho de 1999, anunciando-se como um serviço que, permitia falar com uma pessoa através de conversas instantâneas pela internet. Ao longo dos anos, surgiram novos serviços de mensagens pela internet, como Facebook Messenger e o VKontakte Telegram.

![image](https://github.com/user-attachments/assets/8b2469ec-af25-41f4-93d9-7460baca122a)

Vamos descrever em UML e depois em código, algumas das principais funcionalidades de qualquer serviço de comunicação instantânea pela internet, inicialmente pelo MSN Messenger e depois inserindo os demais, considerando os princípios de POO.

![image](https://github.com/user-attachments/assets/0f4f3805-afab-463f-9160-d83fed1405d6)

Pontos de atenção:

Todos os métodos da classe são public (tudo realmente precisa estar visível ?);

Só existe uma única forma de se comunicar via internet (como ter novas formas de se comunicar mantendo a proposta central ?).


## Encapsulamento
Nem tudo precisa ser estar disponível para todos!

Já imaginou, você instalar o MSN Messenger e ao querer enviar uma mensagem, fosse solicitado a você, verificar se o computador está conectado a internet e depois, pedir para você salvar a mensagem no histórico? ou, se ao tentar enviar um SMS pelo celular, primeiro você precisasse consultar manualmente o seu saldo ?

Acredito que não seria uma experiência tão agradável de ser executada, recorrentemente, por nós usuários.

Mesmo ainda sendo necessária algumas etapas, nos processos citados, não é um requisito uma visibilidade pública, isso quer dizer, além da própria classe que possui a responsabilidade de uma determinada ação.

Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas privadas (private). E é ai que se caracteriza a necessidade do pilar de Encapsulamento. O que esconder ?

![image](https://github.com/user-attachments/assets/81fe3635-55f0-4859-97ca-ce5bd3ec295c)


## Herança
Nem tudo se copia, às vezes se herda.

Já imaginou, você ter sido classificado para a vaga de emprego de seus sonhos e como desafio, seria justamente você criar um diagrama de classes e em seguida os respectivos arquivos .java, que apresentasse os fundamentos de POO, com base no contexto de vários aplicativos de mensagens instantâneas? Sorte sua que você está nos acompanhando, em nossa jornada! 😜

![image](https://github.com/user-attachments/assets/1f4f0fe6-5af7-401c-8f5d-7e195a03fc36)

Com base na nossa classe MsnMessenger, você já poderia dar os primeiros passos para se dar bem no processo seletivo, simplemente, copiar e colar a estrutura, para as novas classes FacebookMessenger, Telegram.

![image](https://github.com/user-attachments/assets/84516159-1913-4c33-b7d5-947abc4f71dc)
Lamentamos dizer, mas esta não seria a melhor alternativa para a proposta citada acima.

Além de uma compreensão do desafio, é necessário que, tenhamos domínio dos pilares de POO e aplicá-los em situações iguais a esta.

NOTE: Todas as três classes, possuem a mesma estrutura comportamental e diante deste contexto, se encaixa perfeitamente o segundo pilar da POO, a Herança.

![image](https://github.com/user-attachments/assets/1a54e289-24e5-4287-a839-96e20edf58d1)

Podemos avaliar a importância de compreender os pilares de POO, para ter uma melhor implementação, reaproveitamento e reutilização de código, em qualquer contexto das nossas aplicações, mas não para por ai.

Será que todos os sistemas de mensagens, realizam as suas operações de uma mesma maneira? e agora ? este é um trabalho para os pilares Abstração e Polimorfismo.

## Abstração
Para você ser, é preciso você fazer.

Sabemos que qualquer sistema de mensagens instantâneas realiza as mesmas operações de Enviar e Receber Mensagem, dentre outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

Mas será que as ações realizadas, contém o mesmo comportamento ? Acreditamos que não.

Já imaginou a Microsoft falar para o Facebook: "Ei, toma meu código do MSN!".

O que vale destacar para compreender, é que todo e qualquer sistema de mensagem precisa sim, no mínimo Enviar e Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado.

Em Java, o conceito de abstração é representado pela palavra reservada **abstract**e métodos que NÃO possuem corpo na classe abstrata (pai).

É muito difícil falar de abstração e NÃO mencionar polimorfismo.
















