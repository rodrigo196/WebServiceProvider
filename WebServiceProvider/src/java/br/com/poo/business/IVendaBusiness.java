/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.business;

import br.com.poo.vendas.entity.VendaEntity;
import java.util.List;

/**
 *  Interface de negocio das vendas.
 *  Determina as operacoes que devem serem expostas.
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public interface IVendaBusiness {
    
    /**
     * Seta a lista de vendas
     * @param vendas Lista de vendas
     */
    public void setVendas(List<VendaEntity> vendas);
    
     /**
     * Recupera a lista de vendas.
     * @return Lista de vendas.
     */
    public List<VendaEntity> getVendas();
    
    /**
     * Calcula o total de vendas em um determinado mes.
     * @param mes <b>int</b> - O mes para calcular o total de vendas.
     * @return <b>double</b> - O total de vendas no mes.
     */
    public double getTotalVendaMes(int mes);
    
    /**
     * Calcula o total de vendas do vendedor.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @return <b>double</b> -O total de vendas do vendedor. 
     */
    public double getTotalVendasVendedor(String vendedor);
    
     /**
     * Calcula a comissao do vendedor
     * @param vendedor  <b>string</b> - O nome do vendedor.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    public double getTotalComissaoVendasVendedor(String vendedor);
    
    /**
     * Calcula a comissao do vendedor no mes informado.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @param mes <b>int</b> - O mes para calcular a comissao.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes);
    
}
