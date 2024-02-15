package negocio;

import java.text.DecimalFormat;

public class Sorteio {
    private int numeroSorteado;

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public void sortearDado() {
        Double aleatorio = new Double(Math.random()*6);
        Integer novoNumero = aleatorio.intValue();
        setNumeroSorteado(novoNumero);
        System.out.println("O numero sorteado eh " + getNumeroSorteado() + "!");
    }
}
