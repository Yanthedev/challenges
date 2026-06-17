## Desafio: Condicionais em Java

Neste desafio, o objetivo é praticar o uso de **estruturas condicionais** para analisar um número inteiro e determinar se ele deve ser classificado como **"Weird"** ou **"Not Weird"**.

O programa deve verificar se o número é par ou ímpar e, em seguida, aplicar as regras definidas de acordo com o intervalo em que ele se encontra.

### Regras

* Se o número for **ímpar**, imprima **`Weird`**.
* Se o número for **par** e estiver entre **2 e 5** (inclusive), imprima **`Not Weird`**.
* Se o número for **par** e estiver entre **6 e 20** (inclusive), imprima **`Weird`**.
* Se o número for **par** e for **maior que 20**, imprima **`Not Weird`**.

### Conceitos praticados

* Estruturas condicionais (`if`, `else if`, `else`)
* Operadores relacionais e lógicos
* Verificação de números pares e ímpares
* Tomada de decisão baseada em regras de negócio

### Dúvidas Resolvidas:

* Por que "private static final Scanner sc"? --> R: 
  * **private**: Restringe o acesso do `Scanner` apenas dentro da classe `Program`, protegendo-o de modificações externas (encapsulamento).
  * **static**: Permite que o `Scanner` seja acessado diretamente por métodos estáticos, como o `main`, sem precisar instanciar a classe `Program`.
  * **final**: Garante que a referência do `Scanner` seja constante e não possa ser reatribuída acidentalmente durante a execução.
  * **Instância Única**: Compartilha um único leitor para toda a classe, evitando conflitos ao ler o fluxo de entrada padrão (`System.in`).
  
* Para que serve o `sc.skip`? --> R: 
  * **Limpeza de Buffer**: Quando lemos valores numéricos (como `sc.nextInt()`), o `Scanner` lê apenas o número e deixa o caractere de quebra de linha (`\n` ou `\r\n` gerado pela tecla Enter) no buffer de entrada.
  * **Ignorar Quebras de Linha**: O `sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")` usa uma expressão regular para detectar e ignorar qualquer quebra de linha que tenha ficado pendente logo em seguida, evitando que chamadas futuras (como `sc.nextLine()`) leiam uma linha em branco por engano.
