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
public abstract class BancoMain {

    public BancoMain next;

    public IdBancos identificadorDoBanco;

    public BancoMain(IdBancos id) {
        next = null;

        identificadorDoBanco = id;
    }

    public void setNext(BancoMain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }

    public void efetuarPagamento(IdBancos id) throws Exception {
        if (podeEfetuarPagamento(id)) {
            efetuaPagamento();
        }
        else{
            if (next == null) {
                throw new Exception("banco não cadastrado");
            }
        }
    }
}
