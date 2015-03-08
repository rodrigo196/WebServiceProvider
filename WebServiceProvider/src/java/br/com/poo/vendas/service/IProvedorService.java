/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author rodrigo
 */
@WebService
public interface IProvedorService {
        
    @WebMethod public double getTotalVendaMes(int mes);
    
    @WebMethod public double getTotalVendasVendedor(String vendedor);
    
    @WebMethod public double getTotalComissaoVendasVendedor(String vendedor);
    
    @WebMethod public double getTotalComissaoVendasVendedorMes(String vendedor, int mes);
    
}
