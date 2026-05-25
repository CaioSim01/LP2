# Lista de Exercícios I - Conceitos de POO

Repositório destinado à resolução da primeira lista de exercícios teóricos da disciplina de Linguagem de Programação II.

## Questões Teóricas

### 1) O que é um paradigma de programação?
É uma abordagem, estilo ou modelo conceitual de como estruturar, organizar e escrever o código de um programa de computador. O paradigma define as regras, os princípios e os métodos que o programador deve seguir para resolver um problema de software.

### 2) Cite os principais paradigmas de programação.
* **Paradigma Imperativo / Procedural** (focado em procedimentos e sequência de comandos, ex: C, Pascal).
* **Paradigma Orientado a Objetos - POO** (focado em objetos que interagem entre si, ex: Java, C++).
* **Paradigma Funcional** (focado na avaliação de funções matemáticas e dados imutáveis, ex: Haskell, Lisp).
* **Paradigma Declarativo** (focado no que o programa deve fazer, e não em como fazer, ex: SQL).

### 3) O que é programação orientada a objetos? E quais suas vantagens?
É um paradigma de programação que utiliza a abstração para modelar o mundo real através de "objetos" interativos. Cada objeto possui suas próprias características (atributos/dados) e ações que pode executar (métodos/comportamentos).

**Vantagens:**
* **Reutilização de código:** Permite usar classes criadas anteriormente em novos projetos (via herança e composição).
* **Modularidade:** O código fica dividido em partes menores e independentes, facilitando a manutenção e a correção de erros.
* **Flexibilidade:** Através do polimorfismo, objetos diferentes podem responder à mesma mensagem de formas específicas.
* **Segurança (Encapsulamento):** Protege os dados internos de um objeto de modificações externas indevidas.

### 4) O que é abstração?
A abstração é o processo mental de isolar as características essenciais de um objeto do mundo real para o contexto do sistema, descartando os detalhes irrelevantes. Por exemplo, para um sistema de concessionária, a cor e a placa do carro importam; para um sistema de fábrica, o torque do motor e o fornecedor das peças são mais importantes.

### 5) O que é uma classe?
Uma classe é um molde ou modelo que define as características (atributos) e comportamentos (métodos) que os objetos criados a partir dela possuirão. Ela não representa um objeto em si, mas sim a estrutura que dará origem a ele (instanciação).


### 6) Como base nos conceitos apresentados em sala de aula identifique características e comportamentos dos objetos ilustrados nas figuras abaixo.

#### CARRO
| Característica | Comportamento                           |
| :--- |:----------------------------------------|
| Marca, Modelo, Cor, Placa | Acelerar, Frear , Passar/Reduzir Marcha |

#### CELULAR
| Característica                        | Comportamento                               |
|:--------------------------------------|:--------------------------------------------|
| Marca, Modelo, Armazenamento, Bateria | Ligar/Desligar, Tirar foto, Mandar Mensagem |

#### CÃO
| Característica                | Comportamento               |
|:------------------------------|:----------------------------|
| Raça, Nome, Cor do pelo, Peso | Latir, Correr, Comer, Dormir|

#### PROFESSOR
| Característica | Comportamento                                            |
| :--- |:---------------------------------------------------------|
| Nome, CPF, Matrícula, Disciplina, Salário | Dar aula, Corrigir atividade, Lançar nota, Fazer chamada |

#### TELEVISÃO
| Característica                      | Comportamento |
|:------------------------------------| :--- |
| Marca, Polegadas, Voltagem , Modelo | Ligar/Desligar, Mudar canal, Aumentar volume, Diminuir volume |

#### DISQUETE
| Característica | Comportamento |
| :--- | :--- |
| Capacidade (MB), Marca | Ler dados, Gravar dados, Formatar, Ejetar |