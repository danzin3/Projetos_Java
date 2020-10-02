/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteMain;

/**
 *
 * @author Mr. DAN
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
        
public class ArquivosAll {
    public static void copiarArquivo(String pathOrigem,String pathDestino) throws IOException {
        FileInputStream origem = new FileInputStream(pathOrigem);
        FileOutputStream destino = new FileOutputStream(pathDestino);
        
        FileChannel fcSource = origem.getChannel();
        FileChannel fcDestiny = destino.getChannel();
        
        fcSource.transferTo(0, fcSource.size(), fcDestiny);
        
        fcSource.close();fcDestiny.close();
        
        origem.close();destino.close();
    }
}
