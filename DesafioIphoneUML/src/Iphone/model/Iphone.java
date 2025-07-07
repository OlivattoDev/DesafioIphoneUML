package Iphone.model;

import Iphone.interfaces.AparelhoTelefonico;
import Iphone.interfaces.NavegadorDeInternet;
import Iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {

    // Os 3 métodos do reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando música ...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada ...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Os 3 métodos do aparelho telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Os 3 métodos do navegador de internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
