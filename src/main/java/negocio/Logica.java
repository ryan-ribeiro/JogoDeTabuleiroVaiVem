package negocio;
import entidade.Jogador;

public class Logica {

    public int verificarVitoria(Tabuleiro pedra, Jogador jogador) {
        if(pedra.getPosiPedra() == pedra.getIndiceInicio() || pedra.getPosiPedra() == pedra.getIndiceFim()) {
            System.out.println("Jogo encerrado! \nVitória do jogador " + jogador.getJogador());
//            System.exit(0);
            return 0;
        }
        return 1;
    }

    public void movimentarPedra(Tabuleiro pedra, Jogador jogador) {

        if(jogador.getTurno() == 1) {
            int mov = (pedra.getIndiceFim() - (pedra.getPosiPedra() + jogador.getMovimento()));

            if ((mov < 0 && pedra.getPosiPedra() == pedra.getIndiceFim()) || pedra.isMovEspecial() == true) {
                mov = mov * -1;
                pedra.setPosiPedra(pedra.getPosiPedra() - 1);
                pedra.mostrarTabuleiro();
                pedra.setMovEspecial(true);
            } else {
                pedra.setPosiPedra(pedra.getPosiPedra() + 1);
                pedra.mostrarTabuleiro();
            }

            jogador.setMovimento(jogador.getMovimento() - 1);

        } else {
            int mov = (pedra.getIndiceInicio() - (pedra.getPosiPedra() + jogador.getMovimento()));

            if ((mov < 0 && pedra.getPosiPedra() == pedra.getIndiceInicio()) || pedra.isMovEspecial() == true) {
                mov = mov * -1;
                pedra.setPosiPedra(pedra.getPosiPedra() + 1);
                pedra.mostrarTabuleiro();
                pedra.setMovEspecial(true);

            } else {
                pedra.setPosiPedra(pedra.getPosiPedra() - 1);
                pedra.mostrarTabuleiro();
            }

            jogador.setMovimento(jogador.getMovimento() - 1);
        }
    }
    public int jogada(Jogador jogador, Sorteio dado, Tabuleiro pedra) {
        System.out.println("Vez do jogador " + jogador.getTurno() + "!");
        dado.sortearDado();
        jogador.setMovimento(dado.getNumeroSorteado());

        while(jogador.getMovimento() != 0) {
            movimentarPedra(pedra, jogador);
        }
        pedra.setMovEspecial(false);


        Logica logica = new Logica();
        if(logica.verificarVitoria(pedra, jogador) == 0) {
            return 0;
//            System.exit(0);  // ou
//            break;
        }
        return 1;
    }
}
