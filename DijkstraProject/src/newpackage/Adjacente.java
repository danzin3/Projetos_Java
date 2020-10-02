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
public class Adjacente {
    public boolean listaAdjVazia(int u, int nV, int mat[][]) {
        int aux;
        for (aux = 0; aux < nV; aux++) {
            if (mat[u][aux] > 0) {
                return false;
            }
        }
        return true;
    }

    
    public boolean fimListaAdj(int prox, int nV) {
        if (prox == nV ) {
            return true;
        }
        return false;
    }

    public int primeiroAdj(int u, int nV, int mat[][]) {
        if (listaAdjVazia(u,nV, mat) == false) {
            int aux;
            for (aux = 0; aux < nV; aux++) {
                if (mat[u][aux] > 0) {
                    return aux;
                }
            }
        }
        return -1;
    }

    public int proxAdj(int v, int coluna, int nV, int mat[][]) {
        int aux, resp = 0;
        for (aux = coluna; aux < nV; aux++) {
            if (mat[v][aux] > 0) {
                resp = aux;
                break;
            }
            resp = aux;
        }
        return resp;
    }
}
