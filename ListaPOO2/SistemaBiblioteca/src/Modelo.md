# Atividade 2 – Estudo de Caso: Sistema de Biblioteca

---

## Classes implementadas

- **Autor** — representa o autor de um livro
- **Livro** — representa um título do acervo da biblioteca
- **Exemplar** — representa uma cópia física de um livro
- **Funcionario** — representa um funcionário da biblioteca
- **Emprestimo** — representa o registro de um empréstimo

---

## Identificação dos relacionamentos

### Composição: Exemplar → Livro

A relação entre Exemplar e Livro foi definida como composição, já que um exemplar é uma cópia física de um livro e não possui razão de existir fora do contexto daquele livro. Se o livro for removido do sistema, os exemplares a ele associados também serão removidos.

---

### Agregação: Livro → Autor

A relação entre Livro e Autor foi definida como agregação. O autor existe independentemente do livro, ele pode ter escrito outras obras, pode existir no sistema sem estar vinculado a nenhum livro naquele momento, e continua existindo mesmo que um livro seja removido.

---

### Agregação: Emprestimo → Exemplar e Funcionario

Os relacionamentos entre Emprestimo e as classes Exemplar e Funcionario foram definidos como agregação. Tanto o exemplar quanto o funcionário existem de forma independente no sistema, um funcionário pode existir sem ter realizado nenhum empréstimo, e um exemplar pode estar disponível sem estar associado a nenhum empréstimo.
