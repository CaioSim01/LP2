# Atividade LP2 — Classe Funcionario

## Questão 2 — Análise do código da classe Programa

### a) O que acontece quando a ação da linha 5 é executada?

Um novo objeto do tipo Funcionario é criado e o construtor da classe é chamado com os parâmetros passados, inicializando os atributos do objeto.

---

### b) Por que a construção das linhas 7 e 8 é permitida?

As linhas 7 e 8 acessam diretamente os atributos numRG e cpf do objeto f1. Essa construção é permitida porque esses atributos são públicos, ou seja, não possuem o modificador de acesso private. Atributos públicos podem ser acessados e modificados diretamente por qualquer outra classe, sem necessidade de métodos getters ou setters.

---

### c) A construção das linhas 9 e 10 é permitida pelo objeto funcionário? Justifique.

Não. As linhas 9 e 10 tentam acessar diretamente os atributos salario e matricula. Essa construção não é permitida, pois esses atributos são private, conforme o conceito de encapsulamento aplicado na classe Funcionario. Atributos privados não são visíveis fora da classe, portanto o acesso direto geraria um erro de compilação. A forma correta de modificá-los seria através dos métodos setters.
