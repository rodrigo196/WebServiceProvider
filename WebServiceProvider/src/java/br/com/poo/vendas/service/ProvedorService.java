/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.service;

import javax.jws.WebService;

/**
 *
 * @author rodrigo
 */
@WebService(endpointInterface="br.com.poo.vendas.service.IProvedorService")
public class ProvedorService implements IProvedorService {

    @Override
    public double getTotalVendaMes(int mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalVendasVendedor(String vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalComissaoVendasVendedor(String vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
