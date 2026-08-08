## 1 - O que é uma exceção em Java?

Exceção é um evento anormal que acontece durante a execução do programa e quebra o fluxo normal das instruções (tipo dividir por zero, acessar um índice inválido de array, tentar abrir um arquivo que não existe, etc). Quando isso acontece, o Java cria um objeto de exceção e "lança" ele, interrompendo a execução normal até que algum bloco de código capture e trate esse erro.

## 2 - Checked ou Unchecked

Exceção e Tipo:
NullPointerException é Unchecked.

IOException é Checked.

ArithmeticException é Unchecked.

FileNotFoundException é Checked.

ArrayIndexOutOfBoundsException é Unchecked.

## 3 - Explicação do código

O array numeros tem só 3 posições (índices 0, 1, 2), mas o código tenta acessar numeros[5], que não existe. Isso lança um ArrayIndexOutOfBoundsException.

Como existe um catche specífico pra essa exceção, ela é capturada e a mensagem do catch é impressa. Depois, o bloco finally sempre executa, independente de ter dado erro ou não.

Saída no console:

```
Erro: índice fora do limite!
Bloco finally executado.
```

## 4 - Por que capturar Exception genérico pode ser problemático

Capturar Exception (a classe mãe de quase tudo) faz o catch engolir qualquer tipo de erro, inclusive coisas que não foram previstas e que talvez devessem quebrar o programa mesmo (bug real). Isso esconde a causa raiz do problema, dificulta o debug e pode mascarar erros graves como se fossem algo tratável.

