package cajero_automatico;

/**
 *
 * @author Kentry Gutter
 */
public class ConsultaSaldo extends CajeroAutomatico{
    
    @Override
    public void transacciones(){
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }

}
