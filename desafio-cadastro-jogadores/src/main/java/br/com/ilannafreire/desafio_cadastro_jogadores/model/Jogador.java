package br.com.ilannafreire.desafio_cadastro_jogadores.model;

public record Jogador (
    String nome, String email, String telefone, String codinome, GrupoCodinome grupoCodinome) {
}


