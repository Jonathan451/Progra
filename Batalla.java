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
//import java.util.*;


public class Batalla {
    
    private int ataqueM;
    private int vidaM;
    private int ataqueEquipo;
    private int dDLuchador;
    private int dDMonstruo;
    private inventarioLuchadores luchadorP;
    private Monstruo monstruoP;
    private Dado d = new Dado();
    

    
    public Batalla() {
        this.luchadorP = new inventarioLuchadores();
        this.monstruoP = new Monstruo();
        this.ataqueM = monstruoP.getAtaqueM();
        this.vidaM = monstruoP.getSaludM();
        dañoDado();
    
    }
    private void crearEquipo() { 
        
        for(int i = 0; i<6; i++) {
            this.luchadorP.agregarLuchador();
        }
    }
    
    private int Daño(int salud , int ataque , int defensa){
        
        if (ataque - defensa < 0){
            return salud;           
        
        }else{
            salud = salud - ataque - defensa;
            return salud;
        }
    }
     public void generarMonstruo(){    
            System.out.println("MONSTRUO");
            monstruoP.crearMonstruo();
            System.out.println("");
     }
     
     private void dañoFaccion(String faccionL, String faccionM){         
         
         if(faccionL.equals("AGUA") && faccionM.equals("FUEGO")){
             ataqueEquipo = (int) (ataqueEquipo*1.5);
             ataqueM = (int) (ataqueM*0.75);  
         
         }else 
             
             if(faccionL.equals("FUEGO") && faccionM.equals("PLANTA")){
             ataqueEquipo = (int) (ataqueEquipo*1.5);
             ataqueM = (int) (ataqueM*0.75);        
             
             }else 
                 
                 if(faccionL.equals("PLANTA") && faccionM.equals("AGUA")){
                     ataqueEquipo = (int) (ataqueEquipo*1.5);       
                     ataqueM = (int) (ataqueM*0.75);         
                 
                 }else 
                     
                     if(faccionL.equals("FUEGO") && faccionM.equals("AGUA") ){
                         ataqueEquipo = (int) (ataqueEquipo*0.75);
                         ataqueM = (int) (ataqueM*1.5);       
                     
                     }else 
                         
                         if(faccionL.equals("PLANTA") && faccionM.equals("FUEGO")){
                             ataqueEquipo = (int) (ataqueEquipo*0.75);
                             ataqueM = (int) (ataqueM*1.5);        
                         
                         }else 
                             
                             if(faccionL.equals("AGUA") && faccionM.equals("PLANTA")){
                                 ataqueEquipo = (int) (ataqueEquipo*0.75);
                                 ataqueM = (int) (ataqueM*1.5);                
                             }               
     }
     public int getDDLuchador() {
		return dDLuchador;
     }
     public int getDDMonstruo() {
         return dDMonstruo;
     }
     
     private void dañoDado(){
            
            if(d.getResultado() > 0){
                 System.out.println("EL ATAQUE MULTIPLICADO POR "+d.getResultado());
                 this.dDLuchador = d.getResultado();
                 this.dDMonstruo =1;
            }else 
                if (d.getResultado() < 0){
                    this.dDLuchador = 1;
                    this.dDMonstruo = Math.abs(d.getResultado());
            }else
                    if(d.getResultado() == 0){
                        this.dDLuchador=1;
                        this.dDMonstruo=1;
                    }
     }
     
     private void combate (Luchador peleador, int saludL) {
         
         
         dañoFaccion(peleador.getFaccionL() , monstruoP.getFaccionM());    
         int ataqueFinal;
   
         while (saludL > 0) {
             
             if(peleador.getVelocidad() > monstruoP.getVelocidadM()) {
                 
                 System.out.println("COMIENZA LA ALIANZA");
                 System.out.println("..........................");
                 
                 ataqueFinal = peleador.getAtaque()*getDDLuchador()*ataqueEquipo;
                 vidaM =  Daño(vidaM, ataqueFinal, monstruoP.getDefensaM());
                 
                 System.out.println(peleador.getNombreL()+" HA CAUSADO " +ataqueFinal+ " DE DAÑO");
                 System.out.println("");
                 System.out.println("MONSTRUO HA QUEDADO CON "+vidaM+ " DE VIDA");
                 System.out.println("");
                 
                 System.out.println("TURNO DE LA HORDA");
                 System.out.println("..........................");
                 
                 saludL = Daño(saludL , ataqueM*getDDMonstruo() , peleador.getDefensa());
                 
                 if (saludL <= 0) {
                     System.out.println(peleador.getNombreL()+" HA MUERTO");
                     System.out.println("");
                 
                 }else{
                     System.out.println(peleador.getNombreL()+" RESTA "+saludL+ " DE VIDA");
                     System.out.println("");
                 }    
                 
             } else{
                 
                 System.out.println("COMIENZA LA HORDA");
                 System.out.println("..........................");

                 saludL = Daño( saludL , ataqueM*getDDMonstruo() , peleador.getDefensa() );
                 
                 if (saludL <= 0) {
                     System.out.println(peleador.getNombreL()+" HA MUERTO");
                     System.out.println("");
                     
                 }else{
                     System.out.println(peleador.getNombreL()+" RESTA "+saludL+ " DE VIDA");
                     System.out.println("");
                     
                     ataqueFinal = peleador.getAtaque()*getDDLuchador()*ataqueEquipo;
                     vidaM =  Daño(vidaM , ataqueFinal , monstruoP.getDefensaM());
                     
                     System.out.println(peleador.getNombreL()+" HA CAUSADO "+ataqueFinal+ " DE DAÑO");
                     System.out.println("");
                     System.out.println("VIDA DEL MONSTRUO : "+vidaM);	
                     System.out.println("");
                 }				
             }
         }					
     }     
}