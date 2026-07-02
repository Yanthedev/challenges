# Desafio Java — Arrays, Collections e Generics

## Objetivo

Este desafio tem como objetivo praticar os principais conceitos estudados até o momento:

* Arrays
* List
* Set
* Map
* Generics

A proposta simula um pequeno sistema de inscrições em eventos, permitindo aplicar na prática as estruturas de dados mais utilizadas no Java.

---

## Cenário

Uma empresa organiza diversos eventos de tecnologia e precisa de um sistema simples para controlar:

* Os eventos disponíveis;
* Os participantes inscritos;
* A eliminação de inscrições duplicadas;
* A associação entre códigos de inscrição e participantes.

---

## Requisitos do Desafio

### Parte 1 — Arrays

Criar um array de `String` contendo os seguintes eventos:

* Java Summit
* Spring Boot Day
* React Conference
* Docker Experience
* Cloud Week

Exibir todos os eventos no console.

---

### Parte 2 — List

Criar uma lista de participantes utilizando `List<String>`.

Adicionar:

* João
* Maria
* Pedro
* Ana
* Carlos

Realizar as seguintes operações:

1. Exibir todos os participantes.
2. Exibir a quantidade total de participantes.
3. Verificar se o participante "Maria" está presente na lista.

---

### Parte 3 — Set

Criar um conjunto utilizando `Set<String>`.

Adicionar:

* João
* Maria
* Pedro
* João
* Ana
* Maria
* Carlos

Exibir o conteúdo do conjunto e observar o comportamento em relação aos elementos duplicados.

Responder:

* Quantos participantes foram armazenados?
* Por que isso aconteceu?

---

### Parte 4 — Map

Criar um mapa utilizando:

```java
Map<Integer, String>
```

Cadastrar os seguintes participantes:

* 1001 → João
* 1002 → Maria
* 1003 → Pedro
* 1004 → Ana
* 1005 → Carlos

Realizar as seguintes operações:

1. Exibir o participante associado ao código `1003`.
2. Exibir todos os pares chave/valor cadastrados.

---

### Parte 5 — Generics

Responder às seguintes perguntas:

#### Pergunta A

Por que o código abaixo não compila?

```java
List<int> numeros = new ArrayList<>();
```

---

#### Pergunta B

Qual a diferença entre:

```java
List<String> nomes = new ArrayList<>();
```

e

```java
List nomes = new ArrayList();
```

---

#### Pergunta C

O que o `<String>` informa ao compilador?

---

## Desafio Bônus

Analise o código abaixo:

```java
Set<String> nomes = new HashSet<>();

nomes.add("João");
nomes.add("Maria");
nomes.add("João");
nomes.add("Pedro");
```

Responda:

1. Qual será o valor retornado por `nomes.size()`?
2. Explique o motivo.

---

## Critérios de Avaliação

Ao final deste desafio, o aluno deverá demonstrar conhecimento sobre:

* Criação e utilização de arrays;
* Manipulação de listas (`List`);
* Funcionamento de conjuntos (`Set`);
* Associação de dados utilizando mapas (`Map`);
* Utilização de Generics para segurança de tipos.

---

## Objetivo Final

Ao concluir este exercício, você terá praticado as estruturas fundamentais que servem de base para aplicações Java modernas, incluindo projetos desenvolvidos com Spring Boot.
