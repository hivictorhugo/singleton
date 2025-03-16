public class Tema {
    private Tema() {};
    private static Tema instance = new Tema();
    public static Tema getInstance() {
        return instance;
    }

    private String temaAtual = "Claro";

    public String getTemaAtual() {
        return temaAtual;
    }

    public void setTemaAtual(String temaAtual) {
        if (temaAtual.equalsIgnoreCase("Claro") || temaAtual.equalsIgnoreCase("Escuro")) {
            this.temaAtual = temaAtual;
        } else {
            throw new IllegalArgumentException("Tema inválido. Use 'Claro' ou 'Escuro'.");
        }
    }

}
