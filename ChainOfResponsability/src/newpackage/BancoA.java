/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Mr. DAN
 */
public class BancoA {

    public BancoA() {
        super(IdBancos.bancoA);
        @Override
        protected void efetuaPagamento() 
        {
            System.out.println("Pagamento efetuado no banco A");

        }
    }
}