package objetos;

public class ProdutosDados {
    private int produto_id;
    private String produto_nome = "";
    private int produto_quantidade;
    private double produto_preço;
    private String produto_tipo = "";
    
    public int getProduto_id() {
        return produto_id;
    }
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    public String getProduto_nome() {
        return produto_nome;
    }
    public void setProduto_nome(String produto_nome) {
        this.produto_nome = produto_nome;
    }
    public int getProduto_quantidade() {
        return produto_quantidade;
    }
    public void setProduto_quantidade(int produto_quantidade) {
        
        this.produto_quantidade = produto_quantidade;
    }
    public double getProduto_preço() {
        return produto_preço;
    }
    public void setProduto_preço(double produto_preço) {
        this.produto_preço = produto_preço;
    }
    public String getProduto_tipo() {
        return produto_tipo;
    }
    public void setProduto_tipo(String produto_tipo) {
        this.produto_tipo = produto_tipo;
    }
        
}

