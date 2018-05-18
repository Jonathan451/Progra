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
import java.util.ArrayList;
import java.util.Scanner;

public class InventarioObjeto{
    
    Scanner teclado = new Scanner(System.in);
    private int items;
    private ArrayList <objetoEquipable> objeto;
	
	public void inventarioObjeto(){        
            items = 10;
            objeto = new ArrayList<objetoEquipable>();
        }
	
	private void agregarItem(){
            
            if (objeto.size() < items){
                objeto.add(new objetoEquipable());
            }
            else{
                System.out.println("NO HAY ESPACIO DISPONIBLE EN EL INVENTARIO DE ITEMS");
            }	
        }
        
        public void verItem(){
            
            for(int i=0; i<objeto.size();i++) {
                System.out.println("ITEM "+(i+1));
                objeto.get(i).muestraResultados();
                System.out.println("");
            }
        }
        private void eliminarItem() {

            System.out.println("ITEM A ELIMINAR");
            System.out.println("");
            
            verItem();
            System.out.println("");
            int eliminar = teclado.nextInt();
            objeto.remove(eliminar-1);
        }	
	
	public void FRangoObj() {
            
            ArrayList <objetoEquipable> rango = new ArrayList<>();
            
            System.out.println("ELIGA FILTRO ITEMS");
            int opcion = teclado.nextInt();    	

            for(int i=0; i<objeto.size(); i++){
                
                if(objeto.get(i).getRango() == opcion){                   
                    rango.add(objeto.get(i));
                }
            }
            for(int i=0; i<rango.size();i++){
                System.out.println("...........................");
                rango.get(i).muestraResultados();
            }
        }    
}
