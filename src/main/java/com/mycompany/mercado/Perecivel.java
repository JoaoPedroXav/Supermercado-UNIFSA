
package com.mycompany.mercado;

public class Perecivel extends Produto {
    private String dataValidade;

    public Perecivel(String dataValidade, String nome, Double preco, int estoque) {
        super(nome, preco, estoque);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
}