package cajero_automatico;

/**
 *
 * @author Kentry Gutter
 */
public class Deposito extends CajeroAutomatico{
    
    @Override
    public void transacciones(){
        System.out.print("Cuanto deseas depositar: ");
        deposito = in.nextInt();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("------------------------------------");
        System.out.println("Deposito: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }
}
