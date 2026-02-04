package br.com.alura.screenmatch.model;

public interface IConverteDados {

    <T> T convertedados(String json, Class<T> classe);
}
