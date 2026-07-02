package gpt.sistema_inscricao_eventos;

import java.lang.reflect.Array;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        // Parte 1 — Arrays
        String[] eventos = new String[] { "Java Summit", "Spring Boot Day", "React Conference", "Docker Experience",
                "Cloud Week" };

        for (String array : eventos) {
            System.out.println(array);
        }

        // Parte 2 - Listas
        List<String> participantes = new ArrayList<>();
        participantes.add("João");
        participantes.add("Maria");
        participantes.add("Pedro");
        participantes.add("Ana");
        participantes.add("Carlos");

        System.out.println("Lista de participantes: " + participantes);
        System.out.println("Quantidade total de participantes: " + participantes.size());
        System.out.println("A participante Maria esta presente na lista? " + participantes.contains("Maria"));

        // parte 3 - SET
        Set<String> participantesSet = new HashSet<>();
        participantesSet.add("João");
        participantesSet.add("Maria");
        participantesSet.add("João");
        participantesSet.add("Maria");
        participantesSet.add("Carlos");
        participantesSet.add("Daniel");
        participantesSet.add("Yan");

        System.out.println(participantesSet);
        // Quantos participantes foram armazenados? -- 5
        // Por que isso aconteceu? Porque o Set não permite elementos duplicados,
        // garantindo a exclusividade dos eventos.

        // parte 4 - MAPA

        Map<String, String> inscricoes = new HashMap<>();
        inscricoes.put("1001", "João");
        inscricoes.put("1002", "Maria");
        inscricoes.put("1003", "Pedro");
        inscricoes.put("1004", "Ana");
        inscricoes.put("1005", "Carlos");

        System.out.println("Nome do participante com o código 1003: " + inscricoes.get("1003"));
        System.out.println(" lista de chaves: " + inscricoes.keySet());
        System.out.println(" lista de valores: " + inscricoes.values());
    }
}

/*
 * Parte 5 — Generics
 * 
 * Responder às seguintes perguntas:
 * 
 * Pergunta A: Por que o código abaixo não compila?
 * - List<int> numeros = new ArrayList<>();
 * R: Não podemos ter tipos primitivos dentro de estruturas Generic. O correto
 * seria colocarmos um Integer como referência a objetos
 * 
 * 
 * Pergunta B: Qual a diferença entre:
 * List<String> nomes = new ArrayList<>(); e List nomes = new ArrayList();
 * 
 * R: O primeiro é uma lista que receberá somente objetos String, chama-se Type
 * safety, como foi estrito no Generic, já o segundo é classificado como Raw
 * Type, ele não possui especificidade de tipo, isso causa problemas futuros na
 * hora de mostrar ou mexer com os valores que serão atribuidos dentro dessa
 * lista generica.
 * 
 * Pergunta C: O que o <String> informa ao compilador?
 * R: Se chama Type Safety, ele informa ao compilador que ali contém uma lista
 * de Strings, ou seja, ele delimita o tipo de objeto que é permitido ali,
 * impedindo a inserção de dados inválidos em tempo de compilação
 * Desafio Bônus
 * 
 * Analise o código abaixo:
 * 
 * Set<String> nomes = new HashSet<>();
 * 
 * nomes.add("João");
 * nomes.add("Maria");
 * nomes.add("João");
 * nomes.add("Pedro");
 * 
 * Responda:
 * 
 * Qual será o valor retornado por nomes.size() e explique o motivo.
 * 
 * R: O valor retornado será 3, afinal de contas as java.util.Set são coleções
 * que permitem a exclusividade dos dados armazenados em um conjunto, não
 * permitindo assim a repetição de valores.
 * 
 */