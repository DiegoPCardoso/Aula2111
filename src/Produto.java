/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Produto {
    private double preco;

    public Produto(double p) throws ParametroInvalidoException {
        this.setPreco(p);
    }

    public double getPreco() {
        return preco;
    }
    
    public final void setPreco(double preco)
            throws ParametroInvalidoException {
        
        if(preco<0){
            
            throw new ParametroInvalidoException("Preco negativo");
        }
        this.preco = preco;
    }
}
