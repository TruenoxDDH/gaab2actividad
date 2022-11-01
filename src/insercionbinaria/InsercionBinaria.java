/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insercionbinaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan
 */
public class InsercionBinaria {
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public static int buscar( int [] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
         pos = (inicio+fin) / 2;
            if ( arreglo[pos] == dato )
                return pos;
            else if ( arreglo[pos] < dato ) {
                inicio = pos+1;
            } else {
                fin = pos-1;
     }
 }
        return -1;
    }

        
        
        
        
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        
        // Llenar arreglo
 int [] edades = new int [35];
 for (int i = 0; i < edades.length ; i++)
     edades[i] = i*i ;

 // Mostrar arreglo.
 for (int i = 0; i < edades.length ; i++)
     System.out.println ( "edades["+i+"]: "+  edades[i]);

   int resultado = buscar(edades, 9);

 if (resultado != -1) {
     System.out.println ( "Encontrado en: "+  resultado);
 } else {
     System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no esta ordenado."  );
 }
    }
}
 
    



     

    
    
