/**
 * Nome: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class Cor {
    private String nome;

    public Cor(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalStateException("A cor não pode ser vazia");
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
