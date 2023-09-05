package classes;

import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());    
    
    public static void iniciaConexao(){        
        LOGGER.info("Iniciou conexão...");        
    }
    
    public static void finalizaConexao(){    
        LOGGER.info("Finalizou conexão...");        
    }
    
    public static void insereDados(){
        LOGGER.info("Inseriu dados...");
    }
    
    public static void removeDados(){
        LOGGER.info("Removeu dados...");
    }
    
}