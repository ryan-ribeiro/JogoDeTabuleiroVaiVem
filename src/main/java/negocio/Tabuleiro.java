package negocio;

public class Tabuleiro {
    private int indiceInicio = 0;
    private int indiceFim = 16;
    private int posiPedra = 8;
    private boolean movEspecial = false;

    public boolean isMovEspecial() {
        return movEspecial;
    }

    public void setMovEspecial(boolean movEspecial) {
        this.movEspecial = movEspecial;
    }
    //    public int[] index = new int[16];

    void mostrarTabuleiro() {
        String tabuleiro = "";

        for(int i = indiceInicio ; i < (indiceFim + 1) ; i++){
            if(getPosiPedra() == i){
                tabuleiro += "[X]";
            }
            tabuleiro += "[ ]";
        }
        System.out.println(tabuleiro);
//        System.out.println("A pedra está na casa " + getPosiPedra() + ".");
    }

    public int getPosiPedra() {
        return posiPedra;
    }

    public void setPosiPedra(int posiPedra) {
        this.posiPedra = posiPedra;
    }

    public int getIndiceInicio() {
        return indiceInicio;
    }

    public void setIndiceInicio(int indiceInicio) {
        this.indiceInicio = indiceInicio;
    }

    public int getIndiceFim() {
        return indiceFim;
    }

    public void setIndiceFim(int indiceFim) {
        this.indiceFim = indiceFim;
    }
}
