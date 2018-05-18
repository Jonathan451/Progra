
package ppayudantia;

import java.util.Random;


public class Luchador {

	private int ataque, defensa, velocidad, salud;
	private int estrella;
	private String[] nombres = {"JUAN","PEDRO","ALBERTO","FLASH","CASIMIRO","NEYMAR","PPK","JAK","ALLENDE",
            "AUGUSTO","LINA","ILYLLALI","ROBIN","BATMAN","LAD"};
	private String nombreLuchador;
	private String[] faccion = {"FUEGO","TIERRA","AIRE"};
	private String faccionLuchador;
	
	public Luchador() {
            crearLuchador();
	}
       
        public int getSalud() {
		return salud;
	}
        public void setSalud() {            
            salud = ((int)(Math.random()*(500-200+1)+200)*(getRango()));
	}
        
        
        public int getAtaque() {
		return ataque;
	}
        public void setAtaque() {
            ataque = ((int)(Math.random()*(50-20+1)+20)*(getRango()));
	}
        
        
        public int getDefensa() {
		return defensa;
	}
        public void setDefensa() {
            defensa = ((int)(Math.random()*(25-5+1)+5)*(getRango()));
	}
        
        
        public int getVelocidad() {
		return velocidad;
	}
        public void setVelocidad() {
            velocidad = ((int)(Math.random()*(100-10+1)+10)*(getRango()));
        } 
        
        
        public int getRango() {
		return estrella;
	}
        public void setRango() {
                    
            double random = Math.random(); 
            System.out.println(random);
            
	        if (random>0 && random<=0.4){
                    estrella = 1;
	        }else { 
                    if (random>0.5 && random<=0.7){
                        estrella=2;
                    }else { 
                        if (random>0.8 && random <=0.85){
                            estrella=3;
                        }else { 
                            if (random>0.86 && random<=0.95){
                                estrella=4;
                            }else {
                                estrella=5;
                            }
                        }
                    }
                }
        }
        
        
        public String getFaccionL() {
		return faccionLuchador;
	}	        
        public void setFaccionL() {
            faccionLuchador = faccion[new Random().nextInt(faccion.length)];
	}
        
        
	public String getNombreL() {
            return nombreLuchador;
	}
        public void setNombreL() {
            nombreLuchador = nombres[new Random().nextInt(nombres.length)];		
	}
              
                                         	                      
        public void mostrarLuchador() {	
            
            System.out.println("NOMBRE : "+getNombreL());
            System.out.println("FACCION : "+getFaccionL());
            System.out.println("ESTRELLAS : "+getRango());
        }

        public void mostrarEstadistica() {
            
            System.out.println("STATS:");
            System.out.println("..................................");
            System.out.println("SALUD : "+getSalud());
            System.out.println("ATAQUE : "+getAtaque());
            System.out.println("DEFENSA : "+getDefensa());
            System.out.println("VELOCIDAD : "+getVelocidad());           
        }
        
        public void crearLuchador(){
            this.setAtaque();
            this.setDefensa();
            this.setSalud();
            this.setVelocidad();
        }
}

