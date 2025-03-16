
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TemaTest {
    @Test
    public void deveRetornarTemaAtual() {
        Tema.getInstance().setTemaAtual("Escuro");
        assertEquals("Escuro", Tema.getInstance().getTemaAtual());
    }

    @Test
    public void deveLancarExcecaoParaTemaInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Tema.getInstance().setTemaAtual("Azul");
        });
        assertEquals("Tema inválido. Use 'Claro' ou 'Escuro'.", exception.getMessage());
    }

}
