/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.business;

import br.com.poo.util.Predicados;
import br.com.poo.vendas.entity.ProdutoEntity;
import br.com.poo.vendas.entity.VendaEntity;
import br.com.poo.vendas.entity.VendedorEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public class VendaBusiness implements IVendaBusiness {
    
    private static List<VendaEntity> vendas;
    
    public VendaBusiness(){
        if (vendas == null){
            vendas = new ArrayList<>();
        }
    }
    
    public VendaBusiness(List<VendaEntity> vendas){
        VendaBusiness.vendas = vendas;
    }

    @Override
    public double getTotalVendaMes(int mes) {
        return this.getVendas().stream().filter(Predicados.vendasNoMes(mes))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum()).sum();
    }

    @Override
    public double getTotalVendasVendedor(String vendedor) {
        return this.getVendas().stream().filter(
                Predicados.vendasDoVendedor(vendedor))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum()).sum();
    }

    @Override
    public double getTotalComissaoVendasVendedor(String vendedor) {
        return this.getVendas().stream().filter(
                Predicados.vendasDoVendedor(vendedor))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum() 
                        * v.getVendedor().getPercentualComissao()).sum();
    }

    @Override
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes) {
        return this.getVendas().stream().filter(
                Predicados.vendasDoVendedorNoMes(vendedor, mes))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum() 
                        * v.getVendedor().getPercentualComissao()).sum();
    }

    @Override
    public void setVendas(List<VendaEntity> vendas) {
        VendaBusiness.vendas = vendas;
    }

    @Override
    public List<VendaEntity> getVendas() {
        return VendaBusiness.vendas;
    }
    
    private void criaDadosTeste(){
        VendedorEntity vendedor1 = new VendedorEntity(1, "Andre", 0.15);
        VendedorEntity vendedor2 = new VendedorEntity(1, "Pamela", 0.20);
        VendedorEntity vendedor3 = new VendedorEntity(1, "Rodrigo", 0.10);
        
        ProdutoEntity produto1 = new ProdutoEntity(1, "Iphone 6", 3499.99f, 2);
    }
}
