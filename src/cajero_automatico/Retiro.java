package cajero_automatico;

/**
 *
 * @author Kentry Gutter
 */
public class Retiro extends CajeroAutomatico{
    
    @Override
    public void transacciones(){
        
        System.out.print("Cuanto deseas retirar: ");
        retiro = in.nextInt();
        if(retiro < getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
        System.out.println("---------------------------------");
        System.out.println("Retiro : " + retiro);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
        }else{
            System.out.println("-------------------------");
            System.out.println("Tu saldo es insuficiente.");
            System.out.println("-------------------------");
        }
        
        
    }
}
