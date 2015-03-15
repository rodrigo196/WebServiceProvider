/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.entity;

/**
 * Entidade Vendedor
 * @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public class VendedorEntity {
    private int codigo;
    private String nome;
    private double percentualComissao;

    /**
     * Construtor do vendedor
     * 
     * @param codigo <b>int</b> - Codigo do vendedor.
     * @param nome <b>nome</b> - O nome do vendedor.
     * @param percentualComissao <b>double</b> - O percentual de comissao que o vendedor ganha sobre cada venda. 
     * Esse valor deve estra entre 0.00 e 1.00.
     */
    public VendedorEntity(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    
    
}
