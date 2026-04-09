package com.mycompany.mercado;

public class Mercado {

    public static void main(String[] args) {
        ProdutoImportado macbook = new ProdutoImportado(2026,"Macbook m4",5000.00,1,100);
        Perecivel carne = new Perecivel("04/02/2007","Carne",100.00,10);
        Venda vendendo = new Venda();
        
        
        macbook.vender(1);
        carne.vender(10);
       vendendo.processarItem(macbook, 12);
    }
}
