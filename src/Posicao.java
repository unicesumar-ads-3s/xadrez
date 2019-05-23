/**
 * Created by Professor on 22/05/2019.
 */
public class Posicao {
    Peca peca = null;

    public void colocarPeca(Peca peca) {
        this.peca = peca;
    }

    public void retirarPeca() {
        this.peca = null;
    }

    public Peca getPeca() {
        return this.peca;
    }

    public String getTipoPeca() {
        if (peca == null)
            return "";

        return peca.getClass().getName();
    }
}
