
package cursojava;

import ejercicio01.Cuenta;
import java.util.Scanner;

public class CursoJava {

    public static void main(String[] args) {
        
        //System.out.println("Iniciando mi primer Repositorio :) ");
        
        Cuenta cuenta01 = new Cuenta(90.0);
        
        System.out.println("Cuenta01 Saldo :"+cuenta01.obtenerSaldo());
        
        Scanner input = new Scanner( System.in );
        
        double depositAmount;
        
        System.out.print( "Ingrese la cantidad del deposito de la cuenta01: " );
        
        depositAmount = input.nextDouble();
        
        System.out.printf( "\nagregando %.2f al saldo de la cuenta01\n\n",depositAmount );

        cuenta01.credito(depositAmount );
        
        System.out.printf( "Saldo de la cuenta01: $ %.2f \n",cuenta01.obtenerSaldo());
    }
}
