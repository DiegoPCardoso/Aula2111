/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaProduto {
    public static void main(String[] args) throws ParametroInvalidoException{
        
        try{
        
        Produto p1 = new Produto(-5);
        
        }catch(ParametroInvalidoException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
}
