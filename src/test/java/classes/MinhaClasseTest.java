package classes;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.*;

@TestInstance(Lifecycle.PER_CLASS)
public class MinhaClasseTest {

    @BeforeAll
    void iniciaConexao() {
        MinhaClasse.iniciaConexao();
    }

    @AfterAll
    void finalizaConexao() {
        MinhaClasse.finalizaConexao();
    }

    @BeforeEach
    void insereDados() {
        MinhaClasse.insereDados();
    }

    @AfterEach
    void removeDados() {
        MinhaClasse.removeDados();
    }

    @Test
    void validacao1() {
        assertTrue(true);
    }

    @Test
    void validacao2() {
        assertFalse(true);
    }

    @Test
    void validacao3() {
        assertNull(null);
    }

    @Test
    void validaUsuarioLogado() {
        assumeTrue("root".equals(System.getenv("USER")));
        assertTrue(true);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validaUsuarioLogado2() {
        assertTrue(true);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validaSO() {
        assertTrue(true);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void validaJRE() {
        assertTrue(true);
    }

}
