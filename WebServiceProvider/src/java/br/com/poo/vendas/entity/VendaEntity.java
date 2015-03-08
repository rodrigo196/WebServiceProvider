/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.entity;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rodrigo
 */
public class VendaEntity {
    private int codigo;
    private LocalDate data;
    private VendedorEntity vendedor;
    private List<ProdutoEntity> produtos;

    public VendaEntity(int codigo, LocalDate data, VendedorEntity vendedor, List<ProdutoEntity> produtos) {
        this.codigo = codigo;
        this.data = data;
        this.vendedor = vendedor;
        this.produtos = produtos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public VendedorEntity getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorEntity vendedor) {
        this.vendedor = vendedor;
    }

    public List<ProdutoEntity> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoEntity> produtos) {
        this.produtos = produtos;
    }
    
    
    
}