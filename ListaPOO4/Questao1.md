Questão 1 — Explique a diferença entre uma classe abstrata e uma interface em Java considerando os seguintes aspectos:

Objetivo
Classe abstrata: representa um conceito comum a subclasses que compartilham identidade e estado.
Interface: define um contrato de comportamento que as classes podem assumir.

Instanciação
Nenhuma das duas pode ser instanciada diretamente, só objetos de classes concretas que estendem uma classe abstrata ou implementam uma interface podem existir.

Métodos
Classe abstrata: pode ter métodos abstratos (sem corpo) e métodos concretos (com implementação).
Interface: pode ter métodos abstratos (implícitos), métodos default (com implementação) e métodos static.

Atributos
Classe abstrata: pode ter atributos de instância normais (protected, private etc.), com estado que muda por objeto.
Interface: só pode ter atributos que são implicitamente public static final (constantes), não guarda estado de instância.

Herança
Classe abstrata: uma classe só pode estender uma classe abstrata.
Interface: uma classe pode implementar várias simulando uma herança multipla de comportamentos.
