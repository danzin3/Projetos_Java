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
public interface Estado {
    double calcPopulacao(int meses);
    double calcMedia(int meses);
    double calcImposto(double valor);
    /**Os métodos calcPopulação() e calcMedia() são comuns em todos os estados;
     Já o método calcImposto(), implementa o Strategy, pois cada estado possui 
     uma forma diferente de se calcular o imposto a partir de alícotas distintas*/
}
