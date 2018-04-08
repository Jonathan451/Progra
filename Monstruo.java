
package ppayudantia;


import java.util.Random;

public class Monstruo {    
    
    private int saludM, ataqueM, defensaM, velocidadM;
    
    public Monstruo(){
        
        setSaludM();  
        setAtaqueM();
        setDefensaM();
        setVelocidadM();
    }
    
    public int getSaludM() {
        return saludM;
    }
    
    public void setSaludM() {            
        saludM = ((int)(Math.random()*(4000-3500+1)+3500));
    }
        
    
    public int getAtaqueM() {
        return ataqueM;
    }
    public void setAtaqueM() {
        ataqueM = ((int)(Math.random()*(1500-1000+1)+1000));
    }
        
        
    public int getDefensaM() {
        return defensaM;
    }
    public void setDefensaM() {
        defensaM = ((int)(Math.random()*(25-5+1)+5));
    }
        
        
    public int getVelocidadM() {
        return velocidadM;
    }
    public void setVelocidadM() {
        velocidadM = ((int)(Math.random()*(100-10+1)+10));
    } 
    
    public void crearObjetoDropeable(){
        objetoEquipable obj = new objetoEquipable();
        
        System.out.println("OBJETO: "+obj.getGenerarObjeto());
        System.out.println("STAT OBJETO: "+obj.getBaseTotal());
    }
            
}
