package cajero_automatico;

/**
 *
 * @author Kentry Gutter
 */
public class Cajero_Automatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Metodo principal
        CajeroAutomatico cajero = new ConsultaSaldo();
        cajero.setSaldo(0);
        cajero.Operaciones();
    }
    
}
