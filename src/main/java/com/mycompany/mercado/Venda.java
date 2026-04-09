
package com.mycompany.mercado;

public class Venda {
    
    public void processarItem(Produto item,int quantidade){
        if (quantidade>0){
            if (quantidade <= item.getEstoque()){
                double valorfinal = quantidade * item.getPreco() ;
                System.out.println("Valor final do produto "+ item.getNome()+": "+ valorfinal);
            }else{
                System.out.println("Estoque indisponivel!");
            }
        
       
        }else{
            System.out.println("Valor invalido!");
        }
    }
}
