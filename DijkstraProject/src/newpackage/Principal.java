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
public class Principal {

    public static void main(String[] args) {
                
        int mat[][] = new int [8][8];
        mat[0][1] = 6;mat[0][2] = 5;
        mat[1][0] = 6;mat[1][2] = 4;mat[1][3] = 6;
        mat[2][0] = 5;mat[2][1] = 4;mat[2][3] = 7;mat[2][4] = 3;mat[2][5] = 2;mat[2][6] = 3;
        mat[3][1] = 6;mat[3][2] = 7;mat[3][4] = 6;mat[3][7] = 4;
        mat[4][2] = 3;mat[4][3] = 6;mat[4][5] = 4;mat[4][7] = 2;
        mat[5][2] = 2;mat[5][4] = 4;mat[5][6] = 8;
        mat[6][2] = 3;mat[6][5] = 8;
        mat[7][3] = 4;mat[7][4] = 2;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.print('\n');
        }
        System.out.print('\n');
        int u, v = 0, n = 8, i, j, peso = 0;
        Caminho obj[] = new Caminho[n];
        Adicional obj_aux = new Adicional();
        Adjacente objAdj = new Adjacente();
        u = 1;
        for (i = 0; i <= n - 1; i++) {
            obj[i] = new Caminho();
            obj[i].ant = -1;
            obj[i].distancia = 99999;
            obj[i].marca = true;
        }
        obj[u].distancia = 0;
        while (obj_aux.todosMarcado(obj, n) == false) {
            u = obj_aux.retirarMenor(obj, n);
            if (objAdj.listaAdjVazia(u, n, mat) == false) { 
                while (objAdj.fimListaAdj(v, n) == false) {
                    v = objAdj.proxAdj(u, v, n, mat);
                    if (v < n && mat[u][v] > 0) {
                        peso = obj_aux.pegarPeso(u, v, mat); 
                        if (obj[v].distancia > (obj[u].distancia + peso)) {
                            obj[v].distancia = obj[u].distancia + peso;
                            obj[v].ant = u;
                        }
                    }
                    v++;
                }
            }
            obj[u].marca = false;
            v = 0;
        }
        u = 7;
        System.out.println(u);
        while (u != 1) {
            u = obj[u].ant;
            System.out.println(u);
        }
    }
}
