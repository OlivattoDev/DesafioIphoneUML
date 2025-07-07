package Iphone.app;

import Iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone2007 = new Iphone();

        // Os 3 métodos do reprodutor musical
        iphone2007.tocar();
        iphone2007.pausar();
        iphone2007.selecionarMusica("Viva La Vida");

        // Os 3 métodos do aparelho telefônico
        iphone2007.ligar("19920072007");
        iphone2007.atender();
        iphone2007.iniciarCorreioVoz();

        // Os 3 métodos do navegador de internet
        iphone2007.exibirPagina("https://www.apple.com/br/shop/buy-iphone");
        iphone2007.adicionarNovaAba();
        iphone2007.atualizarPagina();

    }
}
