
package ppayudantia;


import java.util.ArrayList;
import java.util.Scanner;

public class inventarioLuchadores {
    
    ArrayList <Luchador> jugadores;
    Scanner teclado = new Scanner (System.in);
    private int luchadores;
    
    public inventarioLuchadores(){
        luchadores = 25;
        jugadores = new ArrayList <Luchador>();
        jugadores.add(new Luchador());
    }
    
    public ArrayList<Luchador> getLuchadores() {
		return jugadores;
	}
    public void setLuchadores(ArrayList<Luchador> jugadores) {
		this.jugadores = jugadores;
	} 
   
    public void agregarLuchador(){
        if (jugadores.size() < luchadores) {
            jugadores.add(new Luchador());
        }
        else {
            System.out.println("NO HAY ESPACIO DISPONIBLE EN EL INVENTARIO DE LUCHADORES");
        }
    }
          
    public void eliminarLuchador(){         
            
        System.out.println("JUGADOR A ELIMINAR:");
        int eliminar = teclado.nextInt();
        jugadores.remove(eliminar-1);
    }
        
    
    public void verLuchador(){
        
        for(int i=0; i<jugadores.size();i++) {			
            
            System.out.println("LUCHADOR NRO "+(i+1));
            jugadores.get(i).mostrarLuchador();
            System.out.println("");
        }
    }
        
    public void verStats(){       
        
        System.out.println("JUGADOR A VER:");
        int ver = teclado.nextInt();
        jugadores.get(ver-1).mostrarEstadistica();
    }
    
    public void FFaccion(){
        
        ArrayList<Luchador> faccion = new ArrayList<>();
              
        
        System.out.println("ELIJA FILTRO FACCION:");
        System.out.println("1. FUEGO");
        System.out.println("2. TIERRA");       
        System.out.println("3. AIRE");
        String opcion = teclado.nextLine();

        for(int i=0; i<jugadores.size(); i++){
            
            if(jugadores.get(i).getFaccionL().equals(opcion)){
                faccion.add(jugadores.get(i));
            }
        }
        for(int i=0; i<faccion.size();i++) {
            System.out.println(".................................");
            faccion.get(i).mostrarLuchador();	
        }
    }
    public void FRango(){  

        ArrayList<Luchador> rango = new ArrayList<>();
              
        
        System.out.println("ELIJA FILTRO RANGO:");
        System.out.println("1. 1 ESTRELLA");
        System.out.println("2. 2 ESTRELLA");       
        System.out.println("3. 3 ESTRELLA");
        System.out.println("4. 4 ESTRELLA");
        System.out.println("5. 5 ESTRELLA");
        int opcion = teclado.nextInt();

        for(int i=0; i<jugadores.size(); i++){
            
            if(jugadores.get(i).getRango() == opcion){
                rango.add(jugadores.get(i));
            }
        }
        for(int i=0; i<rango.size();i++) {
            System.out.println(".................................");
            rango.get(i).mostrarLuchador();	
        }
    }
    
    public tatic void main(String [] args){             
        
        //inventarioLuchadores IL = new inventarioLuchadores();
        Scanner teclado = new Scanner(System.in);
        
        int opc=0;
        
        while(opc != 4){
        
        System.out.println("1.AGREGAR");
        System.out.println("2.VER");
        System.out.println("3.STATS");
        System.out.println("4.ABANDONAR");
        
        opc = teclado.nextInt();
            
        switch (opc) {
            
            case 1:
                System.out.println("JUGADOR CREADO");
                System.out.println("");
                agregarLuchador();
                break;
            
            case 2:
                System.out.println("JUGADORES");
                System.out.println("............................");
                verLuchador();
               break;

            case 3:
                System.out.println("VER STATS");
                System.out.println("");
            	verStats();
                break;
                
            case 4:
                System.out.println("ADIOS");
                System.out.println("............................");
                System.exit(0);
                break;
        }
        }
    }
}
