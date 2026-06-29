# ☕ Desafio HackerRank: Java Datatypes

## 📝 Descrição do Problema
O Java possui 8 tipos de dados primitivos. Neste exercício, o foco são os quatro tipos primitivos utilizados para armazenar **valores inteiros sinalizados**:

*   **Byte:** Inteiro sinalizado de 8 bits.
*   **Short:** Inteiro sinalizado de 16 bits.
*   **Int:** Inteiro sinalizado de 32 bits.
*   **Long:** Inteiro sinalizado de 64 bits.

Dado um número inteiro qualquer como entrada, o seu objetivo é determinar **todos** os tipos de dados primitivos que são capazes de armazená-lo corretamente.

---

## 📥 Formato de Entrada
*   A primeira linha contém um inteiro \(T\), que denota a quantidade de casos de teste.
*   Cada uma das \(T\) linhas seguintes contém um único número inteiro \(N\), que pode ser arbitrariamente grande ou pequeno (podendo inclusive estourar o limite dos tipos primitivos).

---

## 📤 Formato de Saída
Para cada caso de teste (cada número \(N\) fornecido), você deve verificar em quais tipos primitivos ele se encaixa.

### Caso o número caiba em pelo menos um tipo:
Imprima uma linha inicial com a mensagem `n can be fitted in:`, seguida pelos tipos aplicáveis organizados **do menor para o maior**, precedidos por um asterisco (`*`).

**Exemplo:**
```text
-150 can be fitted in:
* short
* int
* long
```

### Caso o número NÃO caiba em nenhum dos quatro tipos:
Imprima exatamente a mensagem informando o estouro de capacidade.

**Exemplo:**
```text
213333333333333333333333333333333333 can't be fitted anywhere.
```

---

## 💡 Exemplo Completo de Entrada e Saída

### Entrada de Teste
```text
5
-150
150000
1500000000
213333333333333333333333333333333333
-1
```

### Saída Esperada
```text
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-1 can be fitted in:
* byte
* short
* int
* long
```

---

## 🔍 Dica de Resolução
> [!TIP]
> Use estruturas condicionais `if` independentes (sem usar `else if`). Números menores cabem simultaneamente em múltiplos tipos maiores (ex: o número `-1` cabe em todos eles). Trate as entradas que extrapolam o limite do tipo `long` capturando a exceção de entrada do `Scanner`.
