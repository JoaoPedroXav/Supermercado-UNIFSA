package com.mycompany.mercado;

public class ProdutoImportado extends Produto {
    private double dataImportacao;
    private float taxaImportacao;

    public ProdutoImportado(double dataImportacao, String nome, Double preco, int estoque,float taxaImportacao) {
        super(nome, preco, estoque);
        this.dataImportacao = dataImportacao;
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
    

    public double getDataImportacao() {
        return dataImportacao;
    }

    public void setDataImportacao(double dataImportacao) {
        this.dataImportacao = dataImportacao;
    }
    
    @Override
    public void vender(int valor){
        if (valor>0){
            if (valor <= getEstoque()){
                super.venderproduto(valor);
                System.out.println("Vendido "+ valor+" da "+getNome());
            }else{
                System.out.println("Estoque indisponivel!");
            }
            
        }else{
            System.out.println("Valor invalido!");
        }
        
        
        
    }
}
