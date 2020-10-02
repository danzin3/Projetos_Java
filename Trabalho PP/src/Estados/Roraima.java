/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estados;

/**
 *
 * @author Mr. DAN
 */
public class Roraima implements Estado {

    private double tx_natalidade = 2.39, populacao = 605761.00, resp = 0,mediaPop = 0 ;
    /**A taxa de natalidade e a população desse Estado já foi predefinida a partir de uma pesquisa*/
    
    /**
     * @param meses: Define a quantidade de meses em que se deseja estimar a população
     * @return Define a nova quantidade da população em num meses
     */
    
    @Override
    public double calcPopulacao(int meses) {
        resp = this.populacao;
        for (int i = 0; i < meses; i++) {
            resp = resp + (resp / 1000 * this.tx_natalidade);
        }
        return (resp);
    }

    @Override
    public double calcMedia(int meses) {
        resp = this.populacao;
        for (int i = 0; i < meses; i++) {
            mediaPop = mediaPop + (resp / 1000 * this.tx_natalidade);
            resp = resp + (resp / 1000 * this.tx_natalidade);
        }
        mediaPop = mediaPop / meses;
        return (mediaPop);
    }

    @Override
    public double calcImposto(double valor) {
        return valor + (valor*0.17);//0.17 É a alícota do imposto desse Estado
    }
    
}
