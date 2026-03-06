package com.literalura;

import com.literalura.principal.MenuPrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

    private final MenuPrincipal menu;

    public LiterAluraApplication(MenuPrincipal menu) {
        this.menu = menu;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);
    }

    @Override
    public void run(String... args) {
        menu.exibeMenu();
    }
}