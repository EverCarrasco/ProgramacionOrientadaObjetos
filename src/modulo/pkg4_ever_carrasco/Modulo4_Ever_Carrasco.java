/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.pkg4_ever_carrasco;

import Helpers.Ciudadano;
import Helpers.CostaRica;
import Helpers.ElSalvador;
import Helpers.Honduras;

/**
 *

 */
public class Modulo4_Ever_Carrasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PRIMERA PARTE 
        Ciudadano cd = new Ciudadano();
   
        System.out.println("Nombre:              "+cd.getNombre());
        System.out.println("Edad:                "+cd.getEdad());
        System.out.println("Años de experiencia: " +cd.getAñosExperiencia());
        System.out.println("");
        System.out.println("");
        
        
        //SEGUNDA PARTE
        Honduras hn =new Honduras();
        CostaRica cr = new CostaRica();
        ElSalvador es=new ElSalvador();
      
        System.out.println("Pais:       " +hn.getPais());
        System.out.println("Presidente: "+hn.getPresidente());
        System.out.println("");
        System.out.println("Pais:       "+cr.getPais());
        System.out.println("Presidente: "+cr.getPresidente());
        System.out.println("");
        System.out.println("Pais:       "+es.getPais());
        System.out.println("Presidente: "+es.getPresidente());
        
        
        
    }
    
}
