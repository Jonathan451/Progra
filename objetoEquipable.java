
package ppayudantia;

import java.util.Random;


public class objetoEquipable {
    
    
    Random azar = new Random();
    private int mejoraBaseObj;
    private int mejoraBaseTotal;
    private int rangoObjeto;
    private String objetoElegido, objetoFinal, objeto, levelUp;
    
    
    public objetoEquipable(){
        
        setMejoraBase();
        setRango();       
        setBaseTotal();
        setAtributoMejorado();        
        
    }
    
    public int getMejoraBase(){
        return mejoraBaseObj;
    }  
    public void setMejoraBase(){
        int mejoraBase = (int)(Math.random()*(9-1+1)+1);
    }
    
    public int getRango(){
        return rangoObjeto;
    }
    public void setRango(){
        
        double random = Math.random();
        
        if(random<=0.2){
            rangoObjeto = 1;
        }else{
            if(random<=0.4){
                rangoObjeto = 2;
            }else{
                if(random<=0.6){
                    rangoObjeto = 3;
                }else{
                    if(random<=0.75){
                        rangoObjeto = 4;
                    }else{
                        if(random<=0.85){
                            rangoObjeto = 5;
                        }
                        else{
                            if(random<=0.9){
                                rangoObjeto = 6;
                            }
                            else{
                                if(random<=0.94){
                                    rangoObjeto = 7;
                                }else{
                                    if(random<=0.97){
                                        rangoObjeto = 8;
                                    }else{
                                        if(random<=0.99){
                                            rangoObjeto = 9;
                                        }else{
                                            rangoObjeto = 10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
   
    public void setBaseTotal(){
        mejoraBaseTotal = getRango()*getMejoraBase();
    }
    public int getBaseTotal(){
        return mejoraBaseTotal;
    }
    
    public void setAtributoMejorado(){
        String [] atributo = {"SALUD","ATAQUE","DEFENSA","VELOCIDAD"};
        levelUp = atributo[(int) (Math.random()*4)+1];
    }
    public String getAtributoMejorado(){
        return levelUp;
    }
    
    public void setGenerarObjeto(){
        String [] objetoAzar = {"YELMO","ESCUDO","ARCO","ESPADA","PECHO","PIERNA","BOTAS","MANOS","MAZA","DAGA"};
        objeto = objetoAzar[(int) (Math.random()*10)];
    }
    public String getGenerarObjeto(){
        return objeto;
    }
    /*public int elegirObjeto(){       
        setGenerarObjeto();
        setAtributoMejorado();
    }*/
    public void muestraResultados(){
        System.out.println("STAT BASE: "+getMejoraBase());
        System.out.println("RANGO: "+getRango());
        System.out.println("STATS FINAL: "+getBaseTotal());
        System.out.println("LEVEL UP: "+getAtributoMejorado());
    }
}