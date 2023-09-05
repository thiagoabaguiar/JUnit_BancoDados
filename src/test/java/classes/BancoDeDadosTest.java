package classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class BancoDeDadosTest {
    
    @BeforeAll
    void iniciaConexao(){
        BancoDeDados.iniciaConexao();
    }
    
    @AfterAll
    void finalizaConexao(){
        BancoDeDados.finalizaConexao();
    }
    
    @BeforeEach
    void insereDados(){
        BancoDeDados.insereDados();
    }
    
    @AfterEach
    void removeDados(){
        BancoDeDados.removeDados();
    }
        
    @Test
    void validacao1(){
        assertTrue(true);
    }
    
    @Test
    void validacao2(){
        assertFalse(false);
    }
    
    @Test
    void validacao3(){
        assertNull(null);
    }
    
}
