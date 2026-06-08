# Atividade 1 – Análise Conceitual: Composição ou Agregação

---

## Classificação dos Relacionamentos

### a) Universidade e Departamentos → Composição

Os departamentos existem como componentes institucionais apenas dentro da universidade. Se a universidade deixar de existir, não faz sentido os departamentos continuarem existindo.

---

### b) Computador e Processador → Composição

Embora fisicamente seja possível remover um processador. O processador é uma parte essencial do computador, então ele não possui função independente quando está definido como componente do computador.


### c) Professor e Projetor → Agregação

O projetor é um recurso que existe independentemente de qualquer professor. Um professor pode usar o projetor durante uma aula, mas o equipamento continua existindo antes, durante e depois do uso com aquele professor.

---

### d) Carro e Motor → Composição
Assim como o processador no computador, o motor é uma parte essencial do carro enquanto objeto. Se o Carro é destruído no sistema, o Motor daquele carro não tem motivo continuar existindo.

### e) Cliente e Endereços → Agregação

O endereço possui existência independente da pessoa. Um endereço pode ser compartilhado entre várias pessoas mas a pessoa continua existindo mesmo que perca ou mude seu endereço.

---

## O que acontece com os objetos componentes quando o objeto principal é destruído?

- Composição: Os objetos componentes são destruídos junto com o objeto principal. Isso significa que o objeto componente é instanciado dentro do construtor do objeto principal, e a destruição do objetivo principal ocasiona na destruição desse objeto componente.

- Agregação: Os objetos componentes continuam existindo de forma independente após a destruição do objeto principal. Isso geralmente se observa como um objeto recebido por parâmetro no construtor do objeto principal, mas não é instanciado dentro dele.

