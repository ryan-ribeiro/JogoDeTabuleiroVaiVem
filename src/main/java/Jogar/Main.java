package Jogar;

import entidade.Jogador;
import negocio.Logica;
import negocio.Sorteio;
import negocio.Tabuleiro;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.setJogador(1);
        j1.setTurno(1);
        Jogador j2 = new Jogador();
        j2.setJogador(2);
        j2.setTurno(2);

        Tabuleiro pedra = new Tabuleiro();
        Sorteio dado = new Sorteio();
        Logica logica = new Logica();

//        while (logica.verificarVitoria(pedra, j1) != 0  && logica.verificarVitoria(pedra, j2) != 0) {
//        while (logica.jogada(j1, dado, pedra) != 0  && logica.jogada(j2, dado, pedra) != 0) {
        while(true) {
            if (logica.jogada(j1, dado, pedra) == 0) {
              break;
            }
            if (logica.jogada(j2, dado, pedra) == 0){
                break;
            }
        }
    }
}
