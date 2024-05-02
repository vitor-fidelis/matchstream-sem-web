package br.com.alura.matchstream.service;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
}
