/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.service;

import br.com.poo.business.VendaBusiness;
import javax.jws.WebService;

/**
 * Implementacao do webservice.
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
@WebService(endpointInterface="br.com.poo.vendas.service.IProvedorService")
public class ProvedorService implements IProvedorService {

    /**
     * Calcula o total de vendas em um determinado mes.
     * @param mes <b>int</b> - O mes para calcular o total de vendas.
     * @return <b>double</b> - O total de vendas no mes.
     */
    @Override
    public double getTotalVendaMes(int mes) {
        return new VendaBusiness().getTotalVendaMes(mes);
    }

    /**
     * Calcula o total de vendas do vendedor.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @return <b>double</b> -O total de vendas do vendedor. 
     */
    @Override
    public double getTotalVendasVendedor(String vendedor) {
        return new VendaBusiness().getTotalVendasVendedor(vendedor);
    }

    /**
     * Calcula a comissao do vendedor
     * @param vendedor  <b>string</b> - O nome do vendedor.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    @Override
    public double getTotalComissaoVendasVendedor(String vendedor) {
        return new VendaBusiness().getTotalComissaoVendasVendedor(vendedor);
    }

    /**
     * Calcula a comissao do vendedor no mes informado.
     * @param vendedor <b>string</b> - O nome do vendedor.
     * @param mes <b>int</b> - O mes para calcular a comissao.
     * @return <b>double</b> - A comissao do vendedor. 
     */
    @Override
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes) {
        return new VendaBusiness().getTotalComissaoVendasVendedorMes(vendedor, mes);
    }
    
}
