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
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *  Classe de negocio das vendas
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public class VendaBusiness implements IVendaBusiness {
    
    private static List<VendaEntity> vendas;
    
    /**
     * Construtor padrao. Inicia a classe com dados de teste.
     */
    public VendaBusiness(){
        if (vendas == null){
            vendas = new ArrayList<>();
            this.criaDadosTeste();
        }
        
    }
    
    /**
     * Inicia a classe com a lista de vendas informada no parametro.
     * @param vendas A lista de vendas para iniciar a classe.
     */
    public VendaBusiness(List<VendaEntity> vendas){
        VendaBusiness.vendas = vendas;
    }

    /**
     * Calcula o total de vendas em um determinado mes.
     * @param mes <b>int</b> - O mes para calcular o total de vendas.
     * @return <b>double</b> - O total de vendas no mes.
     */
    @Override
    public double getTotalVendaMes(int mes) {
        return this.getVendas().stream().filter(Predicados.vendasNoMes(mes))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum()).sum();
    }

    /**
     * Calcula o total de vendas do vendedor.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @return <b>double</b> -O total de vendas do vendedor. 
     */
    @Override
    public double getTotalVendasVendedor(String vendedor) {
        return this.getVendas().stream().filter(
                Predicados.vendasDoVendedor(vendedor))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum()).sum();
    }

    /**
     * Calcula a comissao do vendedor
     * @param vendedor  <b>string</b> - O nome do vendedor.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    @Override
    public double getTotalComissaoVendasVendedor(String vendedor) {
        return this.getVendas().stream().filter(
                Predicados.vendasDoVendedor(vendedor))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum() 
                        * v.getVendedor().getPercentualComissao()).sum();
    }

    /**
     * Calcula a comissao do vendedor no mes informado.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @param mes <b>int</b> - O mes para calcular a comissao.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    @Override
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes) {
        return this.getVendas().stream().filter(
                Predicados.vendasDoVendedorNoMes(vendedor, mes))
                .mapToDouble(v -> v.getProdutos().stream()
                        .mapToDouble(p -> p.getQuantidade() 
                                * p.getValor()).sum() 
                        * v.getVendedor().getPercentualComissao()).sum();
    }

    /**
     * Seta a lista de vendas
     * @param vendas Lista de vendas
     */
    @Override
    public void setVendas(List<VendaEntity> vendas) {
        VendaBusiness.vendas = vendas;
    }

    /**
     * Recupera a lista de vendas.
     * @return Lista de vendas.
     */
    @Override
    public List<VendaEntity> getVendas() {
        return VendaBusiness.vendas;
    }
    
    /**
     * Cria os dados de teste.
     */
    private void criaDadosTeste(){
        VendedorEntity vendedor1 = new VendedorEntity(1, "Andre", 0.15);
        VendedorEntity vendedor2 = new VendedorEntity(2, "Pamela", 0.20);
        VendedorEntity vendedor3 = new VendedorEntity(3, "Rodrigo", 0.10);
        
        ProdutoEntity produto1 = new ProdutoEntity(1, "Iphone 6", 3499.99f, 2);
        ProdutoEntity produto2 = new ProdutoEntity(2, "Mac book pro", 13_999.99f, 4);
        ProdutoEntity produto3 = new ProdutoEntity(3, "Mouse sem fio microsoft", 94.50f, 3);
        ProdutoEntity produto4 = new ProdutoEntity(4, "Moto X 32GB", 1_499.99f, 1);
        ProdutoEntity produto5 = new ProdutoEntity(5, "Iphone 4S", 1499.99f, 7);
        ProdutoEntity produto6 = new ProdutoEntity(6, "Apple watch Gold", 9_499.99f, 1);
        
        VendaEntity venda1 = 
                new VendaEntity(1, LocalDate.of(2015, Month.MARCH, 1)
                        , vendedor1
                        , new ArrayList<ProdutoEntity>(){{ 
                            add(produto4); 
                            add(produto2);}});
        
        VendaEntity venda2 = 
                new VendaEntity(2, LocalDate.of(2015, Month.FEBRUARY, 13)
                        , vendedor2
                        , new ArrayList<ProdutoEntity>(){{ 
                            add(produto1); 
                            add(produto6);}});
        
        VendaEntity venda3 = 
                new VendaEntity(3, LocalDate.of(2015, Month.FEBRUARY, 12)
                        , vendedor1
                        , new ArrayList<ProdutoEntity>(){{ 
                            add(produto3); 
                            add(produto5);}});
        
        VendaEntity venda4 = 
                new VendaEntity(4, LocalDate.of(2015, Month.MARCH, 10)
                        , vendedor3
                        , new ArrayList<ProdutoEntity>(){{ 
                            add(produto6); 
                            }});
        
        VendaEntity venda5 = 
                new VendaEntity(5, LocalDate.of(2015, Month.FEBRUARY, 5)
                        , vendedor3
                        , new ArrayList<ProdutoEntity>(){{ 
                            add(produto4); 
                            add(produto6);}});
        
        VendaEntity venda6 = 
                new VendaEntity(6, LocalDate.of(2015, Month.MARCH, 12)
                        , vendedor2
                        , new ArrayList<ProdutoEntity>(){{ 
                            add(produto5); 
                            add(produto1);}});
        
        this.vendas = new ArrayList<>();
        vendas.add(venda1);
        vendas.add(venda2);
        vendas.add(venda3);
        vendas.add(venda4);
        vendas.add(venda5);
        vendas.add(venda6);       
        
        
    }
}
