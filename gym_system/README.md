# Desafio Prático - Sistema de Academia 🏋️

## Conheça o projeto

Neste projeto, você desenvolverá um sistema básico para gerenciar
matrículas em uma academia. O foco será na listagem de aulas disponíveis
e na funcionalidade de matrícula.

------------------------------------------------------------------------

## Objetivo

Você irá desenvolver um sistema de console para gerenciar as matrículas
dos alunos em aulas da academia.

O programa deverá interagir com o usuário, permitindo que ele veja as
aulas disponíveis e realize a matrícula em uma delas.

------------------------------------------------------------------------

## Como deve funcionar

### Início

O programa começará, em loop, perguntando ao usuário se ele deseja ver a
lista de aulas disponíveis.

### Listagem

Se a resposta for **"SIM"**, o sistema exibirá no console uma lista com
as aulas que ainda possuem vagas.

### Matrícula

Após ver a lista, o usuário poderá escolher uma aula pelo seu id,
informar o próprio nome e registrar a matrícula.

O sistema deve confirmar a operação e diminuir a quantidade de vagas
disponíveis.

### Encerramento

Se a resposta inicial for **"NÃO"**, ou após a conclusão de uma
matrícula, o sistema deve exibir uma mensagem de despedida e finalizar.

------------------------------------------------------------------------

# Estrutura do Projeto

## Aula

-   id: Identificador único da aula
-   nome: Nome da aula
-   professor: Professor responsável (objeto do tipo Professor)
-   vagasDisponiveis: Quantidade de vagas restantes
-   dataCadastro: Data de cadastro
-   dataAtualizacao: Data de atualização

## Professor

-   id: Identificador único
-   nome: Nome do professor
-   especialidade: Especialidade do professor

## Matricula

-   id: Identificador único
-   aula: Aula escolhida
-   nomeAluno: Nome do aluno
-   dataMatricula: Data da matrícula
-   ativa: Indica se a matrícula está ativa

## Academia

-   aulas: Lista de aulas
-   professores: Lista de professores
-   matriculas: Lista de matrículas

### Dica

``` java
private List<Aula> aulas = new ArrayList<>();
private List<Professor> professores = new ArrayList<>();
private List<Matricula> matriculas = new ArrayList<>();
```

------------------------------------------------------------------------

# Tarefas

-   [x] Criar a classe `Professor`
-   [x] Criar a classe `Aula`
-   [x] Criar a classe `Matricula`
-   [x] Criar a classe `Academia`
-   [x] Inicializar as listas dentro da classe `Academia`
-   [x] Adicionar manualmente alguns professores e aulas
-   [x] Implementar o loop principal de interação
-   [x] Implementar a lógica para "NÃO": encerrar o sistema
-   [x] Implementar a lógica para "SIM": listar apenas aulas com vagas disponíveis
-   [x] Permitir que o usuário escolha uma aula pelo `id`
-   [x] Solicitar o nome do aluno
-   [x] Criar uma matrícula
-   [x] Atualizar a quantidade de vagas da aula
-   [x] Exibir uma mensagem de sucesso confirmando a matrícula

------------------------------------------------------------------------

# O que este exercício avalia

-   Criação de classes
-   Objetos compostos (Aula possui Professor)
-   Uso de `List`
-   Encapsulamento de estado em uma classe principal (`Academia`)
-   Busca por id
-   Alteração de estado dos objetos
-   Interação com usuário via console
-   Separação mínima de responsabilidades

Boa sorte! 🚀
