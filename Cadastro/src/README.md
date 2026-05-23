# Atividade Prática - Gerenciamento de Produtos

Repositório criado para a atividade prática da disciplina de Linguagem de Programação II.

## Respostas das Questões Teóricas

### 1. Qual a diferença entre atributo de instância e atributo estático?
* **Atributo de instância:** É uma variável que pertence individualmente a cada objeto criado. Cada produto tem o seu próprio nome, preço e quantidade. Se você alterar o preço do "Refri", o preço do "Salgadinho" não muda.
* **Atributo estático:** É uma variável que pertence à classe como um todo e é compartilhada por todos os objetos. No nosso sistema, a variável `contagem` é estática; isso significa que existe apenas um contador global que armazena o total de produtos cadastrados, independente de quais produtos existam.

### 2. Por que utilizamos atributos `private`?
Utilizamos o modificador `private` para aplicar o princípio do **Encapsulamento**. Isso impede que o estado interno do objeto seja modificado diretamente de forma externa e descontrolada pela classe de teste (`Programa.java`). A única forma de ler ou modificar os atributos passa a ser através dos métodos públicos (`getters` e `setters`), garantindo a segurança dos dados.

### 3. O que aconteceria se os atributos fossem `public`?
Se os atributos fossem públicos, qualquer parte do código poderia alterá-los sem validação. Por exemplo, seria possível definir o preço de um produto como `R$ -50.00` ou a quantidade como `-10`, quebrando completamente as regras de negócio exigidas pelo sistema (preço e quantidade não podem ser negativos).

### 4. Qual a função do construtor?
A função principal do construtor é **inicializar os objetos**. Ele define os valores iniciais dos atributos e executa as validações necessárias para garantir que o objeto comece a existir em um estado válido. Além disso, foi usado para atualizar automaticamente o nosso contador estático de produtos.

### 5. Como o encapsulamento ajuda na manutenção do sistema?
O encapsulamento isola a lógica de validação dentro da própria classe. Se amanhã a regra de negócio mudar (por exemplo, se o preço mínimo de qualquer produto passar a ser `R$ 1,00`), só seria preciso alterar a validação dentro do método `setPreco` da classe `Produto`. Nenhuma outra classe que consome o seu código precisará ser reescrita ou corrigida, reduzindo drasticamente o risco de bugs no sistema.