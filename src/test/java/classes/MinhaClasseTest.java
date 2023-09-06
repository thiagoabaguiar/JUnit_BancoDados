package classes;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.*;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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

    @Order(4)
    @Test
    void validacao1() {
        assertTrue(true);
    }

    @Order(5)
    @Test
    void validacao2() {
        assertFalse(true);
    }

    @Order(7)
    @Test
    void validacao3() {
        assertNull(null);
    }

    @Order(6)
    @Test
    void validaUsuarioLogado() {
        assumeTrue("root".equals(System.getenv("USER")));
        assertTrue(true);
    }

    @Order(3)
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validaUsuarioLogado2() {
        assertTrue(true);
    }

    @Order(2)
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validaSO() {
        assertTrue(true);
    }

    @Order(1)
    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void validaJRE() {
        assertTrue(true);
    }

}
