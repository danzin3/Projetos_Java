/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Mr_DAN
 */
public class Adicional {
    public boolean todosMarcado(Caminho obj[],int n){
        int aux;
        for(aux=0; aux<n; aux++){
            if(obj[aux].marca == true){
                return false;
            }
        }
        return true;
    }
    
    //Retorna o vértice que possúi a menor distância do vetor caminho
    public int retirarMenor(Caminho obj[],int n){ 
        int c,menor=0,dist_m;
        dist_m = 99999;
        for(c=0;c<n;c++){
            if(obj[c].marca == true){
                if(obj[c].distancia < dist_m){
                    dist_m = obj[c].distancia;
                    menor = c;
                }
            }
        }
        return menor;
    }
    
    public int pegarPeso(int u, int v, int mat[][]){
        return mat[u][v];
    }
}
