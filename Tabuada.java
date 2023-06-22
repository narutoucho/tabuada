
package tabuada;

import java.util.Scanner;


public class Tabuada { 
    

  
    public static void main(String[] args) {
        Scanner LerTeclado=new Scanner (System.in);
        System.out.println("informe um numero");
        
        int num = LerTeclado.nextInt();
        
        for(int i=0; i<11; i++){
            System.out.println(" " + num + " X " + i +"="+(num*i));
        }
   
    }
    
}
