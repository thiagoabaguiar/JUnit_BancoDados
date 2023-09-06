package classes;

import java.util.logging.Logger;

public class MinhaClasse {
    
    private static final Logger LOGGER = Logger.getLogger(MinhaClasse.class.getName());    
    
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