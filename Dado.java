/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppayudantia;

/**
 *
 * @author Usuario
 */

public class Dado {
    
    private int resultadoDado;  
    private int dado1;
    private int dado2;
    
    public Dado(){        
        Resultado();
    }
    
    private void dados(){
        dado1 = (int) (Math.random()*6+1);
        dado2 = (int) (Math.random()*8+1);
    }
    
    private void Resultado(){
        resultadoDado = dado1 - dado2;
    }
    
    public int getResultado(){
        return resultadoDado;
    }
    
}
