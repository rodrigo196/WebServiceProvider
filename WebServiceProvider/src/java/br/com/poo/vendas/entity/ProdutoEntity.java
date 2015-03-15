
package br.com.poo.vendas.entity;

/**
 * Entidade produto.
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public class ProdutoEntity {
    
    private int codigo;
    private String nome;
    private float valor;
    private int quantidade;

    /**
     * Construtor sobrecarregado. Inicializa as propiedades.
     * @param codigo <b>int</b> - Codigo do produto.
     * @param nome <b>String</b> - O nome do produto. 
     * @param valor <b>float</b> - O valor do produto.
     * @param quantidade <b>int</b> - A quantidade de produtos.
     */
    public ProdutoEntity(int codigo, String nome, float valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    /**
     * Retorna o codigo do produto.
     * @return O codigo do produto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Seta o codigo do produto
     * @param codigo <b>int</b> - O codigo do produto
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna o nome do produto.
     * @return Nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta o nome do produto.
     * @param nome <b>Nome do produto</b>
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o valor do produto.
     * @return O valor do produto.
     */
    public float getValor() {
        return valor;
    }

    /**
     * Seta o valor do produto.
     * @param valor <b>float</b> - O valor do produto.
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * Retorna a quantidade de produtos.
     * @return A quantidade de produtos.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Seta a quantidade de produtos.
     * @param quantidade <b>int</b> A quantidade de produtos.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
