/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteMain;

import java.io.IOException;

/**
 *
 * @author Mr. DAN
 */


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ArquivosTxt.identaArq("C:\\Users\\Mr. DAN\\Pictures\\oi.txt");
        }catch(IOException e){
            System.out.println("Erro: "+e.getLocalizedMessage());
        }
    }
    
}
