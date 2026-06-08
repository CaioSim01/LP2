# Atividade 1 – Análise Conceitual: Composição ou Agregação

---

## Classificação dos Relacionamentos

### a) Universidade e Departamentos → **Composição**

Os departamentos existem como entidade institucional apenas dentro de uma universidade. Se a universidade deixar de existir, não faz sentido os departamentos continuarem existindo de forma independente.

---

### b) Computador e Processador → **Composição**

Embora fisicamente seja possível remover um processador, em termos de modelagem orientada a objetos o processador é uma parte essencial do computador. Ele não possui identidade ou função independente enquanto está modelado como componente do computador.


### c) Professor e Projetor → **Agregação**

O projetor é um recurso que existe independentemente de qualquer professor. Um professor pode usar o projetor durante uma aula, mas o equipamento continua existindo antes, durante e depois do uso com aquele professor.

---

### d) Carro e Motor → **Composição**
Assim como o processador no computador, o motor é uma parte essencial e intrínseca do carro enquanto objeto modelado. Se o objeto Carro é destruído no sistema, o objeto Motor daquele carro não possui razão de existir de forma independente no modelo. A parte foi criada para existir dentro do todo.

### e) Cliente e Endereços → **Agregação**

O endereço possui existência independente da pessoa. Um endereço pode ser compartilhado entre múltiplas pessoas mas a pessoa continua existindo mesmo que perca ou mude seu endereço.

---

## O que acontece com os objetos componentes quando o objeto principal é destruído?

- **Composição:** Os objetos componentes são **destruídos junto** com o objeto principal. O ciclo de vida da parte está totalmente subordinado ao ciclo de vida do todo. Em Java, isso significa que o objeto componente é instanciado internamente e não existe referência externa a ele.

- **Agregação:** Os objetos componentes **continuam existindo** de forma independente após a destruição do objeto principal. A parte tem seu próprio ciclo de vida. Em Java, isso geralmente se manifesta como um objeto recebido por parâmetro (não instanciado internamente), que pode ser referenciado por outros objetos.

