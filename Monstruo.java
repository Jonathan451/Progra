
package ppayudantia;


import java.util.Random;

public class Monstruo {    
    
    private int saludM, ataqueM, defensaM, velocidadM;
    private String[] faccionM = {"FUEGO","AGUA","PLANTA"};
    private String faccionMonstruo;
    
    public Monstruo(){            
        crearMonstruo();
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
    
    public String getFaccionM() {
		return faccionMonstruo;
	}	        
        public void setFaccionM() {
            faccionMonstruo = faccionM[new Random().nextInt(faccionM.length)];
	}
      
    public void crearMonstruo(){
        this.setAtaqueM();
        this.setDefensaM();
        this.setSaludM();
        this.setVelocidadM();
    }
    
    public void crearObjetoDropeable(){
        objetoEquipable obj = new objetoEquipable();
        
        System.out.println("OBJETO: "+obj.getGenerarObjeto());
        System.out.println("STAT OBJETO: "+obj.getBaseTotal());
    }
            
}
