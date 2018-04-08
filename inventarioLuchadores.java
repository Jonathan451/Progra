
package ppayudantia;


import java.util.ArrayList;
import java.util.Scanner;

public class inventarioLuchadores {
    
    public static void main(String[]args){
        
        
        ArrayList <Luchador> jugadores = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        
        while( opc != 7){
            System.out.println("BIENVENIDOS");
            System.out.println("....................................");
            System.out.println("1. AGREGAR JUGADOR");
            System.out.println("2. MOSTRAR LISTA DE JUGADORES");
            System.out.println("3. ELIMINAR JUGADOR");
            System.out.println("4. STATS");
            System.out.println("5. FACCIONES");
            System.out.println("6. RANGO");
            System.out.println("7. ABANDONAR");
            opc = teclado.nextInt();
            
        switch (opc) {
            
            case 1:
                System.out.println("JUGADOR CREADO");
                agregarLuchador(jugadores);
                break;
            
            case 2:
                System.out.println("JUGADORES");
                System.out.println("............................");
                verLuchador(jugadores);
               break;

            case 3:
                System.out.println("JUGADOR ELIMINADO");
            	eliminarLuchador(jugadores);
                break;                             
            
            case 4:
                System.out.println("STATS");
                System.out.println("............................");
            	verStats(jugadores);
            	break;
            	
            case 5:
                System.out.println("FACCION");  
                System.out.println("............................");
                Ffaccion(jugadores);                
            	break;
            	
            case 6:
                System.out.println("RANGO");
                System.out.println("............................");
                Frango(jugadores);
            	break;
            	
            case 7:
                System.out.println("ADIOS");
                System.out.println("............................");
                System.exit(0);
                break;
        }
        }
    }
    
    
    public static void agregarLuchador(ArrayList<Luchador> peleador){        
        peleador.add(new Luchador());
    }
    
        
    public static void eliminarLuchador(ArrayList<Luchador> peleador){
            
        Scanner teclado = new Scanner(System.in);           
            
        System.out.println("JUGADOR A ELIMINAR:");
        int eliminar = teclado.nextInt();
        peleador.remove(eliminar-1);
    }
        
    
    public static void verLuchador(ArrayList<Luchador> peleador ){
        
        for(int i=0; i<peleador.size();i++) {			
            
            System.out.println("LUCHADOR NRO "+(i+1));
            peleador.get(i).mostrarLuchador();
            System.out.println("");
        }
    }
        
    
    public static void verStats(ArrayList<Luchador> peleador){

        Scanner teclado = new Scanner(System.in);           
        
        System.out.println("JUGADOR A VER:");
        int ver = teclado.nextInt();
        peleador.get(ver-1).mostrarEstadisticas();
    }
    
    public static void Ffaccion( ArrayList<Luchador> peleador){
        
        Scanner teclado = new Scanner(System.in);

        ArrayList<Luchador> faccion = new ArrayList<>();
              
        
        System.out.println("ELIJA FILTRO FACCION:");
        System.out.println("1. FUEGO");
        System.out.println("2. TIERRA");       
        System.out.println("3. AIRE");
        String opcion = teclado.nextLine();

        for(int i=0; i<peleador.size(); i++){
            
            if(peleador.get(i).getFaccion().equals(opcion)){
                faccion.add(peleador.get(i));
            }
        }
        for(int i=0; i<faccion.size();i++) {
            System.out.println(".................................");
            faccion.get(i).mostrarLuchador();	
        }
    }
    public static void Frango( ArrayList<Luchador> peleador){
        
        Scanner teclado = new Scanner(System.in);

        ArrayList<Luchador> Rango = new ArrayList<>();
              
        
        System.out.println("ELIJA FILTRO RANGO:");
        System.out.println("1. 1 ESTRELLA");
        System.out.println("2. 2 ESTRELLA");       
        System.out.println("3. 3 ESTRELLA");
        System.out.println("3. 4 ESTRELLA");
        System.out.println("3. 5 ESTRELLA");
        int opcion = teclado.nextInt();

        for(int i=0; i<peleador.size(); i++){
            
            if(peleador.get(i).getRango() == opcion){
                Rango.add(peleador.get(i));
            }
        }
        for(int i=0; i<Rango.size();i++) {
            System.out.println(".................................");
            Rango.get(i).mostrarLuchador();	
        }
    }
}