/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author freddy
 */
public class Cuenta {
    
    private double saldo;
    
    public Cuenta(double saldoInicial)
    {
        if(saldoInicial > 0.0)
        {
            saldo = saldoInicial;
            
        }
        
        //else{
            
        //    System.out.println("Saldo no valido ");
        //}
        
        //System.out.println("Saldo: "+saldo);
    }
    
    public void credito(double cantidad)
    {
        saldo = saldo + cantidad;
    }
    
    public double obtenerSaldo()
    {
        return saldo;
    }
}
