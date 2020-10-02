/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Estados.*;
import java.text.DecimalFormat;

/**
 *
 * @author Mr. DAN
 */
public class Principal {
    public static void main(String[] args) {
        
        Calc_Pop obj = Calc_Pop.getInstancia(new Minas_Gerais());
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        System.out.println("Estado: Minas Gerais\nEstimativas para 3 Meses:\nPopulação: "+formatador.format(obj.popFinal(3))+"\nCrescimento Médio: "
                + formatador.format(obj.popMedia(3))+"\nValor sem Impostos R$ 100.00\nValor com Impostos: "+formatador.format(obj.calcImpostoEstado(100.00)));
        System.out.println("\n");
        
        obj = Calc_Pop.getInstancia(new Sao_Paulo());
        
        System.out.println("Estado: São Paulo\nEstimativas para 3 Meses:\nPopulação: "+formatador.format(obj.popFinal(3))+"\nCrescimento Médio: "
                + formatador.format(obj.popMedia(3))+"\nValor sem Impostos R$ 100.00\nValor com Impostos: "+formatador.format(obj.calcImpostoEstado(100.00)));
        System.out.println("\n");
        
        
        obj = Calc_Pop.getInstancia(new Rio_de_Janeiro());
        
        System.out.println("Estado: Rio de Janeiro\nEstimativas para 3 Meses:\nPopulação: "+formatador.format(obj.popFinal(3))+"\nCrescimento Médio: "
                + formatador.format(obj.popMedia(3))+"\nValor sem Impostos R$ 100.00\nValor com Impostos: "+formatador.format(obj.calcImpostoEstado(100.00)));
        System.out.println("\n");
    }
}
