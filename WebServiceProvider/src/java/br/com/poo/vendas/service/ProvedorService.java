/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.vendas.service;

import br.com.poo.business.VendaBusiness;
import javax.jws.WebService;

/**
 *
 * @author rodrigo
 */
@WebService(endpointInterface="br.com.poo.vendas.service.IProvedorService")
public class ProvedorService implements IProvedorService {

    @Override
    public double getTotalVendaMes(int mes) {
        return new VendaBusiness().getTotalVendaMes(mes);
    }

    @Override
    public double getTotalVendasVendedor(String vendedor) {
        return new VendaBusiness().getTotalVendasVendedor(vendedor);
    }

    @Override
    public double getTotalComissaoVendasVendedor(String vendedor) {
        return new VendaBusiness().getTotalComissaoVendasVendedor(vendedor);
    }

    @Override
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes) {
        return new VendaBusiness().getTotalComissaoVendasVendedorMes(vendedor, mes);
    }
    
}
