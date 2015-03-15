/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *  Interface do webservice.
 *  Determina as operacoes que devem serem expostas.
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
@WebService
public interface IProvedorService {
        
     /**
     * Calcula o total de vendas em um determinado mes.
     * @param mes <b>int</b> - O mes para calcular o total de vendas.
     * @return <b>double</b> - O total de vendas no mes.
     */
    @WebMethod public double getTotalVendaMes(int mes);
    
    /**
     * Calcula o total de vendas do vendedor.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @return <b>double</b> -O total de vendas do vendedor. 
     */
    @WebMethod public double getTotalVendasVendedor(String vendedor);
    
    /**
     * Calcula a comissao do vendedor
     * @param vendedor  <b>string</b> - O nome do vendedor.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    @WebMethod public double getTotalComissaoVendasVendedor(String vendedor);
    
    /**
     * Calcula a comissao do vendedor no mes informado.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @param mes <b>int</b> - O mes para calcular a comissao.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    @WebMethod public double getTotalComissaoVendasVendedorMes(String vendedor, int mes);
    
}
