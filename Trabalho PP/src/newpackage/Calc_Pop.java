/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Estados.*;

/**
 * O padrão Singleton foi utilizado para criação dessa classe "Calc_Pop", em que cada vez que um objeto só poderá ser construído na classe principal
 * através do método getInstancia(Estado param), em que param é o estado em que se deseja obter as estimatívas.
 *
 * @author Mr. DAN
 */
public class Calc_Pop {
    
    private static Calc_Pop instancia;
    
    public static Estado x;
    
    private Calc_Pop(Estado y) {
        Calc_Pop.x = y;
    }
    
    public static Calc_Pop getInstancia(Estado param)
    {
        if(instancia == null)
        {
            instancia = new Calc_Pop(param);
        }
        else
        {
            Calc_Pop.x = param;
        }
        return instancia;
    }
    
    public double popFinal(int m)
    {
        return Calc_Pop.x.calcPopulacao(m);
    }
    
    public double popMedia(int m)
    {
        return Calc_Pop.x.calcMedia(m);
    }
    
    public double calcImpostoEstado(double v){
        return Calc_Pop.x.calcImposto(v);
    }
    
}
