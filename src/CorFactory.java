/**
 * Nome: Diego Garcia Perez Biguette
 * RA: 1424
 */

import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private Map<String, Cor> cores = new HashMap<>();

    public Cor getCor(String nome) {
        var cor = cores.get(nome);

        if (cor == null) {
            cor = new Cor(nome);
            cores.put(nome, cor);
        }

        return cor;
    }
}
