
package com.mycompany.mercado;

public class Produto {
    protected String nome;
    protected Double preco;
    protected int estoque;

    public Produto(String nome, Double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public void adicionarEstoque(int valor){
        if (valor>0){
            this.estoque += valor;
        }else{
            System.out.println("Valor invalido!");
        }
    }
    
    public void vender(int valor){
        if (valor>0){
            if (valor <= this.estoque){
                this.estoque -= valor;
                System.out.println("Vendido "+ valor+" da "+this.nome);
            }else{
                System.out.println("Estoque indisponivel!");
            }
            
        }else{
            System.out.println("Valor invalido!");
        }
        
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco>0){
            this.preco = preco;
        }else{
            System.out.println("Valor invalido!");
        }
    }

    public int getEstoque() {
        return estoque;
    }
    
    public void venderproduto(int valor){
        this.estoque -= valor;
    }
    
}