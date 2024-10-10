/**
 * Nome: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class Forma {
    private Cor cor;
    private String posicao;
    private int tamanho;

    public Forma(Cor cor, String posicao, int tamanho) {
        if (cor == null) {
            throw new IllegalStateException("A forma deve possuir uma cor");
        }
        if (posicao == null) {
            throw new IllegalStateException("A forma deve possuir uma posição");
        }
        if (tamanho < 0) {
            throw new IllegalStateException("O tamanho da forma não pode ser negativo");
        }

        this.cor = cor;
        this.posicao = posicao;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Forma: " + cor.getNome() + "; Posição: " + posicao + "; Tamanho: " + tamanho;
    }
}
