package br.com.alura.fonematch.modelos;

import br.com.alura.fonematch.principal.Audio;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido de todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo.");
        }
    }
}
