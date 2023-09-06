package classes;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, float valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor menor ou igual a zero");
        }

    }

}
