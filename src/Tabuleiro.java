/**
 * Created by Professor on 22/05/2019.
 */
public class Tabuleiro {
    Posicao[][] posicoes;

    public Tabuleiro() {
        posicoes = new Posicao[8][8];

        for (int lin=0; lin<8; lin++) {
            for (int col=0; col<8; col++) {
                posicoes[lin][col] = new Posicao();
            }
        }


        posicoes[0][0].colocarPeca(new Torre(Cor.PRETA));
        posicoes[0][1].colocarPeca(new Cavalo(Cor.PRETA));
        posicoes[0][2].colocarPeca(new Bispo(Cor.PRETA));
        posicoes[0][3].colocarPeca(new Rainha(Cor.PRETA));
        posicoes[0][4].colocarPeca(new Rei(Cor.PRETA));
        posicoes[0][5].colocarPeca(new Bispo(Cor.PRETA));
        posicoes[0][6].colocarPeca(new Cavalo(Cor.PRETA));
        posicoes[0][7].colocarPeca(new Torre(Cor.PRETA));

        posicoes[7][0].colocarPeca(new Torre(Cor.BRANCA));
        posicoes[7][1].colocarPeca(new Cavalo(Cor.BRANCA));
        posicoes[7][2].colocarPeca(new Bispo(Cor.BRANCA));
        posicoes[7][3].colocarPeca(new Rainha(Cor.BRANCA));
        posicoes[7][4].colocarPeca(new Rei(Cor.BRANCA));
        posicoes[7][5].colocarPeca(new Bispo(Cor.BRANCA));
        posicoes[7][6].colocarPeca(new Cavalo(Cor.BRANCA));
        posicoes[7][7].colocarPeca(new Torre(Cor.BRANCA));

        for (int col=0; col<8; col++) {
            posicoes[1][col].colocarPeca(new Peao(Cor.PRETA));
            posicoes[6][col].colocarPeca(new Peao(Cor.BRANCA));
        }
    }

    public void mostraTabuleiro() {
        for (int lin = 0; lin <8; lin++) {
            for (int col = 0; col<8; col++) {
                System.out.println("Posicao (" + lin + "," + col + "): " +
                        posicoes[lin][col].getTipoPeca());
            }
        }
    }
}
