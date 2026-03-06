package com.literalura.principal;

import com.literalura.service.LivroService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MenuPrincipal {

    private final Scanner leitura = new Scanner(System.in);
    private final LivroService livroService;

    public MenuPrincipal(LivroService livroService) {
        this.livroService = livroService;
    }

    public void exibeMenu() {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("""
                    
                    ===== LiterAlura =====
                    1 - Buscar livro pelo título
                    2 - Listar livros
                    3 - Listar autores
                    4 - Autores vivos em determinado ano
                    5 - Contar livros por idioma
                    0 - Sair
                    """);

            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do livro:");
                    String titulo = leitura.nextLine();
                    livroService.buscarLivro(titulo);
                }
                case 2 -> livroService.listarLivros();
                case 3 -> livroService.listarAutores();
                case 4 -> {
                    System.out.println("Digite o ano:");
                    Integer ano = leitura.nextInt();
                    livroService.autoresVivosNoAno(ano);
                }
                case 5 -> {
                    System.out.println("Digite o idioma:");
                    String idioma = leitura.nextLine();
                    livroService.contarLivrosPorIdioma(idioma);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida");
            }
        }
    }
}