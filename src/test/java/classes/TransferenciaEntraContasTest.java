package classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransferenciaEntraContasTest {

    @Test
    void validaExcecaoNoValorDaTransferencia() {
        
        Conta contaOrigem = new Conta("123", 0);
        Conta contaDestino = new Conta("321", 50);
        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferencia.transfere(contaOrigem, contaDestino, 0));

    }

}
