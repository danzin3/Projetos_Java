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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosTxt {
    
    public static void lerArquivo(String path) throws IOException {
        
        FileReader arq = new FileReader(path);
        BufferedReader buffRead = new BufferedReader(arq);
        
        String linha;
        
        while(true){
            linha = buffRead.readLine();
            if(linha != null){
                System.out.println(linha);
            }
            else{
                break;
            }
        }
        
        buffRead.close();
        arq.close();
    }
    
    public static void EscreverArquivo(String path, String str[]) throws IOException {
        FileWriter arq = new FileWriter(path);
        BufferedWriter buffWrite = new BufferedWriter(arq);
        for (String s : str) {
            buffWrite.append(s);
            buffWrite.newLine();
        }
        buffWrite.close();
        arq.close();
    }
    
    public static void identaArq(String path) throws IOException {
        FileReader arq = new FileReader(path);
        BufferedReader buffRead = new BufferedReader(arq);
        
        //Espaço em ASCII 32
        
        String linha,linha2;
        int i,count=0;
        
        while(true){
            linha = buffRead.readLine();
            if(linha != null){
                for(i=0;i<linha.length();i++){
                    if(linha.charAt(i)==32){
                        count++;
                    }
                }
                System.out.println(count);
            }
            else{
                break;
            }
        }
    }
}
