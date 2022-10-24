package cajero_automatico;

import java.util.Scanner;

/**
 *
 * @author Kentry Gutter
 */
public abstract class CajeroAutomatico {

    protected int deposito, retiro, transacciones;
    private static int Saldo;
    Scanner in = new Scanner(System.in);

    public void Operaciones() {
        //Necesito variables locales para los while
        //Y brindar el menu repetitivo al usuario.
        try{
        int opcion = 0;
        int seleccion = 1;

        while (seleccion == 1) {
            //Menu para el usuario
            System.out.println("Cajero Automatico");
            System.out.println("    Seleccione una opcion: ");
            System.out.println("    1. Consultar saldo.");
            System.out.println("    2. Retirar efectivo.");
            System.out.println("    3. Depositar saldo.");
            System.out.println("    4. Salir.");
            System.out.print("Opcion: ");
            //Necesito que el usuario interactue con el menu del cajero.
            opcion = in.nextInt();
            seleccion = 2;
            //Por si el usuario ingresa un opcion que no va con el menu.
            //Ejemplo 5.6.7.8...
            if (opcion >= 1 && opcion <= 4) {
                //Si la opcion es valida el ciclo continuara con su funcion.
                seleccion = 1;
            } else {
                //Si la opcion es invalida avisar al usuario se su opcion incorrecta.
                System.out.println("-----------------------------");
                System.out.println("Error, la opcion no existe.");
                System.out.println("Porfavor, intentelo de nuevo.");
                System.out.println("-----------------------------");

            }
            //El usuario resibira la opcion con su funcion elejida.
            if (opcion == 1) {
                //Funcion de la consulta.
                ConsultaSaldo consulta = new ConsultaSaldo();
                consulta.transacciones();
            } else if (opcion == 2) {
                //Funcion del retiro.
                Retiro retiro = new Retiro();
                retiro.transacciones();
            } else if (opcion == 3) {
                //Funcion del deposito.
                Deposito deposito = new Deposito();
                deposito.transacciones();
            } else if (opcion == 4) {
                //Funcion de cierre del programa.
                System.out.println("---------------------");
                System.out.println("Gracias vuelva pronto");
                System.out.println("---------------------");
                seleccion = 2;
            } else if (opcion > 4) {
                System.out.println("Error, la opcion no existe.");
                System.out.println("Porfavor, intentelo de nuevo.");
                seleccion = 1;

            }

        }
        }catch(Exception e){
            System.out.println("------------------------");
            System.out.println("La opcion es incorrecta.");
            System.out.println("------------------------");
        }
    }

    public abstract void transacciones();

    public static int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

}
