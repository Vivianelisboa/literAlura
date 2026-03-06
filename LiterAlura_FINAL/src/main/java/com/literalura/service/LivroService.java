package com.literalura.service;

import com.literalura.model.Autor;
import com.literalura.model.Livro;
import com.literalura.repository.AutorRepository;
import com.literalura.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    public LivroService(LivroRepository livroRepository,
                        AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    public void buscarLivro(String titulo) {
        System.out.println("Busca simulada para: " + titulo);
    }

    public void listarLivros() {
        List<Livro> livros = livroRepository.findAll();
        livros.forEach(System.out::println);
    }

    public void listarAutores() {
        List<Autor> autores = autorRepository.findAll();
        autores.forEach(System.out::println);
    }

    public void autoresVivosNoAno(Integer ano) {

        List<Autor> autores = autorRepository
                .findByBirthYearLessThanEqualAndDeathYearGreaterThanEqual(ano, ano);

        autores.forEach(System.out::println);
    }

    public void contarLivrosPorIdioma(String idioma) {

        List<Livro> livros = livroRepository.findByIdioma(idioma);

        System.out.println("Quantidade: " + livros.size());
    }
}