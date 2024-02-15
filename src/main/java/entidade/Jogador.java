package entidade;

import negocio.Logica;

public class Jogador {
    int jogador;  // 1 ou 2
    int turno;
    int movimento;

//    public int geradorTurno(this.turno, this.jogador) {
//        Logica logica = new Logica();
//        if (jogador)
//    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getMovimento() {
        return movimento;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }
}
