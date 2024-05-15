package service.implementation;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void play() {
        // Implementação
    }

    @Override
    public void pause() {
        // Implementação
    }

    @Override
    public void stop() {
        // Implementação
    }

    @Override
    public void next() {
        // Implementação
    }

    @Override
    public void previous() {
        // Implementação
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        // Implementação
    }

    @Override
    public void receberChamada(String numero) {
        // Implementação
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void abrirURL(String url) {
        // Implementação
    }

    @Override
    public void fecharNavegador() {
        // Implementação
    }
}
+