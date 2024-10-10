import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas = new ArrayList<>();
    private CorFactory corFactory = new CorFactory();

    public void addForma(String nomeCor, String posicao, int tamanho) {
        var forma = new Forma(
                corFactory.getCor(nomeCor),
                posicao,
                tamanho
        );

        formas.add(forma);
    }

    public void apresentar() {
        for (var forma : formas) {
            System.out.println(forma);
        }
    }
}
