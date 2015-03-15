/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.entity;

import java.time.LocalDate;
import java.util.List;

/**
 *  Entidade da venda.
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public class VendaEntity {
    private int codigo;
    private LocalDate data;
    private VendedorEntity vendedor;
    private List<ProdutoEntity> produtos;

    /**
     * Construtor da VendaEntity. Inicializa os campos da entidade.
     * @param codigo <b>int</b> - O codigo da entidade.
     * @param data <b>LocalDate</b> - A data da venda.
     * @param vendedor <b>vendedorEntity</b> - A entidade do vendedor que realizou a venda.
     * @param produtos Lista de ProdutosEntity Vendidos nessa venda.
      */
    public VendaEntity(int codigo, LocalDate data, VendedorEntity vendedor, List<ProdutoEntity> produtos) {
        this.codigo = codigo;
        this.data = data;
        this.vendedor = vendedor;
        this.produtos = produtos;
    }

    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public LocalDate getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public VendedorEntity getVendedor() {
        return vendedor;
    }

    /**
     *
     * @param vendedor
     */
    public void setVendedor(VendedorEntity vendedor) {
        this.vendedor = vendedor;
    }

    /**
     *
     * @return
     */
    public List<ProdutoEntity> getProdutos() {
        return produtos;
    }

    /**
     *
     * @param produtos
     */
    public void setProdutos(List<ProdutoEntity> produtos) {
        this.produtos = produtos;
    }
    
    
    
}