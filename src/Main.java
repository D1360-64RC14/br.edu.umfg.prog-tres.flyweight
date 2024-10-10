public class Main {
    private static FormaManager manager = new FormaManager();

    public static void main(String[] args) {
        tentarCriarForma(
                "Vermelho",
                "0,0",
                10
        );
        tentarCriarForma(
                "Verde",
                "1,1",
                20
        );
        tentarCriarForma(
                "Vermelho",
                "2,2",
                15
        );
        tentarCriarForma(
                "Vermelho",
                "1,2",
                25
        );
        tentarCriarForma(
                "  ",
                "1,2",
                25
        );
        tentarCriarForma(
                "Vermelho",
                "5,2",
                14
        );
        tentarCriarForma(
                null,
                "5,2",
                -9
        );
        tentarCriarForma(
                "Amarelo",
                "10,2",
                30
        );
        tentarCriarForma(
                "Azul",
                "1,2",
                -5
        );
        tentarCriarForma(
                "Vermelho",
                "5,20",
                23
        );

        System.out.println();

        manager.apresentar();
    }

    private static void tentarCriarForma(String nomeCor, String posicao, int tamanho) {
        try {
            manager.addForma(nomeCor, posicao, tamanho);
        } catch (IllegalStateException ex) {
            System.out.printf("[ERRO] Ao criar forma '%s': %s\n", nomeCor, ex.getMessage());
        }
    }
}